package com.hotel.hotelproject.hotel.pojo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Data {
   private List<Hotel> hotelList = new ArrayList<>();
   private int id = 1;

    public void add(Hotel hotel) {
        //hotel.setId("hotel-" + id++);
        hotelList.add(hotel);
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void remove(Hotel hotel){
        hotelList.remove(hotel);
    }
}
