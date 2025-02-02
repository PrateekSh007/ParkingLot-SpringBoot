package com.example.ParkingLot2.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
abstract class Vehicle {

    private long vehicleID ;
    private VehicleType vehicleType ;
    private String color ;

}
