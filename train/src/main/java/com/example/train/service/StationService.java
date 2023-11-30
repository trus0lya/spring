package com.example.train.service;

import com.example.train.entity.StationEntity;
import com.example.train.model.Station;
import com.example.train.model.Train;
import com.example.train.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StationService {
    Station getStationById(int id);
    List<Station> getAll();
    boolean addStation(Station station);
    boolean deleteStationById(int id);
}
