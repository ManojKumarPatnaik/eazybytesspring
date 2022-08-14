package com.example.implementations;

import com.example.interfaces.Sound;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSound implements Sound {

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
    public String makeSound() {
        return this.name;
    }
}
