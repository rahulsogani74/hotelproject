package com.hotel.hotelproject.hotel.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Objects;



@Entity
@Table(name="consumer")
public class Consumer {

    public Consumer() {}

    @Id
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    @JsonBackReference(value = "userInfo-consumer")
    private UserInfo userInfo;

    @OneToOne(mappedBy = "consumer" , cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @JsonManagedReference(value = "hotelBooking-consumer")
    private HotelBooking hotelBooking;


    @JoinColumn(name = "user_name")
    private String userName;

    @JoinColumn(name = "password")
    private String password;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HotelBooking getHotelBooking() {
        return hotelBooking;
    }

    public void setHotelBooking(HotelBooking hotelBooking) {
        this.hotelBooking = hotelBooking;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                '}';
    }

}

