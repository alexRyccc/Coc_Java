package com.coc.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.coc.game")
public class CocGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(CocGameApplication.class, args);
	}

}
