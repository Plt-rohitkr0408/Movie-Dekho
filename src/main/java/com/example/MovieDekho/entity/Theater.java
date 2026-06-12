package com.example.MovieDekho.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Threaters")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="city_id", nullable = false)
    private City city;


}
