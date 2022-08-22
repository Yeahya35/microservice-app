package com.moduleSystem.service.controller;

import com.moduleSystem.service.dto.SimpleEmailDTO;
import com.moduleSystem.service.emailService.EmailSenderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/email")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    public EmailSenderController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send")
    public ResponseEntity<?> send(@RequestBody SimpleEmailDTO simpleEmailDTO) {
        emailSenderService.sendSimpleEmail(simpleEmailDTO);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}