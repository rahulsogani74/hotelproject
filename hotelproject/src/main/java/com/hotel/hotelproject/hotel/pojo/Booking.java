package com.hotel.hotelproject.hotel.pojo;
import java.util.Date;

public class Booking {

  private long id;
  private long hotelId;
  private long consumerId;
  private Date startDate;
  private Date endDate;
  private String pin;

  public Booking() {
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

  public long getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(long consumerId) {
    this.consumerId = consumerId;
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

  public Booking(long id, long hotelId, long consumerId, Date startDate, Date endDate, String pin) {
    this.id = id;
    this.hotelId = hotelId;
    this.consumerId = consumerId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.pin = pin;
  }

  @Override
  public String toString() {
    return "Booking{" +
            "id=" + id +
            ", hotelId=" + hotelId +
            ", consumerId=" + consumerId +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", pin='" + pin + '\'' +
            '}';
  }
}

