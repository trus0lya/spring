package com.example.train.repository;

import com.example.train.entity.RoutesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<RoutesEntity, Integer> {
}
