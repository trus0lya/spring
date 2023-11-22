package com.example.train.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carriage {
    private int id;
    private int trainId;
    private int carriageNumber;
    private Object type;
    private int numberOfSeats;
}
