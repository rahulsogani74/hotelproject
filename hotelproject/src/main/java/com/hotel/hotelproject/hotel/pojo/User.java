package com.hotel.hotelproject.hotel.pojo;

public class User {

    public User() {}

    private long id;
    private String name;
    private String address;
    private Integer phoneNum;
    private String email;

    private String userName;
    private String password;

    boolean isConsumer = false;
    boolean isHotelOwner = false;
    boolean isHotelManager = false;

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

    public boolean isConsumer() {
        return isConsumer;
    }

    public void setConsumer(boolean consumer) {
        isConsumer = consumer;
    }

    public boolean isHotelOwner() {
        return isHotelOwner;
    }

    public void setHotelOwner(boolean hotelOwner) {
        isHotelOwner = hotelOwner;
    }

    public boolean isHotelManager() {
        return isHotelManager;
    }

    public void setHotelManager(boolean hotelManager) {
        isHotelManager = hotelManager;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User(long id, String name, String address, Integer phoneNum, String email, String userName, String password, boolean isConsumer, boolean isHotelOwner, boolean isHotelManager) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.isConsumer = isConsumer;
        this.isHotelOwner = isHotelOwner;
        this.isHotelManager = isHotelManager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isConsumer=" + isConsumer +
                ", isHotelOwner=" + isHotelOwner +
                ", isHotelManager=" + isHotelManager +
                '}';
    }
}



