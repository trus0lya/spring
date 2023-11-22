package com.example.train.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    private int id;
    private String title;
    private int departureStation;
    private int arrivalStation;
    private Timestamp departureTime;
    private Timestamp arrivalTime;
    private int routeLength;
    private Time duration;
    private int price;
    private int train;
}
