package com.example.train.repository;

import com.example.train.entity.DiscountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<DiscountsEntity, Long> {
}
