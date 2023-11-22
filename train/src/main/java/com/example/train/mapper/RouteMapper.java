/*
package com.example.train.mapper;

import com.example.train.entity.RoutesEntity;
import com.example.train.model.Passenger;
import com.example.train.model.Route;
import com.example.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;

public class RouteMapper {

    private final TrainService trainService;

    @Autowired
    public RouteMapper(TrainService trainService) {
        this.trainService = trainService;
    }

    public  RoutesEntity RouteToRouteEntity (Route route) {
        RoutesEntity routeEntity = new RoutesEntity();
        routeEntity.setId(route.getId());
        routeEntity.setTitle(route.getTitle());
        routeEntity.setDepartureStation();
        routeEntity.setArrivalStation();
        routeEntity.setDepartureTime(route.getDepartureTime());
        routeEntity.setArrivalTime();
        routeEntity.setRouteLength(route.getRouteLength());
        routeEntity.setDuration(route.getDuration());
        routeEntity.setPrice(route.getPrice());
        routeEntity.setTrain(TrainMapper.trainToTrainEntity(trainService.getTrainById(route.getTrainId())));
        return routeEntity;
    }*/
/**//*


    public static Passenger routeEntityToPassenger(routeEntity routeEntity) {
        Passenger passenger = new Passenger();
        passenger.setId(routeEntity.getId());
        passenger.setName(routeEntity.getName());
        passenger.setSurname(routeEntity.getSurname());
        passenger.setBirth(routeEntity.getBirth());
        passenger.setMail(routeEntity.getMail());
        return passenger;
    }
}
*/
