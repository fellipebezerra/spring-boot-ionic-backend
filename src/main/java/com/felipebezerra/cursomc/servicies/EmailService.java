package com.felipebezerra.cursomc.servicies;

import org.springframework.mail.SimpleMailMessage;

import com.felipebezerra.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
