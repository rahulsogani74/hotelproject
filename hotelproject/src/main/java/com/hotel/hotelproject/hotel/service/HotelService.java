package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.Data;
import com.hotel.hotelproject.hotel.pojo.Hotel;
import com.hotel.hotelproject.hotel.HotelRegister;
import com.hotel.hotelproject.hotel.pojo.UserInfo;
import com.hotel.hotelproject.hotel.repo.HotelRepo;
import com.hotel.hotelproject.hotel.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Component
public class HotelService {


    @Autowired
    private HotelRepo hotelRepo;

    public void signup(Hotel hotel) {
        hotelRepo.save(hotel);
    }

    public Iterable<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }


    @Autowired
    private HotelRegister hotelRegister;

    public HotelService(HotelRegister hotelRegister, Data hotelData) {
        this.hotelRegister = hotelRegister;
        this.hotelData = hotelData;
    }

    @Autowired
    private Data hotelData;
    public void register(Hotel hotel){
        hotelRepo.save(hotel);
    }

    public void deRegister(Hotel hotel){
        hotelData.remove(hotel);
    }

    public List<Hotel> listAll(){

        return hotelData.getHotelList();
    }

    public List<Hotel> getHotelByBranch(String branch) {
        List<Hotel> hotelByBranch = new ArrayList<>();
        List<Hotel> allHotels = hotelData.getHotelList();
        for (Hotel hotel : allHotels) {
            if (hotel.getBranch().equalsIgnoreCase(branch)) {
                hotelByBranch.add(hotel);
            }
        }
        return hotelByBranch;
    }

   /* public List<Hotel> getHotelByHotelId(String id) {
        List<Hotel> hotelById = new ArrayList<>();
        List<Hotel> allHotels = hotelData.getHotelList();
        for (Hotel hotel : allHotels) {
            if (hotel.getId().equals(id)) {
                hotelById.add(hotel);
            }
        }
        return hotelById;
    }*/

    /*public boolean removeHotel(String id){
        List<Hotel> hotelById = new ArrayList<>();
        List<Hotel> allHotels = hotelData.getHotelList();
        boolean isHotelRemove = false;
        ListIterator<Hotel> listIterator = allHotels.listIterator();
        while(listIterator.hasNext()) {
            Hotel hotel = listIterator.next();
           if(hotel.getId().equalsIgnoreCase(id)){
               listIterator.remove();
               isHotelRemove = true;
           }
        }
        return isHotelRemove;
    }*/
}
