package com.springcloud.microservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springcloud.microservices.model.CurrencyExchange;

@Component
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	Optional<CurrencyExchange> findFirstByFromAndTo(String from , String to);

}
