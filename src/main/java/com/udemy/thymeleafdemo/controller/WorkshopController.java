package com.udemy.thymeleafdemo.controller;

import com.udemy.thymeleafdemo.entity.Vehicle;
import com.udemy.thymeleafdemo.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/vehicles")
public class WorkshopController {

    private VehicleService vehicleService;

    public WorkshopController(VehicleService theVehicleService) {
        vehicleService = theVehicleService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        List<Vehicle> theVehicles = vehicleService.findAll();

        theModel.addAttribute("vehicles", theVehicles);

        return "list-vehicles";
    }
}
