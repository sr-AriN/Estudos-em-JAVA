package com.example.padroesdeprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesdeprojetospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesdeprojetospringApplication.class, args);
	}

}
