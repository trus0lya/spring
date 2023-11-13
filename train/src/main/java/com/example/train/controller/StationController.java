package com.example.train.controller;

import com.example.train.entity.StationEntity;
import com.example.train.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StationController {
    private final StationService stationService;

    @Autowired
    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/stations/all-stations")
    @ResponseBody
    public List<StationEntity> getAllStations() {
        return stationService.getAll();
    }
}
