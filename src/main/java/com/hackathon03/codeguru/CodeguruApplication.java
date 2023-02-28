package com.hackathon03.codeguru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeguruApplication {

	public static void main(String[] args) {
		//S1
		if("1" == "2"){
			System.out.println("This is not reachable");
		}
		
		SpringApplication.run(CodeguruApplication.class, args);
	}

}
