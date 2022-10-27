package org.example.buider.builders;

import org.example.buider.builders.Builder;
import org.example.buider.cars.Car;

public class CarBuilder implements Builder {
    private String brand;
    private String model;
    private String numberOfCar;
    private Double volume;

    @Override
    public void setBrand(String brand) {
        this.brand=brand;
    }

    @Override
    public void setModel(String model) {
        this.model=model;
    }

    @Override
    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar=numberOfCar;
    }

    @Override
    public void setVolume(Double volume) {
        this.volume=volume;
    }
    public Car getResult(){
        return new Car(brand, model,numberOfCar,volume);
    }
}
