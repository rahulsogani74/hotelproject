package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.HotelManager;
import com.hotel.hotelproject.hotel.pojo.UserInfo;
import com.hotel.hotelproject.hotel.repo.HotelManagerRepo;
import com.hotel.hotelproject.hotel.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class HotelManagerService {

 @Autowired
    private HotelManagerRepo hotelManagerRepo;

    @Autowired
    private UserRepo userRepo;

    public void register(HotelManager hotelManager){
        Optional<UserInfo> userInfo = userRepo.findById(hotelManager.getId());
        Iterable<UserInfo> all = userRepo.findAll();
        if (userInfo.isPresent()) {
            hotelManager.setUserInfo(userInfo.get());
            hotelManagerRepo.save(hotelManager);
        } else {
            System.out.println("User is not present");
        }

    }

    public Iterable<HotelManager> getAllUser() {
        return hotelManagerRepo.findAll();
    }
}

