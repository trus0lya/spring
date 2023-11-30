package com.example.train.service.impl;

import com.example.train.mapper.RouteMapper;
import com.example.train.model.Route;
import com.example.train.model.Station;
import com.example.train.repository.RouteRepository;
import com.example.train.service.RouteService;
import com.example.train.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class RouteServiceImpl implements RouteService {
    private final RouteRepository routeRepository;
    private final StationService stationService;

    @Autowired
    public RouteServiceImpl(RouteRepository routeRepository, StationService stationService) {
        this.routeRepository = routeRepository;
        this.stationService = stationService;
    }

    @Override
    public Route getRouteById(int id) {
        if(routeRepository.existsById(id)) {
           return RouteMapper.routeEntityToRoute(routeRepository.getReferenceById(id));
        }
        return null;
    }

    @Override
    public Route getRouteByTitle(String title) {
        if(routeRepository.existsByTitle(title)) {
            return RouteMapper.routeEntityToRoute(routeRepository.getByTitle(title));
        }
        return null;
    }

    @Override
    public Station getDepartureStationByTitle(String title) {
        if(routeRepository.existsByTitle(title)) {
            int stationId = routeRepository.getByTitle(title).getDepartureStation().getId();
            if(stationService.getStationById(stationId) != null) {
                return stationService.getStationById(stationId);
            }
            return null;
        }
        return null;
    }

    @Override
    public Station getArrivalStationByTitle(String title) {
        if(routeRepository.existsByTitle(title)) {
            int stationId = routeRepository.getByTitle(title).getArrivalStation().getId();
            if(stationService.getStationById(stationId) != null) {
                return stationService.getStationById(stationId);
            }
            return null;
        }
        return null;
    }

    @Override
    public int getRouteLengthByTitle(String title) {
        if(routeRepository.existsByTitle(title)) {
            return routeRepository.getByTitle(title).getRouteLength();
        }
        return -1;
    }

    @Override
    public int getPriceById(int id) {
        if(routeRepository.existsById(id)) {
            return routeRepository.getReferenceById(id).getPrice();
        }
        return -1;
    }

    @Override
    public Timestamp getDepartureTimeById(int id) {
        if(routeRepository.existsById(id)) {
            return routeRepository.getReferenceById(id).getDepartureTime();
        }
        return null;
    }

    @Override
    public Timestamp getArrivalTimeById(int id) {
        if(routeRepository.existsById(id)) {
            return routeRepository.getReferenceById(id).getArrivalTime();
        }
        return null;
    }
}
