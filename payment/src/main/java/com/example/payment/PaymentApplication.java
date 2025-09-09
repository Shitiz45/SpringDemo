package com.example.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

	// private final paymentService paymentService;
	// public PaymentApplication(paymentService paymentService) {
	// this.paymentService = paymentService;
	// paymentService.pay();
	// }

	@Autowired
	private PaymentService paymentService;

	@Override
	public void run(String... args) {
		System.out.println(paymentService.pay());
	}

}
