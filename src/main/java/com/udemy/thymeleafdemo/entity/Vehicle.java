package com.udemy.thymeleafdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String kw;
    private String year;
    private double engineCapacity;
    private String numberVin;
    private String malfunctionDescription;

    public Vehicle() {

    }

    public Vehicle(int id, String brand, String kw, String year, double engineCapacity, String numberVin, String malfunctionDescription) {
        this.id = id;
        this.brand = brand;
        this.kw = kw;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.numberVin = numberVin;
        this.malfunctionDescription = malfunctionDescription;
    }

    public String getMalfunctionDescription() {
        return malfunctionDescription;
    }

    public void setMalfunctionDescription(String malfunctionDescription) {
        this.malfunctionDescription = malfunctionDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getKw() {
        return kw;
    }

    public void setKw(String kw) {
        this.kw = kw;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getNumberVin() {
        return numberVin;
    }

    public void setNumberVin(String numberVin) {
        this.numberVin = numberVin;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", kw='" + kw + '\'' +
                ", year='" + year + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", numberVin='" + numberVin + '\'' +
                '}';
    }
}
