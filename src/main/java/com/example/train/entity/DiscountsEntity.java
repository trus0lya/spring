package com.example.train.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "discounts", schema = "train", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private int id;

    @Basic
    @Column(name = "discount_name", nullable = false, length = 50)
    @JsonProperty("discount_name")
    private String discountName;

    @Basic
    @Column(name = "discount_text", nullable = false, length = -1)
    @JsonProperty("discount_text")
    private String discountText;

    @Basic
    @Column(name = "discount_amount", nullable = false, precision = 2)
    @JsonProperty("discount_amount")
    private BigDecimal discountAmount;
}
