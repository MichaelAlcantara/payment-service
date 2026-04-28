package com.michaelAlcantara.json_consume.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.michaelAlcantara.json_consume.model.Payment;

@Component
public class JsonListener {
	
	private static final Logger log = LogManager.getLogger(JsonListener.class);
	
	@KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
	public void antiFraud(@Payload Payment payment) {
		try {
			log.info("Recebi o pagamento {}", payment.toString());
			Thread.sleep(2000);
			
			log.info("Validando fraude ...");
			Thread.sleep(2000);
			
			log.info("Compra aprovada ...");
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
	public void pdfGenerator() {
		try {
			log.info("Gerando PDF ...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
	public void sendEmail() {
		log.info("Enviando Email de confirmação ...");
	}

}
