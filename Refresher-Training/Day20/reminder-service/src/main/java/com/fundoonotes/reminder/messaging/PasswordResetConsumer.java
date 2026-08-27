package com.fundoonotes.reminder.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoonotes.reminder.service.EmailService;

@Component
public class PasswordResetConsumer {

	private static final Logger log = LoggerFactory.getLogger(PasswordResetConsumer.class);

	private final EmailService emailService;

	public PasswordResetConsumer(EmailService emailService) {
		this.emailService = emailService;
	}

	@RabbitListener(queues = "password-reset-queue")
	public void handlePasswordResetRequest(String messageBody) {

		String[] parts = messageBody.split("\\|", 2);
		if (parts.length < 2 || parts[0].isBlank() || parts[1].isBlank()) {
			log.warn("Ignoring malformed password reset message");
			return;
		}

		String email = parts[0];
		String resetToken = parts[1];

		emailService.sendPasswordResetEmail(email, resetToken);
	}
}
