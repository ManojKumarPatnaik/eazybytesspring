package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MrfTyre implements Tyre {

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
    public String rotate() {
        return this.name;
    }
}
