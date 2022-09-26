package com.example.graphqlspringboothb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.graphqlspringboothb"})
public class GraphqlspringbootHbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlspringbootHbApplication.class, args);
	}

}
