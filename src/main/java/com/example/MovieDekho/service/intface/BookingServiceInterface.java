package com.example.MovieDekho.service.intface;

import com.example.MovieDekho.entity.Booking;
import com.example.MovieDekho.entity.Seat;

import java.util.List;

public interface BookingServiceInterface {
    Booking createBooking(Booking booking);
    Booking getBookingById(Long id);
    List<Booking> getAllBookings();
    List<Booking> getBookingByUserId(Long id);
    List<Booking> getBookingByShowId(Long id);
    Booking cancelBooking(Long bookingId);
    List<Seat> getAvailableSeats(Long showId);

}
