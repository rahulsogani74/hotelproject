package com.hotel.hotelproject.hotel.pojo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="hotel_room")
public class HotelRoom {

  @Id
  @Column(name = "id")
  private long id;

  @Column(name = "hotel_id")
  private long hotelId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "hotel_id", nullable=false, insertable = false, updatable = false)
  @JsonBackReference(value = "hotelRoom-hotel")
  private Hotel hotel;


  @JoinColumn(name = "room_number")
  private long roomNumber;

  @Column(name = "room_cat")
  private String roomCat;

 // @OneToOne(mappedBy = "hotelRoom", cascade = CascadeType.ALL)
  //@JsonManagedReference(value = "roomType-hotelRoom")
  //@JoinColumn(name = "room_cat", referencedColumnName = "id")
  //private RoomType roomType;


  @Column(name = "room_status")
  private String roomStatus;

  public HotelRoom() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public long getHotelId() {
    return hotelId;
  }

  public void setHotelId(long hotelId) {
    this.hotelId = hotelId;
  }

  public long getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(long roomNumber) {
    this.roomNumber = roomNumber;
  }

  public String getRoomCat() {
    return roomCat;
  }

  public void setRoomCat(String roomCat) {
    this.roomCat = roomCat;
  }

//  public RoomType getRoomType() {
//    return roomType;
//  }
//
//  public void setRoomType(RoomType roomType) {
//    this.roomType = roomType;
//  }

  public String getRoomStatus() {
    return roomStatus;
  }

  public void setRoomStatus(String roomStatus) {
    this.roomStatus = roomStatus;
  }

  public HotelRoom(long id, Hotel hotel, long hotelId, long roomNumber, String roomCat, RoomType roomType, String roomStatus) {
    this.id = id;
    this.hotel = hotel;
    this.hotelId = hotelId;
    this.roomNumber = roomNumber;
    this.roomCat = roomCat;
 //   this.roomType = roomType;
    this.roomStatus = roomStatus;
  }

  @Override
  public String toString() {
    return "HotelRoom{" +
            "id=" + id +
            ", hotel=" + hotel +
            ", hotelId=" + hotelId +
            ", roomNumber=" + roomNumber +
            ", roomCat='" + roomCat + '\'' +
      //     ", roomType=" + roomType +
            ", roomStatus='" + roomStatus + '\'' +
            '}';
  }
}

