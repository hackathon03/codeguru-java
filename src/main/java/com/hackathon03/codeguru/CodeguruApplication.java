package com.hackathon03.codeguru;

import com.hackathon03.codeguru.exception.CustomException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeguruApplication {

	public static void main(String[] args) {

		analyze();
		SpringApplication.run(CodeguruApplication.class, args);
	}


	public static void analyze(){
		//S1
		if("1" == "2"){
			System.out.println("This is not reachable");
		}
		//S2
		CustomException ex= new CustomException();

	}

}
