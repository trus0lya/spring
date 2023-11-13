package com.example.train.service;

import com.example.train.entity.StationEntity;
import com.example.train.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {
    private StationRepository stationRepository;

    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public List<StationEntity> getAll() {
        return stationRepository.findAll();
    }
}
