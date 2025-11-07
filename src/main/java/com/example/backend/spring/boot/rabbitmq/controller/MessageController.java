package com.example.backend.spring.boot.rabbitmq.controller;

import com.example.backend.spring.boot.rabbitmq.component.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageProducer producer;

    @PostMapping
    public ResponseEntity<String> send(@RequestBody String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent successfully!");
    }
}

