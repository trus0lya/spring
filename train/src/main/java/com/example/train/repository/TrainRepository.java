package com.example.train.repository;

import com.example.train.entity.TrainEntity;
import com.example.train.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<TrainEntity, Integer> {
    boolean existsTrainEntityByTrainNumber(String trainNumber);
}
