package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MrfTyre implements Tyre{

    private String name = "MRF Tyre";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MrfTyre() {
        System.out.println("MRF Tyre Initialized");
    }

    @Override
    public String getTyre() {
        return this.name;
    }
}
