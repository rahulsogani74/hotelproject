package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.*;
import com.hotel.hotelproject.hotel.repo.ConsumerRepo;
import com.hotel.hotelproject.hotel.repo.HotelManagerRepo;
import com.hotel.hotelproject.hotel.repo.HotelOwnerRepo;
import com.hotel.hotelproject.hotel.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Service {

    @Autowired
    private UserService userService;

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private HotelOwnerService hotelOwnerService;

    @Autowired
    private HotelManagerService hotelManagerService;

    public ResponseEntity<String> register(User user) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(user.getId());
        userInfo.setName(user.getName());
        userInfo.setAddress(user.getAddress());
        userInfo.setPhoneNum(user.getPhoneNum());
        userInfo.setEmail(user.getEmail());
        userService.signup(userInfo);

        if (user.isConsumer()) {
            Consumer consumer = new Consumer();
            consumer.setId(user.getId());
            consumer.setUserName(user.getUserName());
            consumer.setPassword(user.getPassword());
            consumerService.register(consumer);
            return ResponseEntity.status(HttpStatus.CREATED).body("Consumer registered successfully");

        } else if (user.isHotelManager()){
            HotelManager hotelManager = new HotelManager();
            hotelManager.setId(user.getId());
            hotelManager.setUserName(user.getUserName());
            hotelManager.setPassword(user.getPassword());
            hotelManagerService.register(hotelManager);
            return ResponseEntity.status(HttpStatus.CREATED).body("Hotel Manager registered successfully");

        } else if (user.isHotelOwner()){
            HotelOwner hotelOwner = new HotelOwner();
            hotelOwner.setId(user.getId());
            hotelOwner.setUserName(user.getUserName());
            hotelOwner.setPassword(user.getPassword());
            hotelOwnerService.register(hotelOwner);
            return ResponseEntity.status(HttpStatus.CREATED).body("Hotel Owner registered successfully");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
    }

}
