package com.hotel.hotelproject.hotel.service;

import com.hotel.hotelproject.hotel.pojo.*;
import com.hotel.hotelproject.hotel.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Component
@Service
public class QueryService {

        private HotelRepo hotelRepo;

        @Autowired
        public QueryService(HotelRepo hotelRepo) {
            this.hotelRepo = hotelRepo;
        }

        public List<Hotel> searchHotels(String branch, long priceRate) {
            return hotelRepo.findHotel(branch, priceRate);
        }

}
