package com.hotel.hotelproject;

import com.hotel.hotelproject.hotel.*;
import com.hotel.hotelproject.hotel.controller.GeneralController;
import com.hotel.hotelproject.hotel.pojo.Data;
import com.hotel.hotelproject.hotel.pojo.Hotel;
import com.hotel.hotelproject.hotel.pojo.HotelRoom;
import com.hotel.hotelproject.hotel.service.HotelService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        HotelRegister hotelRegister = new HotelRegister();
        Data data = new Data();
        HotelService hotelService = new HotelService(hotelRegister, data);
        GeneralController hotelControllers = new GeneralController(hotelService);
        hotelControllers.registerHotel(main.getHotel("Jaipur"));
        hotelControllers.registerHotel(main.getHotel("Tonk"));
        hotelControllers.registerHotel(main.getHotel("Kota"));
        hotelControllers.registerHotel(main.getHotel("Panipat"));
        //List<Hotel> hotelList = hotelControllers.getAllHotel();
        List<Hotel> hotelByBranch = hotelControllers.getHotelByBranch("Jaipur");
        /*if (!hotelByBranch.isEmpty() && hotelByBranch.size() == 1) {
            boolean isRemoved = hotelControllers.deRegisterHotel(hotelByBranch.get(0).getId());
            System.out.println(isRemoved);
        }*/

       // hotelControllers.deRegisterHotel(main.removeHotel());
        System.out.println("End");
    }

    public Hotel getHotel(String branchName) {
        Hotel hotel = new Hotel();

//        List<HotelRoom> rooms = new ArrayList<>();
////        HotelRoom room = new HotelRoom(101,"Deluxe");
//        rooms.add(room);
//        hotel.setRooms(rooms);

        hotel.setBranch(branchName);

//        HotelFacilities hotelFacilities = new HotelFacilities();
//        hotelFacilities.add("Wifi");
//        hotel.setHotelFacilities(hotelFacilities);
        return hotel;
    }

//    public Hotel removeHotel(){
//        Hotel hotel = new Hotel();
//        List<Room> rooms=new ArrayList<>();
//        Room room = new Room(101,"Deluxe");
//        rooms.remove(room);
//        hotel.setRooms(rooms);
//        return hotel;
//    }

}
