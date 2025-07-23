package com.Richard.portfolio.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    @GetMapping("/download")
    public ResponseEntity<Resource> downloadResume() {
        Resource file = new ClassPathResource("static/resume.pdf");

        if (!file.exists()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=Richard_Kwasi_Nyarko_Resume.pdf")
                .body(file);
    }
}
