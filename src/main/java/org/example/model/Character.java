package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name="characters")
@Entity
public class Character {
    @Id
    @Column(name="id")
    private UUID id;
    @Column(name="name")
    private String name;
    @Column(name="gender")
    private String gender;
    @Column(name="race")
    private String race;
    @Column(name="age")
    private int age;
    @Column(name="series_id")
    private UUID seriesId;
}
