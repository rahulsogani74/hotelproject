package com.hotel.hotelproject.hotel.pojo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="booking")
public class HotelBooking {

  @Id
  @JoinColumn(name = "id")
  private long id;


  @Column(name = "hotel_id")
  private long hotelId;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "hotel_id",insertable = false, updatable = false)
  @JsonBackReference(value = "hotelBooking-hotel")
  private Hotel hotel;


  @Column(name = "consumer_id",insertable = false, updatable = false)
  private long consumerId;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "consumer_id")
  @JsonBackReference(value = "hotelBooking-consumer")
  private Consumer consumer;

  @JoinColumn(name = "start_date")
  private Date startDate;

  @JoinColumn(name = "end_date")
  private Date endDate;

  @JoinColumn(name = "pin")
  private String pin;

  public HotelBooking() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getHotelId() {
    return hotelId;
  }

  public void setHotelId(long hotelId) {
    this.hotelId = hotelId;
  }

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public long getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(long consumerId) {
    this.consumerId = consumerId;
  }

  public Consumer getConsumer() {
    return consumer;
  }

  public void setConsumer(Consumer consumer) {
    this.consumer = consumer;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public HotelBooking(long id, long hotelId, Hotel hotel, long consumerId, Consumer consumer, Date startDate, Date endDate, String pin) {
    this.id = id;
    this.hotelId = hotelId;
    this.hotel = hotel;
    this.consumerId = consumerId;
    this.consumer = consumer;
    this.startDate = startDate;
    this.endDate = endDate;
    this.pin = pin;
  }

  @Override
  public String toString() {
    return "HotelBooking{" +
            "id=" + id +
            ", hotelId=" + hotelId +
            ", hotel=" + hotel +
            ", consumerId=" + consumerId +
            ", consumer=" + consumer +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", pin='" + pin + '\'' +
            '}';
  }
}

