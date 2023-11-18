package com.example.train.service.impl;

import com.example.train.entity.StationEntity;
import com.example.train.mapper.StationMapper;
import com.example.train.model.Station;
import com.example.train.repository.StationRepository;
import com.example.train.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationServiceImpl implements StationService {
    private final StationRepository stationRepository;

    @Autowired
    public StationServiceImpl(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Override
    public Station getStationById(int id) {
        if(stationRepository.existsById(id)) {
            return StationMapper.stationEntityToStation(stationRepository.getReferenceById(id));
        }
        return null;
    }

    @Override
    public List<Station> getAll() {
        List<StationEntity> entities = stationRepository.findAll();
        List<Station> stations = new ArrayList<>();
        for (StationEntity entity : entities) {
            Station station = StationMapper.stationEntityToStation(entity);
            stations.add(station);
        }
        return stations;
    }

    @Override
    public boolean addStation(Station station) {
        if(stationRepository.existsStationEntityByStationCode(station.getStationCode())) {
            return false;
        }
        StationEntity stationEntity = new StationEntity();
        stationEntity.setStationCode(station.getStationCode());
        stationEntity.setTitle(station.getTitle());
        stationRepository.save(stationEntity);
        return true;
    }

    @Override
    public boolean deleteStationById(int id) {
        if(stationRepository.existsById(id)) {
            stationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
