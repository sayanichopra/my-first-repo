package com.hello.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldApplication.class, args);
	}

	// @GetMapping("/")
	// public String hello() {
	// return "Hello, World!heelo world ";
	// }

	// @GetMapping("/sayani")
	// public String Yes() {
	// return "this is my first change";
	// }
}