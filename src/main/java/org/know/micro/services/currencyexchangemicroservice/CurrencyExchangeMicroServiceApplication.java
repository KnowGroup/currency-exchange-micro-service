package org.know.micro.services.currencyexchangemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeMicroServiceApplication.class, args);
	}

}

