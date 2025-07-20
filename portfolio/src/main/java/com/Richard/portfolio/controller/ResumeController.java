package com.Richard.portfolio.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    @GetMapping("/download")
    public ResponseEntity<Resource> downloadResume() throws IOException {
        Resource file = new ClassPathResource("static/resume.pdf");
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=Richard_Kwasi_Nyarko_Resume.pdf")
                .body(file);
    }
}
