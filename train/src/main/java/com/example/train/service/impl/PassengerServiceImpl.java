package com.example.train.service.impl;

import com.example.train.entity.PassengerEntity;
import com.example.train.mapper.PassengerMapper;
import com.example.train.model.Passenger;
import com.example.train.repository.PassengerRepository;
import com.example.train.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;

    @Autowired
    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public Passenger getPassengerById(int id) {
        if(passengerRepository.existsById(id)) {
            return PassengerMapper.passengerEntityToPassenger(passengerRepository.getReferenceById(id));
        }
        return null;
    }

    @Override
    public List<Passenger> getAll() {
        List<PassengerEntity> entities = passengerRepository.findAll();
        List<Passenger> passengers = new ArrayList<>();
        for (PassengerEntity entity : entities) {
            Passenger passenger = PassengerMapper.passengerEntityToPassenger(entity);
            passengers.add(passenger);
        }
        return passengers;
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        passengerRepository.save(PassengerMapper.passengerToPassengerEntity(passenger));
        return true;
    }

    @Override
    public boolean deletePassengerById(int id) {
        if(passengerRepository.existsById(id)) {
            passengerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
