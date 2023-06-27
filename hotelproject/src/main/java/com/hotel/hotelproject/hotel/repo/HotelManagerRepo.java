package com.hotel.hotelproject.hotel.repo;

import com.hotel.hotelproject.hotel.pojo.HotelManager;
import com.hotel.hotelproject.hotel.pojo.HotelOwner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelManagerRepo extends CrudRepository<HotelManager, Long> {

}
