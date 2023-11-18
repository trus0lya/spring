package com.example.train.mapper;

import com.example.train.entity.DiscountsEntity;
import com.example.train.model.Discount;

public class DiscountMapper {
    public static DiscountsEntity discountToDiscountEntity (Discount discount) {
        DiscountsEntity discountsEntity = new DiscountsEntity();
        discountsEntity.setId(discount.getId());
        discountsEntity.setDiscountName(discount.getDiscountName());
        discountsEntity.setDiscountText(discount.getDiscountText());
        discountsEntity.setDiscountAmount(discount.getDiscountAmount());
        return discountsEntity;
    }

    public static Discount discountEntityToDiscount(DiscountsEntity discountsEntity) {
        Discount discount = new Discount();
        discount.setId(discountsEntity.getId());
        discount.setDiscountName(discountsEntity.getDiscountName());
        discount.setDiscountText(discountsEntity.getDiscountText());
        discount.setDiscountAmount(discountsEntity.getDiscountAmount());
        return discount;
    }
}
