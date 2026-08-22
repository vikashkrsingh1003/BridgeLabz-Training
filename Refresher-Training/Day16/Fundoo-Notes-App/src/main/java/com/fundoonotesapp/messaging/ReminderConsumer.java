package com.fundoonotesapp.messaging;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fundoonotesapp.dto.ReminderMessage;
import com.fundoonotesapp.service.EmailService;

@Component
public class ReminderConsumer {

    private final EmailService emailService;

    public ReminderConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @JmsListener(destination = "fundoo.reminder.queue")
    public void receiveReminder(ReminderMessage message) {

        System.out.println("Reminder received from JMS queue");

        System.out.println("Email: " + message.getEmail());

        System.out.println("Message: " + message.getMessage());

        // Send actual email
        emailService.sendEmail(
                message.getEmail(),
                "Fundoo Notes - Password Reset",
                message.getMessage()
        );

        System.out.println("Password reset email sent successfully");
    }
}