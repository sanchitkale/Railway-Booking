package com.example.Railway.Ticket.Booking.System;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final TrainRepository trainRepository;

    public BookingService(BookingRepository bookingRepository, TrainRepository trainRepository) {
        this.bookingRepository = bookingRepository;
        this.trainRepository = trainRepository;
    }

    public Booking createBooking(BookingRequestDTO bookingRequest) {
        Train train = trainRepository.findById(bookingRequest.getTrainId())
                .orElseThrow(() -> new EntityNotFoundException("Train not found"));

        if (bookingRequest.getNumberOfSeats() > train.getTotalSeats()) {
            throw new IllegalArgumentException("Not enough seats available");
        }

        Booking booking = new Booking();
        booking.setTrain(train);
        booking.setPassengerName(bookingRequest.getPassengerName());
        booking.setPassengerEmail(bookingRequest.getPassengerEmail());
        booking.setNumberOfSeats(bookingRequest.getNumberOfSeats());
        booking.setTotalFare(train.getFare() * bookingRequest.getNumberOfSeats());
        booking.setStatus(BookingStatus.CONFIRMED);

        train.setTotalSeats(train.getTotalSeats() - bookingRequest.getNumberOfSeats());
        trainRepository.save(train);

        return bookingRepository.save(booking);
    }

    public List<Booking> getBookingsByEmail(String email) {
        return bookingRepository.findByPassengerEmail(email);
    }
}