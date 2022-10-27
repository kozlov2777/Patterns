package org.example.buider.cars;

public class Car {
    private String brand;
    private String model;
    private String numberOfCar;
    private Double volume;

    public Car(String brand, String model, String numberOfCar, Double volume) {
        this.brand = brand;
        this.model = model;
        this.numberOfCar = numberOfCar;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
