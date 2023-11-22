package com.example.train.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    private int id;
    private String name;
    private String surname;
    private Date birth;
    private String mail;
}