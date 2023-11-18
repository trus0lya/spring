package com.example.train.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "passenger", schema = "train", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private int id;

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    @JsonProperty("name")
    private String name;

    @Basic
    @Column(name = "surname", nullable = false, length = 20)
    @JsonProperty("surname")
    private String surname;

    @Basic
    @Column(name = "birth", nullable = false)
    @JsonProperty("birth")
    private Date birth;

    @Basic
    @Column(name = "mail", nullable = false, length = 30)
    @JsonProperty("mail")
    private String mail;
}
