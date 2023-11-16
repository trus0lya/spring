package com.example.train.controller.train;


import com.example.train.model.Train;
import com.example.train.service.TrainService;
import com.example.train.uri.train.TrainPostURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrainPostController {
    private final TrainService trainService;

    @Autowired
    public TrainPostController(TrainService trainService) {
        this.trainService = trainService;
    }

    @RequestMapping(value = TrainPostURI.ADD_TRAIN, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addTrain(@RequestBody Train train) {
        boolean isAdded = trainService.addTrain(train);
        if (isAdded) {
            return ResponseEntity.ok("Train added successfully.");
        }
        return ResponseEntity.badRequest().body("Train with the given number already exists.");
    }
}
