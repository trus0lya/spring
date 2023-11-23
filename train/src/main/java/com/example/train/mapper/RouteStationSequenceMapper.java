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
        List<StationEntity> stationEntities = new ArrayList<>();
        for(int i = 0; i < routeStationSequence.getStations().size(); ++i) {
            stationEntities.add(StationMapper.stationToStationEntity(routeStationSequence.getStations().get(i)));
        }
        routeStationSequenceEntity.setStation(stationEntities);
        return routeStationSequenceEntity;
    }

    public static RouteStationSequence routeStationSequenceEntityToRouteStationSequence(RouteStationSequenceEntity routeStationSequenceEntity) {
        RouteStationSequence routeStationSequence = new RouteStationSequence();
        routeStationSequence.setId(routeStationSequenceEntity.getId());
        routeStationSequence.setSequenceNumber(routeStationSequenceEntity.getSequenceNumber());
        routeStationSequence.setDistanceToNextStation(routeStationSequenceEntity.getDistanceToNextStation());
        routeStationSequence.setTimeToNextStation(routeStationSequenceEntity.getTimeToNextStation());
        routeStationSequence.setRoute(RouteMapper.routeEntityToRoute(routeStationSequenceEntity.getRoute()));
        List<Station> stations = new ArrayList<>();
        for(int i = 0; i < routeStationSequenceEntity.getStation().size(); ++i) {
            stations.add(StationMapper.stationEntityToStation(routeStationSequenceEntity.getStation().get(i)));
        }
        routeStationSequence.setStations(stations);
        return routeStationSequence;
    }
}

