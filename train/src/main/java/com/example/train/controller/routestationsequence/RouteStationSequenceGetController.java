package com.example.train.controller.routestationsequence;

import com.example.train.model.RouteStationSequence;
import com.example.train.service.RouteStationSequenceService;
import com.example.train.uri.routestationsequence.RouteStationSequenceGetURI;
import com.example.train.uri.station.StationGetURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RouteStationSequenceGetController {
    private final RouteStationSequenceService service;

    @Autowired
    public RouteStationSequenceGetController(RouteStationSequenceService service) {
        this.service = service;
    }

    @RequestMapping(value = RouteStationSequenceGetURI.GET_ROUTE_STATION_SEQUENCE_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<RouteStationSequence> getRouteById(@PathVariable int id) {
        if(service.getRouteByRouteStationSequenceById(id) != null) {
            return new ResponseEntity<>(service.getRouteStationSequenceById(id), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
