package com.udemy.thymeleafdemo.controller;

import com.udemy.thymeleafdemo.entity.Vehicle;
import com.udemy.thymeleafdemo.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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

        return "vehicles/list-vehicles";
    }

    @GetMapping("/showFormForAddVehicle")
    public String showFormForAddVehicle(Model model) {
        Vehicle theVehicle = new Vehicle();

        model.addAttribute("vehicle", theVehicle);
        return "vehicles/vehicle-form";
    }

    @GetMapping("/save")
    public String saveVehicle(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "vehicles/vehicle-form";
    }

    @PostMapping("/save")
    public String saveVehicle(@ModelAttribute @Valid Vehicle vehicle,
                              BindingResult bindResult) {
        if (bindResult.hasErrors())
            return "vehicles/vehicle-form";
        else {
            vehicleService.save(vehicle);
            return "redirect:/vehicles/list";
        }
    }
}
