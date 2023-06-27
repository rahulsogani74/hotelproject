package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class HotelPojoService {

    @Autowired
    private HotelRoomService hotelRoomService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private RoomTypeService roomTypeService;

    public ResponseEntity<String> register(HotelPojo hotelPojo) {
        Hotel hotel = new Hotel();
        HotelRoom hotelRoom = new HotelRoom();
        RoomType roomType = new RoomType();

        hotel.setHotelId(hotelPojo.getHotelId());
        hotel.setName(hotelPojo.getName());
        hotel.setAddress(hotelPojo.getAddress());
        hotel.setPhoneNum(hotelPojo.getPhoneNum());
        hotel.setBranch(hotelPojo.getBranch());
        hotel.setOwnerId(hotelPojo.getOwnerId());
        hotel.setManagerId(hotelPojo.getManagerId());

        hotelRoom.setRoomNumber(hotelPojo.getRoomNumber());
        hotelRoom.setRoomCat(hotelPojo.getRoomCat());
        hotelRoom.setRoomStatus(hotelPojo.getRoomStatus());

        roomType.setExtraBed(hotelPojo.getExtraBed());
        roomType.setNumPeople(hotelPojo.getNumPeople());
        roomType.setPriceRate(hotelPojo.getPriceRate());

        hotelRoom.setId(hotelPojo.getRoomId());

        roomType.setId(hotelPojo.getRoomCat());

        hotelRoom.setHotelId(hotelPojo.getHotelId());

        roomTypeService.register(roomType);
        hotelRoomService.register(hotelRoom);
        hotelService.register(hotel);

        return ResponseEntity.status(HttpStatus.CREATED).body("Hotel registered successfully");
    }
}
