package com.springcloud.microservices.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CurrencyExchange {

	@Id
	@GeneratedValue
	private Long ID;
	@Column(name = "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	@Column(name = "port")
	private String environment;

	public CurrencyExchange() {

	}

	public CurrencyExchange(Long iD, String from, String to, BigDecimal conversionMultiple) {
		super();
		ID = iD;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

}
