package com.naturalprogrammer.spring5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring5.mail.MailSender;
import com.naturalprogrammer.spring5.mail.MockMailSender;

@RestController
public class MailController {
	
	private MailSender mailsEnder;
	
	/*Solution to multiples injection problem
	 * Put parameter with the same name like Bean in this case 
	 * smtpMailSender in lowercase
	 */
		
	public MailController(MailSender smtp) { 
		super();
		this.mailsEnder = smtp;
	}



	@RequestMapping("/mail")
	public String mail() {
		mailsEnder.send("nelson.osorio9112@gmail.com", "test email Spring", "Hola como estas?");
		
		return "Mail Sent!";
	}

}
