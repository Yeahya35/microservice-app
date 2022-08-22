package com.moduleSystem.service.emailService;

import com.moduleSystem.service.dto.SimpleEmailDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Sink.class)
public class EmailSenderService {
    //dnzgkcn25@gmail.com
    @Autowired
    private JavaMailSender mailSender;

    @StreamListener(Sink.INPUT)
    public void sendSimpleEmail(SimpleEmailDTO simpleEmailDTO) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("matrimtheraven@gmail.com");
        message.setTo(simpleEmailDTO.getSendTo());
        message.setText(simpleEmailDTO.getBody());
        message.setSubject(simpleEmailDTO.getSubject());

        mailSender.send(message);
        System.out.println("Mail Send...");
    }
}