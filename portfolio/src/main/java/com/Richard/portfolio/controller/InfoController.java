package com.Richard.portfolio.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/api/info")
    public Map<String, String> getBioInfo() {
        return Map.of(
            "name", "Richard Kwasi Nyarko",
            "bio", "Hi, I’m Richard Kwasi Nyarko, a Computer Science graduate with a passion for building modern, scalable web applications. I'm driven by innovation, creativity, and a love for learning."
        );
    }
}
