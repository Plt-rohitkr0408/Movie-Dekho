package com.example.MovieDekho.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="shows")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Screen {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private Integer totalSeats;

    @ManyToOne
    @JoinColumn(name="theater_id")
    private Theater theater;

}
