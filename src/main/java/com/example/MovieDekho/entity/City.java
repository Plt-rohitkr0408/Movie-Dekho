package com.example.MovieDekho.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table( name ="Cities")
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    @Column(name="state")
    private String state;


}
