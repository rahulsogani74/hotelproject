package com.hotel.hotelproject.hotel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

public class HotelFacilities {

  public HotelFacilities() {
  }

  private ArrayList<String> facilities = new ArrayList<>();

  public void add(String facilty){
    facilities.add(facilty);
  }

  public ArrayList<String> getFacilities() {
    return facilities;
  }

  public void setFacilities(ArrayList<String> facilities) {
    this.facilities = facilities;
  }
}

