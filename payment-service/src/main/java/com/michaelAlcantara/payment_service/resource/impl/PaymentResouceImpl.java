package com.michaelAlcantara.payment_service.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michaelAlcantara.payment_service.model.Payment;
import com.michaelAlcantara.payment_service.resource.PaymentResource;
import com.michaelAlcantara.payment_service.service.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResouceImpl implements PaymentResource{
	
	@Autowired
	private PaymentService paymentService;

	@Override
	public ResponseEntity<Payment> playment(Payment playment) {
		paymentService.sendPayment(playment);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
