package com.reports.clients;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.reports.clients.config.RestConfig;
import com.reports.dto.Transaction;

import reactor.core.publisher.Flux;

/**
 * Clase de acceso al microservicio de transacciones
 */
@Service
public class TransactionsRestClient {
    RestConfig restConfig = new RestConfig();
	
	public Flux<Transaction> getAllXProductId(String id) {
		WebClient webClient = WebClient.create("http://localhost:8086");
        return  webClient.get()
                .uri("/transaction/product/"+id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToFlux(Transaction.class);
	}
}
