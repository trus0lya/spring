package com.example.train.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "ticket", schema = "train", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private int id;

    @Basic
    @Column(name = "ticket_number", nullable = false)
    @JsonProperty("ticket_number")
    private int ticketNumber;


    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private PassengerEntity passenger;

    @ManyToMany
    @JoinColumn(name = "discount_id")
    private List<DiscountsEntity> discounts;


    @ManyToOne
    @JoinColumn(name = "route_id")
    private RoutesEntity routes;

    @ManyToOne
    @JoinColumn(name = "carriage_id")
    private CarriageEntity carriage;

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    @JsonProperty("price")
    private double price;
}
