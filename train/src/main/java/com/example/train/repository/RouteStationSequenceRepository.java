package com.example.train.repository;

import com.example.train.entity.RouteStationSequenceEntity;
import com.example.train.model.RouteStationSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteStationSequenceRepository
        extends JpaRepository<RouteStationSequenceEntity, Integer> {
}
