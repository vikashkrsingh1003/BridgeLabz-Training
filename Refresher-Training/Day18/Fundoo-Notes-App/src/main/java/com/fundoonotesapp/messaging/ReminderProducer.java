package com.fundoonotesapp.messaging;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.fundoonotesapp.dto.ReminderMessage;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ReminderProducer {

    private static final String QUEUE_NAME = "fundoo.reminder.queue";

    private final JmsTemplate jmsTemplate;

    public ReminderProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendReminder(ReminderMessage message) {

    	  log.info("Sending message to JMS queue...");

          jmsTemplate.convertAndSend(QUEUE_NAME, message);

         log.info("Message sent to JMS queue successfully");
    }
}