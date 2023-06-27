package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.HotelOwner;
import com.hotel.hotelproject.hotel.pojo.HotelRoom;
import com.hotel.hotelproject.hotel.pojo.RoomType;
import com.hotel.hotelproject.hotel.pojo.UserInfo;
import com.hotel.hotelproject.hotel.repo.HotelOwnerRepo;
import com.hotel.hotelproject.hotel.repo.HotelRoomRepo;
import com.hotel.hotelproject.hotel.repo.RoomTypeRepo;
import com.hotel.hotelproject.hotel.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class RoomTypeService {

    @Autowired
    private RoomTypeRepo roomTypeRepo;

    @Autowired
    private HotelRoomRepo hotelRoomRepo;



    public void register(RoomType roomType){
        //Optional<HotelRoom> hotelRoom = hotelRoomRepo.findById(Long.valueOf(roomType.getId()));
        //Iterable<HotelRoom> all = hotelRoomRepo.findAll();
        //if (hotelRoom.isPresent()) {
          //  roomType.setHotelRoom(hotelRoom.get());
        roomType.setId(roomType.getId().toUpperCase());
        roomTypeRepo.save(roomType);
        //} else {
        //    System.out.println("Room is not present");
        //}

    }

    public Iterable<RoomType> getAllHotalRoom() {
        return roomTypeRepo.findAll();
    }

}
