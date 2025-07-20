package com.Richard.portfolio.controller;

import com.Richard.portfolio.model.Message;
import com.Richard.portfolio.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private MessageRepository messageRepository;

    @PostMapping
    public Message submitMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }
}
