package com.hotel.hotelproject.hotel.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name="hotel")
public class Hotel {


    @Column(name = "name")
    private String name;

    @Column(name = "manager_id")
    private long managerId;

    @Column(name = "owner_id")
    private long ownerId;

    @Column(name = "phone_num")
    private long phoneNum;

    @Column(name = "address")
    private String address;

    @Column(name = "branch")
    private String branch;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private long hotelId;

    @OneToMany(mappedBy = "hotel" , cascade = CascadeType.ALL)
    @JsonManagedReference(value = "hotelRoom-hotel")
    private Set<HotelRoom> hotelRooms;

    @OneToOne(mappedBy = "hotel" , cascade = CascadeType.ALL)
    @JsonManagedReference(value = "hotelBooking-hotel")
    private HotelBooking hotelBooking;

    public HotelBooking getHotelBooking() {
        return hotelBooking;
    }

    public void setHotelBooking(HotelBooking hotelBooking) {
        this.hotelBooking = hotelBooking;
        if (hotelBooking != null) {
            hotelBooking.setHotel(this);
        }
    }

    public Hotel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public Set<HotelRoom> getHotelRooms() {
        return hotelRooms;
    }

    public void setHotelRooms(Set<HotelRoom> hotelRooms) {
        this.hotelRooms = hotelRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return managerId == hotel.managerId && ownerId == hotel.ownerId && phoneNum == hotel.phoneNum && hotelId == hotel.hotelId && Objects.equals(name, hotel.name) && Objects.equals(address, hotel.address) && Objects.equals(branch, hotel.branch) && Objects.equals(hotelRooms, hotel.hotelRooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, managerId, ownerId, phoneNum, address, branch, hotelId, hotelRooms);
    }
}

