package com.example.train.mapper;

import com.example.train.entity.RoutesEntity;
import com.example.train.model.Route;
import com.example.train.service.StationService;
import com.example.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class RouteMapper {

    private final TrainService trainService;
    private final StationService stationService;

    @Autowired
    public RouteMapper(TrainService trainService, StationService stationService) {
        this.trainService = trainService;
        this.stationService = stationService;
    }

    public  RoutesEntity RouteToRouteEntity (Route route) {
        RoutesEntity routeEntity = new RoutesEntity();
        routeEntity.setId(route.getId());
        routeEntity.setTitle(route.getTitle());
        routeEntity.setDepartureStation(StationMapper.
                stationToStationEntity(stationService.
                        getStationById(route.getDepartureStation())));
        routeEntity.setArrivalStation(StationMapper.
                stationToStationEntity(stationService.
                        getStationById(route.getArrivalStation())));
        routeEntity.setDepartureTime(route.getDepartureTime());
        routeEntity.setArrivalTime(route.getArrivalTime());
        routeEntity.setRouteLength(route.getRouteLength());
        routeEntity.setDuration(route.getDuration());
        routeEntity.setPrice(route.getPrice());
        routeEntity.setTrain(TrainMapper.trainToTrainEntity(trainService.getTrainById(route.getTrain())));
        return routeEntity;
    }



    public  Route routeEntityToRoute(RoutesEntity routeEntity) {
        Route route = new Route();
        route.setId(routeEntity.getId());
        route.setTitle(routeEntity.getTitle());
        route.setDepartureStation(routeEntity.getDepartureStation().getId());
        route.setArrivalStation(routeEntity.getArrivalStation().getId());
        route.setDepartureTime(routeEntity.getDepartureTime());
        route.setArrivalTime(routeEntity.getArrivalTime());
        route.setRouteLength(routeEntity.getRouteLength());
        route.setDuration(routeEntity.getDuration());
        route.setPrice(routeEntity.getPrice());
        route.setTrain(routeEntity.getTrain().getId());
        return route;
    }
}

