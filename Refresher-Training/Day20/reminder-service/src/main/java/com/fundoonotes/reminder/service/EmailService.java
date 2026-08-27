package com.fundoonotes.reminder.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private final JavaMailSender mailSender;

	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendReminderEmail(String email, String noteTitle) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(email);
		message.setSubject("FundooNotes Reminder");
		message.setText("Hello,\n\n" + "This is a reminder for your note:\n\n" + noteTitle + "\n\n" + "Regards,\n" + "FundooNotes");

		mailSender.send(message);
	}

	public void sendPasswordResetEmail(String email, String resetToken) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(email);
		message.setSubject("FundooNotes Password Reset");
		message.setText("Hello,\n\nYour password reset token is:\n\n" + resetToken
				+ "\n\nUse this token to reset your password.\n\nRegards,\nFundooNotes");

		mailSender.send(message);
	}
}
