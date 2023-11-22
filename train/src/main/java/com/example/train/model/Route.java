package com.example.train.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    private int id;
    private String title;
    private int departureStation;
    private int arrivalStation;
    private Time departureTime;
    private Time arrivalTime;
    private int routeLength;
    private Time duration;
    private int price;
    private int train;
}
