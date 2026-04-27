package com.michaelAlcantara.payment_service.model;

import java.io.Serializable;

public class Payment implements Serializable {

	private static final long serialVersionUID = -4039575767676445239L;

	private Long id;
	private Long idUser;
	private Long idProduct;
	private String cardNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

}
