package com.fundoonotes.auth.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class PasswordResetProducer {

	private final RabbitTemplate rabbitTemplate;

	public PasswordResetProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendPasswordResetRequest(String email, String resetToken) {

		String messageBody = email + "|" + resetToken;

		rabbitTemplate.convertAndSend("password-reset-queue", messageBody);
	}
}
