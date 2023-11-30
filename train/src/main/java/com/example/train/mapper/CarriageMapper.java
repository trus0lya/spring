package com.example.train.mapper;

import com.example.train.entity.CarriageEntity;
import com.example.train.entity.TrainEntity;
import com.example.train.model.Carriage;
import com.example.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;

public class CarriageMapper {
    public static CarriageEntity carriageToCarriageEntity (Carriage carriage) {
        CarriageEntity carriageEntity = new CarriageEntity();
        carriageEntity.setId(carriage.getId());
        carriageEntity.setCarriageNumber(carriage.getCarriageNumber());
        carriageEntity.setType(carriage.getType());
        TrainEntity train = TrainMapper.trainToTrainEntity(carriage.getTrain());
        carriageEntity.setTrain(train);
        carriageEntity.setNumberOfSeats(carriage.getNumberOfSeats());
        return carriageEntity;
    }

    public static Carriage carriageEntityToCarriage(CarriageEntity carriageEntity) {
        Carriage carriage = new Carriage();
        carriage.setId(carriageEntity.getId());
        carriage.setCarriageNumber(carriageEntity.getCarriageNumber());
        carriage.setType(carriageEntity.getType());
        carriage.setTrain(TrainMapper.trainEntityToTrain(carriageEntity.getTrain()));
        carriage.setNumberOfSeats(carriageEntity.getNumberOfSeats());
        return carriage;
    }
}

