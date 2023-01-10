package com.springcloud.microservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcloud.microservices.exception.ResourceNotFoundException;
import com.springcloud.microservices.model.CurrencyExchange;
import com.springcloud.microservices.repository.CurrencyExchangeRepository;

@Component
public class CurrencyExchangeService {
	
	@Autowired
	CurrencyExchangeRepository currencyExchangeRepository;
	
	public CurrencyExchange getCurrencyExchangeValue(String from , String to) {
		Optional<CurrencyExchange> currencyExchangeOpt = currencyExchangeRepository.findFirstByFromAndTo(from, to);
		if(!currencyExchangeOpt.isPresent()) {
			throw new  ResourceNotFoundException("this currency exchange not found"); 
		}
		return currencyExchangeOpt.get();
	}

}
