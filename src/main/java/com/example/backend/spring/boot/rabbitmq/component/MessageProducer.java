package com.example.backend.spring.boot.rabbitmq.component;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageProducer {

    private final RabbitTemplate rabbitTemplate;

    @Value("${queue.name}")
    private String queueName;

    public void sendMessage(String message) {
        System.out.println("📤 Sending message: " + message);
        rabbitTemplate.convertAndSend(queueName, message);
    }
}

