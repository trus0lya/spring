package com.example.train.controller.carriage;

import com.example.train.entity.CarriageEntity;
import com.example.train.model.Carriage;
import com.example.train.model.Train;
import com.example.train.service.CarriageService;
import com.example.train.uri.carriage.CarriageGetURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CarriageGetController {
    private final CarriageService carriageService;

    @Autowired
    public CarriageGetController(CarriageService carriageService) {
        this.carriageService = carriageService;
    }

    @RequestMapping(value = CarriageGetURI.GET_CARRIAGE_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<Carriage> getCarriageById(@PathVariable int id) {
        Carriage carriage = carriageService.getCarriageById(id);
        if (carriage != null) {
            return new ResponseEntity<>(carriage, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = CarriageGetURI.GET_CARRIAGE_ENTITY_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<CarriageEntity> getCarriageEntity(@PathVariable int id) {
        CarriageEntity carriage = carriageService.getCarriageEntityById(id);
        if (carriage != null) {
            return new ResponseEntity<>(carriage, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = CarriageGetURI.GET_TRAIN_BY_CARRIAGE_ID, method = RequestMethod.GET)
    public ResponseEntity<Train> geTrainByCarriageId(@PathVariable int id) {
        Train train  = carriageService.getTrainByCarriageId(id);
        if(train != null) {
            return new ResponseEntity<>(train, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
