package com.nxjava.myapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address){};
record Address (String firstLine, String City){};


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "ARSLAN";
    }
    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Amir", 22, new Address("Darya", "Lahijan"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(), address()); // name, age
    }

    @Bean
    public Person person3Parameters(String name, int age, Address neshani){
        return new Person(name, age, neshani); // name, age
    }

    @Bean(name = "neshani")
    public Address address(){
        return new Address("Azadi St.", "Tehran");
    }

}

