package com.reports.service;

import com.reports.dto.Movements;
import com.reports.dto.Products;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Clase interfaz de servicio para las consultas de los clientes
 */
public interface ConsultService {

	Mono<Products> productXCustomerIdPerson(String customerId);
	
	Mono<Products> productXCustomerIdCompany(String customerId);

	Mono<Movements> movementXAccountId(String id);
	
	Mono<Movements> movementXCreditId(String id);
	
	Mono<Movements> movementXCreditCardId(String id);
	
	Mono<Movements> commissionXAccountId(String id);
	
	Flux<Double> averageBalancesXCustomerIdPerson(String id);
	
}
