package com.hotel.hotelproject.hotel.service;
import com.hotel.hotelproject.hotel.pojo.*;
import com.hotel.hotelproject.hotel.repo.HotelRepo;
import com.hotel.hotelproject.hotel.repo.HotelRoomRepo;
import com.hotel.hotelproject.hotel.repo.RoomTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class HotelRoomService {

    @Autowired
    private HotelRoomRepo hotelRoomRepo;

    @Autowired
    private HotelRepo hotelRepo;

    @Autowired
    private RoomTypeRepo roomTypeRepo;

    public void register(HotelRoom hotelRoom){
        Optional<Hotel> hotel = hotelRepo.findById(hotelRoom.getHotelId());
        Iterable<Hotel> all = hotelRepo.findAll();
        if (hotel.isPresent()) {
            hotelRoom.setHotel(hotel.get());
            hotelRoom.setRoomStatus("available");

        } else {
            System.out.println("Hotel is not present");
            return;
        }
        //catogery passed by user is present in RoomType
//        RoomType roomType = roomTypeRepo.findRoomType(hotelRoom.getRoomCat().toUpperCase());
//        if (null != roomType) {
//            hotelRoom.setRoomType(roomType);
//            hotelRoom.setRoomCat(roomType.getId());
//        }
        hotelRoomRepo.save(hotelRoom);
    }

    public Iterable<HotelRoom> getAllHotel() {
        return hotelRoomRepo.findAll();
    }
}
