package com.example.beans;

import org.springframework.stereotype.Component;


public class SonySound implements Sound{

    private String name = "Sony Sound";

    public SonySound() {
        System.out.println("Sony Sound initialized");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSound() {
        return this.name;
    }
}
