package com.fundoonotesapp.messaging;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.fundoonotesapp.dto.ReminderMessage;

@Component
public class ReminderProducer {

    private static final String QUEUE_NAME = "fundoo.reminder.queue";

    private final JmsTemplate jmsTemplate;

    public ReminderProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendReminder(ReminderMessage message) {

    	  System.out.println("Sending message to JMS queue...");

          jmsTemplate.convertAndSend(QUEUE_NAME, message);

          System.out.println("Message sent to JMS queue successfully");
    }
}