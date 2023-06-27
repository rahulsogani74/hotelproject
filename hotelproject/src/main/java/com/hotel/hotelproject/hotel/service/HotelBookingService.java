package com.hotel.hotelproject.hotel.service;
import com.hotel.hotelproject.hotel.pojo.Consumer;
import com.hotel.hotelproject.hotel.pojo.HotelBooking;
import com.hotel.hotelproject.hotel.repo.ConsumerRepo;
import com.hotel.hotelproject.hotel.repo.HotelBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;


@Component
public class HotelBookingService {

    @Autowired
    private HotelBookingRepo hotelBookingRepo;

    @Autowired
    private ConsumerRepo consumerRepo;

    public void register(HotelBooking hotelBooking){
        Optional<Consumer> consumer = consumerRepo.findById(hotelBooking.getConsumerId());
        Iterable<Consumer> all = consumerRepo.findAll();
        if (consumer.isPresent()) {
            hotelBooking.setConsumerId(consumer.get().getId());
            hotelBooking.setConsumer(consumer.get());
            hotelBookingRepo.save(hotelBooking);
        } else {
            System.out.println("Consumer is not present");
        }
    }
    public Iterable<HotelBooking> getAllConsumer() {
        return hotelBookingRepo.findAll();
    }
}

