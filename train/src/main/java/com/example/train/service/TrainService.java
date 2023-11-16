package com.example.train.service;

import com.example.train.model.Train;

import java.util.List;

public interface TrainService {
    Train getTrainById(int id);
    List<Train> getAll();
    boolean addTrain(Train train);
    boolean deleteTrainById(int id);
    boolean isExist(Train train);
}
