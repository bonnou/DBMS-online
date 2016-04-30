package net.in.ahr.dbmsOnline.sample01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class HelloApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World! heroku";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
