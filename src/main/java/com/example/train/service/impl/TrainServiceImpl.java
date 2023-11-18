package com.example.train.service.impl;

import com.example.train.entity.TrainEntity;
import com.example.train.mapper.TrainMapper;
import com.example.train.model.Train;
import com.example.train.repository.TrainRepository;
import com.example.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {
    private final TrainRepository trainRepository;

    @Autowired
    public TrainServiceImpl(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @Override
    public Train getTrainById(int id) {
        if(trainRepository.existsById(id)) {
            return TrainMapper.trainEntityToTrain(trainRepository.getReferenceById(id));
        }
        return null;
    }

    public List<Train> getAll() {
        List<TrainEntity> entities = trainRepository.findAll();
        List<Train> trains = new ArrayList<>();
        for (TrainEntity entity : entities) {
            Train train = TrainMapper.trainEntityToTrain(entity);
            trains.add(train);
        }
        return trains;
    }

    @Override
    public boolean addTrain(Train train) {
        if(trainRepository.existsTrainEntityByTrainNumber(train.getTrainNumber())) {
            return false;
        }
        TrainEntity trainEntity = new TrainEntity();
        trainEntity.setTrainNumber(train.getTrainNumber());
        trainEntity.setTrainType(train.getTrainType().toString());
        trainEntity.setNumberOfWagons(train.getNumberOfWagons());
        trainRepository.save(trainEntity);
        return true;
    }

    @Override
    public boolean deleteTrainById(int id) {
        if(trainRepository.existsById(id)) {
            trainRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
