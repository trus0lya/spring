package com.example.train.controller.passenger;

import com.example.train.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PassengerGetController {
    private final PassengerService passengerService;

    @Autowired
    public PassengerGetController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }
}
