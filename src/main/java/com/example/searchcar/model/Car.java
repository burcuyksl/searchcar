package com.example.searchcar.model;

import lombok.Data;

@Data
public class Car {
    private String brand;
    private String model;
    private String segment;

    public Car(){}
    public Car(String brand, String model, String segment) {
        this.brand=brand;
        this.model=model;
        this.segment=segment;
    }
    public Car(String brand){
        this.brand = brand;
    }
}
