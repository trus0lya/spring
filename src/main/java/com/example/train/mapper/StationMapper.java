package com.example.train.mapper;


import com.example.train.entity.StationEntity;
import com.example.train.model.Station;

public class StationMapper {
    public static StationEntity stationToStationEntity (Station station) {
        StationEntity stationEntity = new StationEntity();
        stationEntity.setId(station.getId());
        stationEntity.setTitle(station.getTitle());
        stationEntity.setStationCode(station.getStationCode());
        return stationEntity;
    }

    public static Station stationEntityToStation(StationEntity stationEntity) {
        Station station = new Station();
        station.setId(stationEntity.getId());
        station.setTitle(stationEntity.getTitle());
        station.setStationCode(stationEntity.getStationCode());
        return station;
    }
}
