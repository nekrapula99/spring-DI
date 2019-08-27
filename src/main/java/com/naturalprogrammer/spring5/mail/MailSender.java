package com.naturalprogrammer.spring5.mail;

public interface MailSender {
	
	void send(String to, String subject, String body);
	

}
