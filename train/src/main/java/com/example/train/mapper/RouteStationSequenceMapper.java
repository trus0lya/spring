/*
package com.example.train.mapper;

import com.example.train.entity.RouteStationSequenceEntity;
import com.example.train.model.RouteStationSequence;
import com.example.train.model.Station;

public class RouteStationSequenceMapper {
    public static RouteStationSequenceEntity stationToRouteStationSequenceEntity
            (RouteStationSequence routeStationSequence) {
        RouteStationSequenceEntity routeStationSequenceEntity = new RouteStationSequenceEntity();
        routeStationSequenceEntity.setId(routeStationSequence.getId());
        routeStationSequenceEntity.setSequenceNumber
                (routeStationSequence.getSequenceNumber());
        routeStationSequenceEntity.setDistanceToNextStation
                (routeStationSequence.getDistanceToNextStation());
        routeStationSequenceEntity.setTimeToNextStation
                (routeStationSequence.getTimeToNextStation());
        routeStationSequenceEntity.setRoute(routeStationSequence.getRoute());
        return routeStationSequenceEntity;
    }

    public static Station RouteStationSequenceEntityToStation(RouteStationSequenceEntity RouteStationSequenceEntity) {
        Station station = new Station();
        station.setId(RouteStationSequenceEntity.getId());
        station.setTitle(RouteStationSequenceEntity.getTitle());
        station.setStationCode(RouteStationSequenceEntity.getStationCode());
        return station;
    }
}
*/
