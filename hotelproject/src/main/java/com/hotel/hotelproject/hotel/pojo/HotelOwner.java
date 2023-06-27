package com.hotel.hotelproject.hotel.pojo;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Objects;



@Entity
@Table(name="hotelOwner")
public class HotelOwner {

    public HotelOwner () {}

    @Id
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = {CascadeType.ALL, CascadeType.MERGE})
    @MapsId
    @JoinColumn(name = "id")
    @JsonBackReference(value = "userInfo-hotelOwner")
    private UserInfo userInfo;

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

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelOwner that = (HotelOwner) o;
        return Objects.equals(id, that.id) && Objects.equals(userName, that.userName) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password);
    }

    @Override
    public String toString() {
        return "HotelOwner{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
