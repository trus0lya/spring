package com.example.train.service.impl;

import com.example.train.entity.DiscountsEntity;
import com.example.train.mapper.DiscountMapper;
import com.example.train.model.Discount;
import com.example.train.repository.DiscountRepository;
import com.example.train.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepository discountRepository;

    @Autowired
    public DiscountServiceImpl(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    @Override
    public Discount getDiscountById(int id) {
        if(discountRepository.existsById((long) id)) {
            return DiscountMapper.discountEntityToDiscount(discountRepository.getReferenceById((long) id));
        }
        return null;
    }

    @Override
    public List<Discount> getAll() {
        List<DiscountsEntity> entities = discountRepository.findAll();
        List<Discount> discounts = new ArrayList<>();
        for (DiscountsEntity entity : entities) {
            Discount discount = DiscountMapper.discountEntityToDiscount(entity);
            discounts.add(discount);
        }
        return discounts;
    }
}
