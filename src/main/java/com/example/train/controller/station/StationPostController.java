package com.example.train.controller.station;

import com.example.train.model.Station;
import com.example.train.model.Train;
import com.example.train.service.StationService;
import com.example.train.uri.station.StationPostURI;
import com.example.train.uri.train.TrainPostURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StationPostController {
    private final StationService stationService;

    @Autowired
    public StationPostController(StationService stationService) {
        this.stationService = stationService;
    }

    @RequestMapping(value = StationPostURI.ADD_STATION, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addStation(@RequestBody Station station) {
        boolean isAdded = stationService.addStation(station);
        if (isAdded) {
            return ResponseEntity.ok("Station added successfully.");
        }
        return ResponseEntity.badRequest().body("Station with the given code already exists.");
    }
}
