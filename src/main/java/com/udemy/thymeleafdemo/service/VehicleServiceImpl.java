package com.udemy.thymeleafdemo.service;

import com.udemy.thymeleafdemo.entity.Vehicle;
import com.udemy.thymeleafdemo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository theVehicleRepository) {
        vehicleRepository = theVehicleRepository;
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle findById(int theId) {
        return null;
    }

    public Vehicle findById(Long theId) {
        Optional<Vehicle> result = vehicleRepository.findById(theId);

        Vehicle theVehicle = null;

        if (result.isPresent()) {
            theVehicle = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theVehicle;
    }

    @Override
    public void save(Vehicle theVehicle) {
        vehicleRepository.save(theVehicle);
    }

    @Override
    public void deleteById(int theId) {
        vehicleRepository.deleteById((long) theId);
    }

}

