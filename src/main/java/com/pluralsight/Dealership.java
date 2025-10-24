package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getVehiclesByPrice() {

    }

    public List<Vehicle> getVehiclesByMakeModel() {

    }

    public List<Vehicle> getVehiclesByYear() {

    }

    public List<Vehicle> getVehiclesByColor() {

    }

    public List<Vehicle> getVehiclesByMileage() {

    }

    public List<Vehicle> getVehiclesByType() {

    }

    public List<Vehicle> getAllVehicles() {

    }

    public void addVehicle(Vehicle vehicle) {

    }

    public void removeVehicle(Vehicle vehicle) {

    }

}
