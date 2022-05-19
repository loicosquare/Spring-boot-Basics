package com.example.demoFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFinalApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Salut";
	}

}
