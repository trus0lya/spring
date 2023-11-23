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
    private Passenger passenger;
    private List<Discount> discounts;
    private Route route;
    private Carriage carriage;
    private double price;
}
