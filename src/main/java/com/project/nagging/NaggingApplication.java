package com.project.nagging;

import com.project.nagging.configuration.DefaultConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DefaultConfiguration.class)
public class NaggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaggingApplication.class, args);
	}

}
