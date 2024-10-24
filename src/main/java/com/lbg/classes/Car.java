package com.lbg.classes;

public class Car {

    public Car (String model) {
        this.setModel(model);
    }

    public Car () {
        this.make = "Unknown";
        this.setModel("Unknown");
    }
    private int speed;
    private String make;
    private CarColour colour;



    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    private String model;

    public int getSpeed() {
        return this.speed;
    }

    public String getMake() {
        return this.make;
    }

    public CarColour getColour() {
        return this.colour;
    }

    public CarColour setColour (CarColour newColour) {
        return this.colour = newColour;
    }

    public void accelerate (int deltaV) {
        if(deltaV > 0) {
            this.speed += deltaV;
        }
    }

    public void decelerate (int deltaV) {
        if (deltaV < 0) {
            this.accelerate(-deltaV);
        }


    }




}
