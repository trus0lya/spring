package com.example.train.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "station", schema = "train", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private int id;

    @Basic
    @Column(name = "title", nullable = false, length = 40)
    @JsonProperty("title")
    private String title;

    @Basic
    @Column(name = "station_code", nullable = false, length = 10)
    @JsonProperty("station_code")
    private String stationCode;
}
