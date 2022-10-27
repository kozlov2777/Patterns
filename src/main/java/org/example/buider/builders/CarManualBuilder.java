package org.example.buider.builders;

import org.example.buider.cars.Car;
import org.example.buider.cars.ManualCar;

public class CarManualBuilder implements Builder{
    private String brand;
    private String model;
    private String numberOfCar;
    private Double volume;

    @Override
    public void setBrand(String brand) {
        this.brand=brand + " Manual";
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
    public ManualCar getResult(){
        return new ManualCar(brand, model,numberOfCar,volume);
    }
}
