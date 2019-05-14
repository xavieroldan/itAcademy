package com.vehicles.project;

public class Bike extends Vehicle
{

    public Bike(String plate, String brand, String color)
    {
        super(plate, brand, color);
    }

    public void addWheels(Wheel frontWheel, Wheel backWheel) throws Exception
    {
        this.wheels.add(frontWheel);
        this.wheels.add(backWheel);
    }
}
