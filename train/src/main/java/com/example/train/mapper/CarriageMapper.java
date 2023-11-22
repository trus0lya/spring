package com.example.train.mapper;

import com.example.train.entity.CarriageEntity;
import com.example.train.model.Carriage;
import com.example.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;

public class CarriageMapper {
    private final TrainService trainService;

    @Autowired
    public CarriageMapper(TrainService trainService) {
        this.trainService = trainService;
    }

    public CarriageEntity carriageToCarriageEntity (Carriage carriage) {
        CarriageEntity carriageEntity = new CarriageEntity();
        carriageEntity.setId(carriage.getId());
        carriageEntity.setCarriageNumber(carriage.getCarriageNumber());
        carriageEntity.setType(carriage.getType());
        carriageEntity.setTrain(TrainMapper.trainToTrainEntity(trainService.getTrainById(carriage.getTrainId())));
        carriageEntity.setNumberOfSeats(carriage.getNumberOfSeats());
        return carriageEntity;
    }

    public static Carriage carriageEntityToCarriage(CarriageEntity carriageEntity) {
        Carriage carriage = new Carriage();
        carriage.setId(carriageEntity.getId());
        carriage.setCarriageNumber(carriageEntity.getCarriageNumber());
        carriage.setType(carriageEntity.getType());
        carriage.setTrainId(carriageEntity.getTrain().getId());
        carriage.setNumberOfSeats(carriageEntity.getNumberOfSeats());
        return carriage;
    }
}

