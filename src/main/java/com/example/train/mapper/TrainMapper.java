package com.example.train.mapper;

import com.example.train.entity.TrainEntity;
import com.example.train.model.Train;

public class TrainMapper {
    public static TrainEntity trainToTrainEntity (Train train) {
        TrainEntity trainEntity = new TrainEntity();
        trainEntity.setId(train.getId());
        trainEntity.setTrainNumber(train.getTrainNumber());
        trainEntity.setTrainType(train.getTrainType());
        trainEntity.setNumberOfWagons(train.getNumberOfWagons());
        return trainEntity;
    }

    public static Train trainEntityToTrain(TrainEntity trainEntity) {
        Train train = new Train();
        train.setId(trainEntity.getId());
        train.setTrainNumber(trainEntity.getTrainNumber());
        train.setTrainType(trainEntity.getTrainType());
        train.setNumberOfWagons(trainEntity.getNumberOfWagons());
        return train;
    }
}
