package com.example.train.service;

import com.example.train.model.Discount;
import com.example.train.model.Train;

import java.util.List;

public interface DiscountService {
    Discount getDiscountById(int id);
    List<Discount> getAll();
}
