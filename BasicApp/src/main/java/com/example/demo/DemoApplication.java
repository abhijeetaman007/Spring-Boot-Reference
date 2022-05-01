package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public List<Student> hello(){
////		return List.of("Hello World"," SpringBoot");
//		return List.of(
//				new Student(
//						1L,
//						"Abhijeet",
//						"abhijeet.sinha@test.com",
//						LocalDate.of(2001, Month.MARCH,5),
//						21
//				)
//		);
//	}
}

//General Flow
//Client -> API Layer -> ServiceLayer -> DataAccessLayer