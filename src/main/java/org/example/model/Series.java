package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="series")
public class Series {
    @Id
    @Column(name="id")
    private UUID id;
    @Column(name="name")
    private String name;
    @Column(name="genre")
    private String genre;
    @Column(name="release_date")
    private LocalDate releaseDate;
    @Column(name="season_quantity")
    private Integer seasonQuantity;
}
