package com.hotel.hotelproject.hotel.pojo;

public class HotelSearch {

    private long hotelId;
    private String name;
    private long phoneNum;
    private String address;
    private String branch;
    private String roomCat;
    private long priceRate;

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRoomCat() {
        return roomCat;
    }

    public void setRoomCat(String roomCat) {
        this.roomCat = roomCat;
    }

    public long getPriceRate() {
        return priceRate;
    }

    public void setPriceRate(long priceRate) {
        this.priceRate = priceRate;
    }

    public HotelSearch() {
    }

    public HotelSearch(long hotelId, String name, long ownerId, long managerId, long phoneNum, String address, String branch, long roomNumber, String roomCat, String roomStatus, long numPeople, Boolean extraBed, long priceRate, long roomId) {
        this.hotelId = hotelId;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.branch = branch;
        this.roomCat = roomCat;
        this.priceRate = priceRate;
    }

    @Override
    public String toString() {
        return "HotelPojo{" +
                "hotelId=" + hotelId +
                ", name='" + name + '\'' +
                ", phoneNum=" + phoneNum +
                ", address='" + address + '\'' +
                ", branch='" + branch + '\'' +
                ", roomCat='" + roomCat + '\'' +
                ", priceRate=" + priceRate +
                '}';
    }
}