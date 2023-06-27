package com.hotel.hotelproject.hotel.repo;
import com.hotel.hotelproject.hotel.pojo.HotelRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRoomRepo extends CrudRepository<HotelRoom, Long> {

}
