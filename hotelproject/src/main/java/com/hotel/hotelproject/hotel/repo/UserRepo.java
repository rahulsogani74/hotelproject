package com.hotel.hotelproject.hotel.repo;

import com.hotel.hotelproject.hotel.pojo.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserInfo, Long> {

}
