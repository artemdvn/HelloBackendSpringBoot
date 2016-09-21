package helloBackendSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("helloBackendSpringBoot.service")
@ComponentScan("helloBackendSpringBoot.dao")
public class HelloBackendSpringBootApplication {	

	public static void main(String[] args) {
		SpringApplication.run(HelloBackendSpringBootApplication.class, args);
	}
	
}
