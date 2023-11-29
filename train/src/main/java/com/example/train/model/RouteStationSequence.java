package com.example.train.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteStationSequence {
    private int id;
    private Route route;
    private Station station;
    private int sequenceNumber;
    private int distanceToNextStation;
    private Time timeToNextStation;
}
