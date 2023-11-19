package com.example.train.mapper;

import com.example.train.entity.PassengerEntity;
import com.example.train.model.Passenger;

public class PassengerMapper {
    public static PassengerEntity passengerToPassengerEntity (Passenger passenger) {
        PassengerEntity passengerEntity = new PassengerEntity();
        passengerEntity.setId(passenger.getId());
        passengerEntity.setName(passenger.getName());
        passengerEntity.setSurname(passenger.getSurname());
        passengerEntity.setBirth(passenger.getBirth());
        passengerEntity.setMail(passenger.getMail());
        return passengerEntity;
    }

    public static Passenger passengerEntityToPassenger(PassengerEntity passengerEntity) {
        Passenger passenger = new Passenger();
        passenger.setId(passengerEntity.getId());
        passenger.setName(passengerEntity.getName());
        passenger.setSurname(passengerEntity.getSurname());
        passenger.setBirth(passengerEntity.getBirth());
        passenger.setMail(passengerEntity.getMail());
        return passenger;
    }
}
