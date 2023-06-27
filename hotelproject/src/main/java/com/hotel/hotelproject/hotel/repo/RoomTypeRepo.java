package com.hotel.hotelproject.hotel.repo;

import com.hotel.hotelproject.hotel.pojo.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepo extends CrudRepository<RoomType, String> {

    @Query(value = "SELECT * FROM hotel.room_type rt WHERE rt.id = ?1 and rt.price_rate >= ?2" ,
            nativeQuery = true)
    RoomType findRoomType(String cat, long priceRate);
}
