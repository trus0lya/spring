package com.example.train.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "carriage", schema = "train", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CarriageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private TrainEntity train;

    @Basic
    @Column(name = "carriage_number", nullable = false)
    @JsonProperty("carriage_number")
    private int carriageNumber;

    @Basic
    @Column(name = "type", nullable = true)
    private Object type;

    @Basic
    @Column(name = "number_of_seats", nullable = false)
    @JsonProperty("number_of_seats")
    private int numberOfSeats;

}
