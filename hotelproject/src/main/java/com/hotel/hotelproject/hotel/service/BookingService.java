package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class BookingService {

    @Autowired
    private HotelBookingService hotelBookingService;


    public ResponseEntity<String> register(Booking booking) {
       HotelBooking hotelBooking = new HotelBooking();

       hotelBooking.setHotelId(booking.getHotelId());
       hotelBooking.setConsumerId(booking.getConsumerId());
       hotelBooking.setId(booking.getId());
       hotelBooking.setPin(booking.getPin());
       hotelBooking.setStartDate(booking.getStartDate());
       hotelBooking.setEndDate(booking.getEndDate());


        hotelBookingService.register(hotelBooking);

        return ResponseEntity.status(HttpStatus.CREATED).body("Booking registered successfully");
    }
}
