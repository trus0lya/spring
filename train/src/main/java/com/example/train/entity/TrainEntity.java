package com.example.train.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "train", schema = "train", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private int id;

    @Basic
    @Column(name = "train_number", nullable = false, length = 5)
    @JsonProperty("train_number")
    private String trainNumber;

    @Basic
    @Column(name = "train_type", nullable = true)
    @JsonProperty("train_type")
    private Object trainType;

    @Basic
    @Column(name = "number_of_wagons", nullable = false)
    @JsonProperty("number_of_wagons")
    private int numberOfWagons;
}
