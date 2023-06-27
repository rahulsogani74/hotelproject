package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.HotelOwner;
import com.hotel.hotelproject.hotel.pojo.UserInfo;
import com.hotel.hotelproject.hotel.repo.HotelOwnerRepo;
import com.hotel.hotelproject.hotel.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class HotelOwnerService {

    @Autowired
    private HotelOwnerRepo hotelOwnerRepo;

    @Autowired
    private UserRepo userRepo;

    public void register(HotelOwner hotelOwner){
        Optional<UserInfo> userInfo = userRepo.findById(hotelOwner.getId());
        Iterable<UserInfo> all = userRepo.findAll();
        if (userInfo.isPresent()) {
            hotelOwner.setUserInfo(userInfo.get());
            hotelOwnerRepo.save(hotelOwner);
        } else {
            System.out.println("User is not present");
        }
        //hotelOwner.setUserInfo();

    }

    public Iterable<HotelOwner> getAllUser() {
        return hotelOwnerRepo.findAll();
    }
}
