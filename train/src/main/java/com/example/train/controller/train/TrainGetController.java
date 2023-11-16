package com.example.train.controller.train;

import com.example.train.model.Train;
import com.example.train.service.impl.TrainServiceImpl;
import com.example.train.uri.train.TrainGetURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TrainGetController {
    private final TrainServiceImpl trainService;

    @Autowired
    public TrainGetController(TrainServiceImpl trainService) {
        this.trainService = trainService;
    }

    @RequestMapping(value = TrainGetURI.GET_TRAIN_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<Train> getTrainById(@PathVariable int id) {
        Train train = trainService.getTrainById(id);
        if (train != null) {
            return new ResponseEntity<>(train, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = TrainGetURI.GET_ALL_TRAINS, method = RequestMethod.GET)
    public ResponseEntity<List<Train>> getAllTrains() {
        List<Train> trains = trainService.getAll();
        if(trains.size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(trains, HttpStatus.OK);
        }
    }
}
