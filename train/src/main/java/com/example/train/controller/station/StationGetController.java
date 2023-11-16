package com.example.train.controller.station;

import com.example.train.model.Station;
import com.example.train.service.StationService;
import com.example.train.uri.station.StationGetURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StationGetController {
    private final StationService stationService;

    @Autowired
    public StationGetController(StationService stationService) {
        this.stationService = stationService;
    }

    @RequestMapping(value = StationGetURI.GET_STATION_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<Station> getStationById(@PathVariable int id) {
        Station station = stationService.getStationById(id);
        if (station != null) {
            return new ResponseEntity<>(station, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = StationGetURI.GET_ALL_STATIONS, method = RequestMethod.GET)
    public ResponseEntity<List<Station>> getAllTrains() {
        List<Station> stations = stationService.getAll();
        if(stations.size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(stations, HttpStatus.OK);
        }
    }
}
