package com.example.train.controller.train;

import com.example.train.service.TrainService;
import com.example.train.uri.train.TrainDeleteURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrainDeleteController {
    private final TrainService trainService;

    @Autowired
    public TrainDeleteController(TrainService trainService) {
        this.trainService = trainService;
    }

    @RequestMapping(value = TrainDeleteURI.DELETE_TRAIN_BY_ID, method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteTrainById(@PathVariable int id) {
        boolean isDeleted = trainService.deleteTrainById(id);

        if (isDeleted) {
            return ResponseEntity.ok("Train deleted successfully.");
        }
        return ResponseEntity.badRequest().body("Train with the given ID not found.");
    }
}
