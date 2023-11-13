package com.example.train.controller;

import com.example.train.entity.TrainEntity;
import com.example.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TrainController {
    private final TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping("/trains/all-trains")
    @ResponseBody
    public List<TrainEntity> getAllTrains() {
        return trainService.getAll();
    }

}
