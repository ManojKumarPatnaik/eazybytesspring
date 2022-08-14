package com.example.implementations;

import com.example.interfaces.Sound;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SonySound implements Sound {

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
    public String makeSound() {
        return this.name;
    }
}
