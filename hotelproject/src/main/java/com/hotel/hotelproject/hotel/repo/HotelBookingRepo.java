package com.hotel.hotelproject.hotel.repo;

import com.hotel.hotelproject.hotel.pojo.HotelBooking;
import com.hotel.hotelproject.hotel.pojo.HotelManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelBookingRepo extends CrudRepository<HotelBooking, Long> {

}
