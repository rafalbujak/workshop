package com.udemy.thymeleafdemo.repository;

import com.udemy.thymeleafdemo.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
