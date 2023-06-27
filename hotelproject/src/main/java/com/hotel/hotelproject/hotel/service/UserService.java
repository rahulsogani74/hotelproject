package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.User;
import com.hotel.hotelproject.hotel.repo.UserRepo;
import com.hotel.hotelproject.hotel.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void signup(UserInfo userInfo) {
        userRepo.save(userInfo);
    }

    public Iterable<UserInfo> getAllUser() {
        return userRepo.findAll();
    }
}
