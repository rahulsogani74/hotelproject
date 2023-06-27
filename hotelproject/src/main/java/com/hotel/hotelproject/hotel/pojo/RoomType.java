package com.hotel.hotelproject.hotel.pojo;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="room_type")
public class RoomType {

  @Id
  @Column(name = "id")
  private String id;

  //@OneToOne(cascade = CascadeType.ALL)
  //@JoinColumn(name = "id", referencedColumnName = "room_cat")
  //@MapsId
  //@JsonBackReference(value = "roomType-hotelRoom")
  //private HotelRoom hotelRoom;

  @JoinColumn(name = "num_people")
  private long numPeople;

  @JoinColumn(name = "extra_bed")
  private Boolean extraBed;

  @JoinColumn(name = "price_rate")
  private long priceRate;

  public RoomType() {
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

//  public HotelRoom getHotelRoom() {
//    return hotelRoom;
//  }

//  public void setHotelRoom(HotelRoom hotelRoom) {
//    this.hotelRoom = hotelRoom;
//  }

  public long getNumPeople() {
    return numPeople;
  }

  public void setNumPeople(long numPeople) {
    this.numPeople = numPeople;
  }

  public Boolean getExtraBed() {
    return extraBed;
  }

  public void setExtraBed(Boolean extraBed) {
    this.extraBed = extraBed;
  }

  public long getPriceRate() {
    return priceRate;
  }

  public void setPriceRate(long priceRate) {
    this.priceRate = priceRate;
  }

  public RoomType(String id, HotelRoom hotelRoom, Hotel hotel, long numPeople, Boolean extraBed, long priceRate) {
    this.id = id;
//    this.hotelRoom = hotelRoom;
    this.numPeople = numPeople;
    this.extraBed = extraBed;
    this.priceRate = priceRate;
  }

  @Override
  public String toString() {
    return "RoomType{" +
            "id=" + id +
            ", numPeople=" + numPeople +
            ", extraBed=" + extraBed +
            ", priceRate=" + priceRate +
            '}';
  }
}

