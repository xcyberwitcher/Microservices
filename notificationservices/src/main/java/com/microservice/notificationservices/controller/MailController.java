package com.microservice.notificationservices.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.notificationservices.constant.AppConst;
import com.microservice.notificationservices.dto.EmailDto;
import com.microservice.notificationservices.service.EmailService;
@RestController
@RequestMapping(value =AppConst.NOTIFICATION_MAPPING)
public class MailController {
	@Autowired
	private EmailService emailService;
	
	@PostMapping(value = AppConst.MAIL_SENDER)
	public String sendEmail(@RequestBody EmailDto dto) {
		return emailService.sendEmail(dto); 
	}	
}
