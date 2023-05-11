package com.microservice.notificationservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.microservice.notificationservices.dto.EmailDto;
@Service
public class EmailService {
	
	@KafkaListener(topics = "emailTemplate")
	public void handleNotification(EmailDto emailDto) {
		sendEmail(emailDto);
	}
	
	
	
	@Autowired
	private JavaMailSender javaMailSender;

	public String sendEmail(EmailDto dto) {
		try {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(dto.getRecepientMailId());
		message.setFrom(dto.getSenderMailId());
		message.setSubject(dto.getSubject());
	 	message.setText(dto.getMailBodyContent());
		
			javaMailSender.send(message);
			return "success";
		}catch (Exception e) {
			return e.getMessage();
		}		
		
	}

}
