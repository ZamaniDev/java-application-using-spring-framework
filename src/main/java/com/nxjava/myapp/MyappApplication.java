package com.nxjava.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class MyappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);

        // 1: Launch Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Config things that Spring manages - @Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println("person2MethodCall---- "+context.getBean("person2MethodCall"));
        System.out.println("person3Parameters---- "+context.getBean("person3Parameters"));
        System.out.println(context.getBean(Address.class));
        // --------------------------------------------
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }

}
