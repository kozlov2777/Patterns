package org.example;

import org.example.buider.builders.CarBuilder;
import org.example.buider.builders.CarManualBuilder;
import org.example.buider.cars.Car;
import org.example.buider.cars.ManualCar;
import org.example.buider.director.Director;

public class Main {
    public static void main(String[] args) {
        //Builder
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

      //Singleton
//    public static void main(String[] args) {
//        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
//                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
//                "RESULT:" + "\n");
//        Singleton singleton = Singleton.getInstance("FOO");
//        Singleton anotherSingleton = Singleton.getInstance("BAR");
//        System.out.println(singleton.value);
//        System.out.println(anotherSingleton.value);
//    }