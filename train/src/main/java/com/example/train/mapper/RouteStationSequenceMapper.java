package com.example.train.mapper;

import com.example.train.entity.RouteStationSequenceEntity;
import com.example.train.entity.StationEntity;
import com.example.train.model.RouteStationSequence;
import com.example.train.model.Station;

import java.util.ArrayList;
import java.util.List;

public class RouteStationSequenceMapper {

    public  RouteStationSequenceEntity stationToRouteStationSequenceEntity
            (RouteStationSequence routeStationSequence) {
        RouteStationSequenceEntity routeStationSequenceEntity = new RouteStationSequenceEntity();
        routeStationSequenceEntity.setId(routeStationSequence.getId());
        routeStationSequenceEntity.setSequenceNumber
                (routeStationSequence.getSequenceNumber());
        routeStationSequenceEntity.setDistanceToNextStation
                (routeStationSequence.getDistanceToNextStation());
        routeStationSequenceEntity.setTimeToNextStation
                (routeStationSequence.getTimeToNextStation());
        routeStationSequenceEntity.setRoute(RouteMapper.RouteToRouteEntity(routeStationSequence.getRoute()));
        routeStationSequenceEntity.setStation(StationMapper.stationToStationEntity(routeStationSequence.getStation()));
        return routeStationSequenceEntity;
    }

    public static RouteStationSequence routeStationSequenceEntityToRouteStationSequence(RouteStationSequenceEntity routeStationSequenceEntity) {
        RouteStationSequence routeStationSequence = new RouteStationSequence();
        routeStationSequence.setId(routeStationSequenceEntity.getId());
        routeStationSequence.setSequenceNumber(routeStationSequenceEntity.getSequenceNumber());
        routeStationSequence.setDistanceToNextStation(routeStationSequenceEntity.getDistanceToNextStation());
        routeStationSequence.setTimeToNextStation(routeStationSequenceEntity.getTimeToNextStation());
        routeStationSequence.setRoute(RouteMapper.routeEntityToRoute(routeStationSequenceEntity.getRoute()));
        routeStationSequence.setStation(StationMapper.stationEntityToStation(routeStationSequenceEntity.getStation()));
        return routeStationSequence;
    }
}

