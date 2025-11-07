package com.example.backend.spring.boot.rabbitmq.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageConsumer {

    @RabbitListener(queues = "${queue.name}")
    public void receiveMessage(String message) {
        log.info("📥 Received message: " + message);
    }
}

