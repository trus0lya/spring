package com.example.train.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    private int id;
    private String discountName;
    private String discountText;
    private BigDecimal discountAmount;
}
