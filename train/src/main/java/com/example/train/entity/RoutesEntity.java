package com.example.train.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;


@Entity
@Table(name = "routes", schema = "train", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoutesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private int id;

    @Basic
    @Column(name = "title", nullable = false, length = 60)
    @JsonProperty("title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "departure_station_id")
    private StationEntity departureStation;

    @ManyToOne
    @JoinColumn(name = "arrival_station_id")
    private StationEntity arrivalStation;

    @Basic
    @Column(name = "departure_time", nullable = false)
    @JsonProperty("departure_time")
    private Timestamp departureTime;

    @Basic
    @Column(name = "arrival_time", nullable = false)
    @JsonProperty("arrival_time")
    private Timestamp arrivalTime;

    @Basic
    @Column(name = "route_length", nullable = false, precision = 0)
    @JsonProperty("route_length")
    private int routeLength;

    @Basic
    @Column(name = "duration", nullable = false)
    @JsonProperty("duration")
    private Time duration;

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    @JsonProperty("price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private TrainEntity train;
}
