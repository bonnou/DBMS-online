package net.in.ahr.dbmsOnline.sample02;

import net.in.ahr.dbmsOnline.sample02.app.Argument;
import net.in.ahr.dbmsOnline.sample02.app.ArgumentResolver;
import net.in.ahr.dbmsOnline.sample02.app.Calculator;
import net.in.ahr.dbmsOnline.sample02.app.Frontend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

@EnableAutoConfiguration
@ComponentScan
//@Import(AppConfig.class)
public class App02 implements CommandLineRunner{
    @Autowired
    ArgumentResolver argumentResolver;
    @Autowired
    Calculator calculator;

    @Override
    public void run(String... strings) {
        System.out.print("Enter 2 numbers like 'a b' : ");
        Argument argument = argumentResolver.resolve(System.in);
        int result = calculator.calc(argument.getA(), argument.getB());
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
/*
        try (ConfigurableApplicationContext context = SpringApplication.run(App02.class, args)) {
            Frontend frontend = context.getBean(Frontend.class);
            frontend.run();
        }
*/
        SpringApplication.run(App02.class, args);
    }
}
