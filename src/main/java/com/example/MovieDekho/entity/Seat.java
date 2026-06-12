package com.example.MovieDekho.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="seats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Seat {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String seatNumber;

    @Column(nullable = false , name="seat_col")
    private Integer col;

    @Column(nullable = false, name="seat_row")
    private String row;

    @Enumerated(EnumType.STRING)
    private String seatType;

    @ManyToOne
    @JoinColumn(name="screen_id")
    private Screen screen;

}
