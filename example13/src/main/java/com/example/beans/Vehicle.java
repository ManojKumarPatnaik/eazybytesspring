package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Vehicle {

    private String name = "cooper";

    public Vehicle() {
        System.out.println("Vehicle Instance initialition");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 }
