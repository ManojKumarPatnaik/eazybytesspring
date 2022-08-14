package com.example.beans;

import org.springframework.stereotype.Component;

//@Component
public class CeatTyre implements Tyre {

    private String name = "Ceat Tyre";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CeatTyre() {
        System.out.println("Ceat Tyre Initialized");
    }

    @Override
    public String getTyre() {
        return this.name;
    }
}
