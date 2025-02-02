package com.example.ParkingLot2.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class ParkingSpotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long spotId ;

    public String spotsize ;




}
