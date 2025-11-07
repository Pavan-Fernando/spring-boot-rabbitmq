package com.example.backend.spring.boot.rabbitmq.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @RabbitListener(queues = "${queue.name}")
    public void receiveMessage(String message) {
        System.out.println("📥 Received message: " + message);
    }
}

