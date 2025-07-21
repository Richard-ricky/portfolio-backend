package com.Richard.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/api/info")
    public String getBioInfo() {
        return "Hi, I’m Richard Kwasi Nyarko, a Computer Science graduate with a passion for building modern, scalable web applications. I'm driven by innovation, creativity, and a love for learning.";
    }
}
