package com.travelto.travelto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.travelto.travelto.model.entities")
public class TraveltoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraveltoApplication.class, args);
	}
}
