package com.example.train.controller.station;


import com.example.train.service.StationService;
import com.example.train.uri.station.StationDeleteURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StationDeleteController {
    private final StationService stationService;

    @Autowired
    public StationDeleteController(StationService stationService) {
        this.stationService = stationService;
    }

    @RequestMapping(value = StationDeleteURI.DELETE_STATION_BY_ID, method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteStationById(@PathVariable int id) {
        boolean isDeleted = stationService.deleteStationById(id);
        if (isDeleted) {
            return ResponseEntity.ok("Station deleted successfully.");
        } else {
            return ResponseEntity.badRequest().body("Station with the given ID not found.");
        }
    }
}
