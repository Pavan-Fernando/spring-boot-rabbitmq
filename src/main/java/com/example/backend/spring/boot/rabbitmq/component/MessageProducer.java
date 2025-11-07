package com.example.backend.spring.boot.rabbitmq.component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageProducer {

    private final RabbitTemplate rabbitTemplate;

    @Value("${queue.name}")
    private String queueName;

    public void sendMessage(String message) {
        log.info("📤 Sending message: " + message);
        rabbitTemplate.convertAndSend(queueName, message);
    }
}

