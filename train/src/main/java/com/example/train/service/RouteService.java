package com.example.train.service;

import com.example.train.model.Route;
import com.example.train.model.Station;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public interface RouteService {
    Route getRouteById(int id);
    Route getRouteByTitle(String title);
    Station getDepartureStationByTitle(String title);
    Station getArrivalStationByTitle(String title);
    int getRouteLengthByTitle(String title);
    int getPriceById(int id);
    Timestamp getDepartureTimeById(int id);
    Timestamp getArrivalTimeById(int id);
}
