package com.michaelAlcantara.payment_service.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.michaelAlcantara.payment_service.model.Payment;
import com.michaelAlcantara.payment_service.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	private static final Logger log = LogManager.getLogger(PaymentServiceImpl.class);

	@Override
	public void sendPayment(Payment payment) {
		log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
	}

}
