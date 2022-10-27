package org.example;

import org.example.buider.builders.CarBuilder;
import org.example.buider.builders.CarManualBuilder;
import org.example.buider.cars.Car;
import org.example.buider.cars.ManualCar;
import org.example.buider.director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructTrackCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car.getBrand()+" "+ car.getModel()+" "+car.getNumberOfCar()+" "+car.getVolume());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructCityCar(manualBuilder);
        ManualCar manualCar = manualBuilder.getResult();
        manualCar.print();

        CarManualBuilder manualBuilder1 = new CarManualBuilder();
        director.constructSportCar(manualBuilder1);
        ManualCar manualCar1 = manualBuilder1.getResult();
        manualCar1.print();



    }

}