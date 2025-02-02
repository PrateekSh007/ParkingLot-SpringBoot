package com.example.ParkingLot2.model;

import com.example.ParkingLot2.ParkingLot2Application;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ParkingSpot {

    public long spotId ;
    public String spotSize ;
    public Boolean isOccupied ;



    public ParkingSpot (long spotId , String spotSize) {
        this.spotId = spotId ;
        this.spotSize = spotSize ;
        this.isOccupied = false ;
    }

}
