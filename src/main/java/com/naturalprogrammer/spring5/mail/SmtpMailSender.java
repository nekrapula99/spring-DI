package com.naturalprogrammer.spring5.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("smtp")
public class SmtpMailSender implements MailSender{

	private static Log Log = LogFactory.getLog(SmtpMailSender.class);
	
	
	@Override
	public void send(String to, String subject, String body) {
		
		Log.info("sending MOCK mail to " + to);
		Log.info("With Subject " + subject);
		Log.info("and body " + body);
		
	}

}
