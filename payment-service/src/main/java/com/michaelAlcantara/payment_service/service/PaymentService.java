package com.michaelAlcantara.payment_service.service;

import com.michaelAlcantara.payment_service.model.Payment;

public interface PaymentService {
	
	void sendPayment(Payment payment);

}
