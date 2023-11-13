package com.example.train.service;

import com.example.train.entity.TrainEntity;
import com.example.train.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    private TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<TrainEntity> getAll() {
        return  trainRepository.findAll();
    }
}
