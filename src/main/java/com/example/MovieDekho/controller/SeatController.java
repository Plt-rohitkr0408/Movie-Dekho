package com.example.MovieDekho.controller;

import com.example.MovieDekho.entity.Seat;
import com.example.MovieDekho.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
@RequiredArgsConstructor
public class SeatController {
    private final SeatService seatService;

    @PostMapping
    public ResponseEntity<Seat> addSeat(@RequestBody Seat seat){
        return ResponseEntity.ok(seatService.addSeat(seat));
    }

    @GetMapping
    public ResponseEntity<List<Seat>> getAllSeats(){
        return ResponseEntity.ok(seatService.getSeat());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seat> getSeatById(@PathVariable Long id){
        return ResponseEntity.ok(seatService.getSeatById(id));
    }

    @GetMapping("/Screen/{id}")
    public ResponseEntity<List<Seat>> getSeatByScreenId(@PathVariable Long id){
        return ResponseEntity.ok(seatService.getSeatByScreenId(id));
    }

}
