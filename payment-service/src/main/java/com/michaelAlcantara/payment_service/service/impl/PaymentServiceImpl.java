package com.michaelAlcantara.payment_service.service.impl;

import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.michaelAlcantara.payment_service.model.Payment;
import com.michaelAlcantara.payment_service.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	private static final Logger log = LogManager.getLogger(PaymentServiceImpl.class);

	@Autowired
	private KafkaTemplate<String, Serializable> kafkaTemplate;

	@Override
	public void sendPayment(Payment payment) {
		log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
		try {

			Thread.sleep(1000);

			log.info("Enviando Pagamento ...");

			kafkaTemplate.send("payment-topic", payment);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
