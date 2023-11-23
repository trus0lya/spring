package com.example.train.controller.passenger;

import com.example.train.model.Passenger;
import com.example.train.service.PassengerService;
import com.example.train.uri.passenger.PassengerGetURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PassengerGetController {
    private final PassengerService passengerService;

    @Autowired
    public PassengerGetController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @RequestMapping(value = PassengerGetURI.GET_PASSENGER_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<Passenger> getPassengerById(@PathVariable int id) {
        Passenger passenger = passengerService.getPassengerById(id);
        if (passenger != null) {
            return new ResponseEntity<>(passenger, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = PassengerGetURI.GET_ALL_PASSENGERS, method = RequestMethod.GET)
    public ResponseEntity<List<Passenger>> getAllPassengers() {
        List<Passenger> passengers = passengerService.getAll();
        if(passengers.size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(passengers, HttpStatus.OK);
    }
}
