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

    //@Bean
    public Vehicle getVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audix7");
        return vehicle;
    }

    @Bean
    public Person getPerson() {
        Person person = new Person();
        person.setName("Mohani");
        person.setVehicle(getVehicle());
        return person;
    }
}
