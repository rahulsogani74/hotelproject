package com.hotel.hotelproject.hotel.repo;

import com.hotel.hotelproject.hotel.pojo.Hotel;
import com.hotel.hotelproject.hotel.pojo.RoomType;
import com.hotel.hotelproject.hotel.pojo.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepo extends CrudRepository<Hotel, Long>
{
    @Query(value = "SELECT h.* FROM hotel h, hotel_room hr, room_type rt "
            + "WHERE h.hotel_id = hr.hotel_id "
            + "AND hr.room_cat = rt.id "
            + "AND h.branch = ?1 "
            + "AND rt.price_rate >= ?2 "
            + "AND hr.room_status = 'available'",
            nativeQuery = true)
    List<Hotel> findHotel(String branch, long priceRate);
}

