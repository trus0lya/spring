package com.example.train.service;

import com.example.train.model.Passenger;
import com.example.train.model.Train;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PassengerService {
    Passenger getPassengerById(int id);
    List<Passenger> getAll();
    boolean addPassenger(Passenger passenger);
    boolean deletePassengerById(int id);
}
