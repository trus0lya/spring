package com.example.train.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private int id;
    private int ticketNumber;
    private int passenger;
    private List<Integer> discounts;
    private int routes;
    private int carriage;
    private double price;
}
