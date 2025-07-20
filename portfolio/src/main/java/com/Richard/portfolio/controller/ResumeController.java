package com.Richard.portfolio.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    @GetMapping(produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<Resource> getResume() throws IOException {
        Resource file = new ClassPathResource("static/resume.pdf");
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(file);
    }
}

