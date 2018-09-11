package com.techpro.swagger.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomController {

	@GetMapping(value = "/api/random")
	public int random() {
		return new Random().nextInt();
	}
}
