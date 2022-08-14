package com.example.beans;

import com.example.interfaces.Sound;
import com.example.interfaces.Tyre;
import com.example.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "cooper";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        System.out.println("Vehicle Instance initialition");
        this.vehicleService = vehicleService;
    }
    public String getName() {
        return name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public void setName(String name) {
        this.name = name;
    }
}
