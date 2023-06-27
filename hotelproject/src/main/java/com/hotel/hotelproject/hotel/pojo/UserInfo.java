package com.hotel.hotelproject.hotel.pojo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="userInfo")
public class UserInfo {

    public UserInfo() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(mappedBy = "userInfo" , cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @JsonManagedReference(value = "userInfo-consumer")
    private Consumer consumer;

    @OneToOne(mappedBy = "userInfo" , cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @JsonManagedReference(value = "userInfo-hotelManager")
    private HotelManager hotelManager;

    @OneToOne(mappedBy = "userInfo" , cascade = {CascadeType.ALL, CascadeType.MERGE})
    @PrimaryKeyJoinColumn
    @JsonManagedReference(value = "userInfo-hotelOwner")
    private HotelOwner hotelOwner;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="phone_num")
    private Integer phoneNum;

    @Column(name="email")
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public HotelOwner getHotelOwner() {
        return hotelOwner;
    }

    public void setHotelOwner(HotelOwner hotelOwner) {
        this.hotelOwner = hotelOwner;
    }

    public HotelManager getHotelManager() {
        return hotelManager;
    }

    public void setHotelManager(HotelManager hotelManager) {
        this.hotelManager = hotelManager;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return id == userInfo.id && Objects.equals(name, userInfo.name) && Objects.equals(address, userInfo.address) && Objects.equals(phoneNum, userInfo.phoneNum) && Objects.equals(email, userInfo.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNum, email);
    }
}
