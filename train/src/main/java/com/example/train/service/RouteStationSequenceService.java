package com.example.train.service;


import com.example.train.model.Route;
import com.example.train.model.RouteStationSequence;
import com.example.train.model.Station;

import java.util.List;

public interface RouteStationSequenceService {
    RouteStationSequence getRouteStationSequenceById(int id);
    Route getRouteByRouteStationSequenceById(int id);
  //  List<Station> getStationsByRouteStationSequenceById(int id);
}
