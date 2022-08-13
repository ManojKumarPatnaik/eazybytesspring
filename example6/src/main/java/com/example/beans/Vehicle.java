package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialization() {
        this.name = "Tesla";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Detryoing Vehicle Bean");
    }

    public String sayHello() {
        return "Hey hope you understood the concept";
    }
}
