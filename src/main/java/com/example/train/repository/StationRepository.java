package com.example.train.repository;

import com.example.train.entity.StationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<StationEntity, Integer> {
    boolean existsStationEntityByStationCode(String code);
}
