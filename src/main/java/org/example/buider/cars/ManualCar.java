package org.example.buider.cars;

public class ManualCar {
    private final String brand;
    private final String model;
    private final String numberOfCar;
    private final Double volume;

    public ManualCar(String brand, String model, String numberOfCar, Double volume) {
        this.brand = brand;
        this.model = model;
        this.numberOfCar = numberOfCar;
        this.volume = volume;
    }
    public void print(){
        System.out.println(brand+" "+model+" "+numberOfCar+" "+ volume);
    }

}
