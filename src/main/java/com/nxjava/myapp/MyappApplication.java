package com.nxjava.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);

        // 1: Launch Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Config things that Spring manages - @Configuration
        System.out.println(context.getBean("name"));
    }

}
