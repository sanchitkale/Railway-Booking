package com.example.Railway.Ticket.Booking.System;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(
             @RequestBody BookingRequestDTO bookingRequest
    ) {
        return new ResponseEntity<>(bookingService.createBooking(bookingRequest), HttpStatus.CREATED);
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<List<Booking>> getUserBookings(
            @PathVariable String email
    ) {
        return ResponseEntity.ok(bookingService.getBookingsByEmail(email));
    }
}