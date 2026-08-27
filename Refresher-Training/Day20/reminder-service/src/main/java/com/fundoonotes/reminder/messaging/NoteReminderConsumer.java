package com.fundoonotes.reminder.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoonotes.reminder.service.EmailService;

@Component
public class NoteReminderConsumer {

	private static final Logger log = LoggerFactory.getLogger(NoteReminderConsumer.class);

	private final EmailService emailService;

	public NoteReminderConsumer(EmailService emailService) {
		this.emailService = emailService;
	}

	@RabbitListener(queues = "reminder-queue")
	public void handleReminder(String message) {

		String[] parts = message.split("\\|", 2);
		if (parts.length < 2 || parts[0].isBlank() || parts[1].isBlank()) {
			log.warn("Ignoring malformed reminder message");
			return;
		}

		String noteTitle = parts[0];
		String email = parts[1];

		emailService.sendReminderEmail(email, noteTitle);
	}
}
