package com.Richard.portfolio.controller;

import com.Richard.portfolio.model.ContactMessage;
import com.Richard.portfolio.repository.ContactMessageRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactMessageRepository repository;

    @PostMapping
    public ResponseEntity<?> sendMessage(@Valid @RequestBody ContactMessage message) {
        return ResponseEntity.ok(repository.save(message));
    }
}

