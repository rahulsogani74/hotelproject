package com.hotel.hotelproject.hotel.service;
import com.hotel.hotelproject.hotel.pojo.Consumer;
import com.hotel.hotelproject.hotel.pojo.UserInfo;
import com.hotel.hotelproject.hotel.repo.ConsumerRepo;
import com.hotel.hotelproject.hotel.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;


@Component
public class ConsumerService {

   @Autowired
    private ConsumerRepo consumerRepo;

    @Autowired
    private UserRepo userRepo;

    public void register(Consumer consumer){
        Optional<UserInfo> userInfo = userRepo.findById(consumer.getId());
        if (userInfo.isPresent()) {
            consumer.setUserInfo(userInfo.get());
            consumerRepo.save(consumer);
        } else {
            System.out.println("User is not present");
        }

    }


    public void signup(Consumer consumer) {
        consumerRepo.save(consumer);
    }

    public Iterable<Consumer> getAllUser() {
        return consumerRepo.findAll();
    }
}
