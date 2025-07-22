package com.Richard.portfolio.controller;

import com.Richard.portfolio.model.Message;
import com.Richard.portfolio.repository.MessageRepository;
import com.Richard.portfolio.service.MailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private MailService mailService;

    @PostMapping
    public Message submitMessage(@RequestBody Message message) throws MessagingException {
        Message saved = messageRepository.save(message);

        mailService.sendMail(
            "your-email@gmail.com",  // ⬅️ Your receiving Gmail address
            "New Contact Message from " + message.getName(),
            "<p><strong>Name:</strong> " + message.getName() + "</p>" +
            "<p><strong>Email:</strong> " + message.getEmail() + "</p>" +
            "<p><strong>Message:</strong><br/>" + message.getContent() + "</p>"
        );

        return saved;
    }
}
