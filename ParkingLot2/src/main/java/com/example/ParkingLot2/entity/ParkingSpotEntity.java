package com.example.ParkingLot2.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long spotId ;

    public String spotsize ;

    private Boolean isOccupied ;






}
