package com.fundoonotesapp.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoonotesapp.config.RabbitMQConfig;
import com.fundoonotesapp.dto.ReminderMessage;

@Component
public class RabbitReminderConsumer {

    @RabbitListener(queues = RabbitMQConfig.REMINDER_QUEUE)
    public void receiveReminder(ReminderMessage message) {

        System.out.println("RabbitMQ reminder received");

        System.out.println("Email: " + message.getEmail());

        System.out.println("Message: " + message.getMessage());
    }
}