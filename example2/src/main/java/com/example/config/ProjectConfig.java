package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "tesla")
    Vehicle getVehicle() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return veh;
    }

    @Bean(value = "mercedes")
    Vehicle getMercedes() {
        var veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }

    @Bean("audia7")
    Vehicle getAudi() {
        var veh = new Vehicle();
        veh.setName("Audi A7");
        return veh;
    }
}
