package com.jhaircjxd.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ExpensetrackerApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

		dotenv.entries().forEach(entry -> {
			String key = entry.getKey();
			String value = entry.getValue();
			System.setProperty(key, value);
		});
		SpringApplication.run(ExpensetrackerApplication.class, args);
	}

}
