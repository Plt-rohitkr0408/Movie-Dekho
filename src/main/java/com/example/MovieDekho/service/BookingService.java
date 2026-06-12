package com.example.MovieDekho.service;

import com.example.MovieDekho.entity.Booking;
import com.example.MovieDekho.entity.Seat;
import com.example.MovieDekho.service.intface.BookingServiceInterface;

import java.util.List;

public class BookingService implements BookingServiceInterface {
    @Override
    public Booking createBooking(Booking booking) {
        return null;
    }

    @Override
    public Booking getBookingById(Long id) {
        return null;
    }

    @Override
    public List<Booking> getAllBookings() {
        return List.of();
    }

    @Override
    public List<Booking> getBookingByUserId(Long id) {
        return List.of();
    }

    @Override
    public List<Booking> getBookingByShowId(Long id) {
        return List.of();
    }

    @Override
    public Booking cancelBooking(Long bookingId) {
        return null;
    }

    @Override
    public List<Seat> getAvailableSeats(Long showId) {
        return List.of();
    }
}
