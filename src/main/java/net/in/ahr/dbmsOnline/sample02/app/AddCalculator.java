package net.in.ahr.dbmsOnline.sample02.app;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class AddCalculator implements Calculator {

	@Override
	public int calc(int a, int b) {
		return a + b;
	}
/*
	public static void main(String[] args) {
		SpringApplication.run(AddCalculator.class, args);
	}
*/
}
