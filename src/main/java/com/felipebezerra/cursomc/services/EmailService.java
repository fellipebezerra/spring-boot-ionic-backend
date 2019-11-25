package com.felipebezerra.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.felipebezerra.cursomc.domain.Cliente;
import com.felipebezerra.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
