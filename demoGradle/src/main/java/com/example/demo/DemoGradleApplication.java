package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGradleApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return String.format("Welcome home!");
	}
	
	@GetMapping("/hello")
	public String hello() {
		return String.format("Hello world");
	}
	
	@GetMapping("/person")
	public String person(@RequestParam(value = "name", defaultValue = "person") String name) {
		return String.format("Hello %s", name);
	}

}
