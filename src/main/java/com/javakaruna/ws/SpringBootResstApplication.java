package com.javakaruna.ws;


import com.javakaruna.ws.employees.GetEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootResstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootResstApplication.class, args);
	}
	@Autowired
	private SoapClinet clinet;

	@GetMapping ("/records")
	public GetEmployeeResponse getEmployee() {
		return clinet.getEmployee();
	}




}
