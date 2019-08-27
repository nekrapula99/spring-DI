package com.naturalprogrammer.spring5.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender{

	@Autowired
	private static Log Log = LogFactory.getLog(MockMailSender.class);
	
	
	@Override
	public void send(String to, String subject, String body) {
		
		Log.info("sending MOCK mail to " + to);
		Log.info("With Subject " + subject);
		Log.info("and body " + body);
		
	}

}
