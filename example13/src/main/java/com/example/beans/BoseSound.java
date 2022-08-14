package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BoseSound implements Sound{

    private String name = "Bose Sound";

    public BoseSound() {
        System.out.println("Bose Sound Initialized");
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
