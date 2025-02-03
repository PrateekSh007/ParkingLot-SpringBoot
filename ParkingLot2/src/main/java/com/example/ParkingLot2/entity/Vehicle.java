package com.example.ParkingLot2.entity;


import com.example.ParkingLot2.model.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vehicleId ;

    private String color  ;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType ;

    @ManyToOne()




}
