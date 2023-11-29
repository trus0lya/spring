package com.example.train.service;

import com.example.train.entity.CarriageEntity;
import com.example.train.model.Carriage;
import com.example.train.model.Train;
import org.springframework.stereotype.Service;

public interface CarriageService {
    Carriage getCarriageById(int id);
    CarriageEntity getCarriageEntityById(int id);
    Train getTrainByCarriageId(int id);
    int getCarriageNumberByCarriageId(int id);
    Object getTypeByCarriageId(int id);
    int getNumberOfSeatsByCarriageId(int id);
}
