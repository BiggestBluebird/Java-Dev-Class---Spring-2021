package com.batson_java_course_2021.IMDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ImdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbApplication.class, args);
	}

	@GetMapping
	public String landingPage() {
		return "<h1>Take your hands off me! You damn dirty ape.<h1>";
	}
}
