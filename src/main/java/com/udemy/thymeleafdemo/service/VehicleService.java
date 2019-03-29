package com.udemy.thymeleafdemo.service;

import com.udemy.thymeleafdemo.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> findAll();

    Vehicle findById(int theId);

    void save(Vehicle theVehicle);

    void deleteById(int theId);
}
