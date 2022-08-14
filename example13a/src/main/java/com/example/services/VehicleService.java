package com.example.services;

import com.example.interfaces.Sound;
import com.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    @Qualifier("ceatTyre")
    private Tyre tyre;

    @Autowired
    @Qualifier("sonySound")
    private Sound sound;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public String makeSound() {
        String makeSound = sound.makeSound();
        //System.out.println("Sound from: " + makeSound);
        return makeSound;
    }

    public String rotate() {
        String tyreRotating = tyre.rotate();
        //System.out.println("Rotating from: " + tyreRotating);
        return tyreRotating;
    }
}
