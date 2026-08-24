package com.fundoonotesapp.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.fundoonotesapp.config.RabbitMQConfig;
import com.fundoonotesapp.dto.ReminderMessage;

@Component
public class RabbitReminderProducer {

    private final RabbitTemplate rabbitTemplate;

    public RabbitReminderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendReminder(ReminderMessage message) {

        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE_NAME,
                RabbitMQConfig.REMINDER_ROUTING_KEY,
                message
        );

        System.out.println("RabbitMQ message sent successfully");
    }
}