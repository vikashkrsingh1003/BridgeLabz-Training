package com.fundoonotesapp.messaging;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fundoonotesapp.dto.ReminderMessage;
import com.fundoonotesapp.service.EmailService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ReminderConsumer {

	private final EmailService emailService;

	public ReminderConsumer(EmailService emailService) {
		this.emailService = emailService;
	}

	@JmsListener(destination = "fundoo.reminder.queue")
	public void receiveReminder(ReminderMessage message) {

		log.info("Reminder received from JMS queue");

		log.info("Email: " + message.getEmail());

		log.info("Message: " + message.getMessage());

		// Send actual email
		emailService.sendEmail(message.getEmail(), "Fundoo Notes - Password Reset", message.getMessage());

		log.info("Password reset email sent successfully");
	}
}