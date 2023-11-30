package com.example.train.mapper;

import com.example.train.entity.RoutesEntity;
import com.example.train.model.Route;
import org.springframework.stereotype.Component;
@Component
public class RouteMapper {


    public static RoutesEntity RouteToRouteEntity (Route route) {
        RoutesEntity routeEntity = new RoutesEntity();
        routeEntity.setId(route.getId());
        routeEntity.setTitle(route.getTitle());
        routeEntity.setDepartureStation(StationMapper.stationToStationEntity(route.getDepartureStation()));
        routeEntity.setArrivalStation(StationMapper.stationToStationEntity(route.getArrivalStation()));
        routeEntity.setDepartureTime(route.getDepartureTime());
        routeEntity.setArrivalTime(route.getArrivalTime());
        routeEntity.setRouteLength(route.getRouteLength());
        routeEntity.setDuration(route.getDuration());
        routeEntity.setPrice(route.getPrice());
        routeEntity.setTrain(TrainMapper.trainToTrainEntity(route.getTrain()));
        return routeEntity;
    }

    public static  Route routeEntityToRoute(RoutesEntity routeEntity) {
        Route route = new Route();
        route.setId(routeEntity.getId());
        route.setTitle(routeEntity.getTitle());
        route.setDepartureStation(StationMapper.stationEntityToStation(routeEntity.getDepartureStation()));
        route.setArrivalStation(StationMapper.stationEntityToStation(routeEntity.getArrivalStation()));
        route.setDepartureTime(routeEntity.getDepartureTime());
        route.setArrivalTime(routeEntity.getArrivalTime());
        route.setRouteLength(routeEntity.getRouteLength());
        route.setDuration(routeEntity.getDuration());
        route.setPrice(routeEntity.getPrice());
        route.setTrain(TrainMapper.trainEntityToTrain(routeEntity.getTrain()));
        return route;
    }
}

