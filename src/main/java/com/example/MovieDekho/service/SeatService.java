package com.example.MovieDekho.service;

import com.example.MovieDekho.entity.Seat;
import com.example.MovieDekho.service.intface.SeatsServiceInterface;

import java.util.List;

public class SeatService implements SeatsServiceInterface {
    @Override
    public Seat addSeat(Seat seat) {
        return null;
    }

    @Override
    public List<Seat> getSeat() {
        return List.of();
    }

    @Override
    public Seat getSeatById(Long id) {
        return null;
    }

    @Override
    public List<Seat> getSeatByScreenId(Long screenId) {
        return List.of();
    }
}
