package com.epiuse.recruiting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

@EntityScan("com.epiuse.recruiting.entity")
@SpringBootApplication
public class ApptitudeApplication {

	public static void main(String[] args) {
	 SpringApplication.run(ApptitudeApplication.class, args);
	
	}

}
