package com.example.train.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;
@Entity
@Table(name = "route_station_sequence", schema = "train", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteStationSequenceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private int id;

    @OneToOne
    @JoinColumn(name = "route_id")
    private RoutesEntity route;

    @OneToOne
    @JoinColumn(name = "station_id")
    private StationEntity station;

    @Basic
    @Column(name = "sequence_number", nullable = false)
    @JsonProperty("sequence_number")
    private int sequenceNumber;

    @Basic
    @Column(name = "distance_to_next_station", nullable = false, precision = 0)
    @JsonProperty("distance_to_next_station")
    private int distanceToNextStation;

    @Basic
    @Column(name = "time_to_next_station", nullable = true)
    @JsonProperty("time_to_next_station")
    private Time timeToNextStation;
}
