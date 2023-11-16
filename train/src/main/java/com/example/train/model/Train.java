package com.example.train.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    private int id;
    private String trainNumber;
    private Object trainType;
    private int numberOfWagons;
}
