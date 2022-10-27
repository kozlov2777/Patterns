package org.example.buider.director;

import org.example.buider.builders.Builder;

public class Director {
    public void constructCityCar(Builder builder){
        builder.setBrand("Volvo");
        builder.setModel("First");
        builder.setNumberOfCar("2777");
        builder.setVolume(2.0);
    }
    public void constructTrackCar(Builder builder){
        builder.setBrand("Volvo");
        builder.setModel("Track");
        builder.setNumberOfCar("5665");
        builder.setVolume(5.8);
    }
    public void constructSportCar(Builder builder){
        builder.setBrand("Volvo");
        builder.setModel("Second");
        builder.setNumberOfCar("2156");
    }
}
