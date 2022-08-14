package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi1");
        return veh;
    }

    @Bean
    @Primary
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda2");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari3");
        return veh;
    }
}
