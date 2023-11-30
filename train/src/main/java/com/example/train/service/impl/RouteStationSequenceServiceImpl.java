package com.example.train.service.impl;

import com.example.train.mapper.RouteMapper;
import com.example.train.mapper.RouteStationSequenceMapper;
import com.example.train.mapper.StationMapper;
import com.example.train.model.Route;
import com.example.train.model.RouteStationSequence;
import com.example.train.model.Station;
import com.example.train.repository.RouteStationSequenceRepository;
import com.example.train.service.RouteStationSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteStationSequenceServiceImpl implements RouteStationSequenceService {

    private final RouteStationSequenceRepository repository;

    @Autowired
    public RouteStationSequenceServiceImpl(RouteStationSequenceRepository repository) {
        this.repository = repository;
    }

    @Override
    public RouteStationSequence getRouteStationSequenceById(int id) {
        if(repository.existsById(id)) {
            return RouteStationSequenceMapper.routeStationSequenceEntityToRouteStationSequence(
                    repository.getReferenceById(id)
            );
        }
        return null;
    }

    @Override
    public Route getRouteByRouteStationSequenceById(int id) {
       if(repository.existsById(id)) {
           return RouteMapper.routeEntityToRoute(repository.getReferenceById(id).getRoute());
       }
       return null;
    }
/*
    @Override
    public List<Station> getStationsByRouteStationSequenceById(int id) {
        if(repository.existsById(id)) {
            return
        }
        return null;
    }*/
}
