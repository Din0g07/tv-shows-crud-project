package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="characters")
public class ShowCharacter {
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
    @Column(name="info")
    private String info;
    @Column(name="series_id")
    private UUID seriesId;
}


