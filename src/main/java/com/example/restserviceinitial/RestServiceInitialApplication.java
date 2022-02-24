package com.example.restserviceinitial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceInitialApplication {

	public static void main(String[] args) {
		app.setDefaultProperties(Collections
          .singletonMap("server.port", "80"));
		SpringApplication.run(RestServiceInitialApplication.class, args);
	}

}
