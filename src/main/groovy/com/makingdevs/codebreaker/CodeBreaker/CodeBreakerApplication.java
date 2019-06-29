package com.makingdevs.codebreaker.CodeBreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.makingdevs"})
public class CodeBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeBreakerApplication.class, args);
	}

}
