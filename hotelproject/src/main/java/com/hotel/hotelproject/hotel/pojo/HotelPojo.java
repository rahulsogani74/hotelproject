package com.hotel.hotelproject.hotel.pojo;

public class HotelPojo {

    private long hotelId;
    private String name;
    private long ownerId;
    private long managerId;
    private long phoneNum;
    private String address;
    private String branch;
    private long roomNumber;
    private String roomCat;
    private String roomStatus;
    private long numPeople;
    private Boolean extraBed;
    private long priceRate;
    private long roomId;


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

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
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

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

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

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public HotelPojo() {
    }

    public HotelPojo(long hotelId, String name, long ownerId, long managerId, long phoneNum, String address, String branch, long roomNumber, String roomCat, String roomStatus, long numPeople, Boolean extraBed, long priceRate, long roomId) {
        this.hotelId = hotelId;
        this.name = name;
        this.ownerId = ownerId;
        this.managerId = managerId;
        this.phoneNum = phoneNum;
        this.address = address;
        this.branch = branch;
        this.roomNumber = roomNumber;
        this.roomCat = roomCat;
        this.roomStatus = roomStatus;
        this.numPeople = numPeople;
        this.extraBed = extraBed;
        this.priceRate = priceRate;
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "HotelPojo{" +
                "hotelId=" + hotelId +
                ", name='" + name + '\'' +
                ", ownerId=" + ownerId +
                ", managerId=" + managerId +
                ", phoneNum=" + phoneNum +
                ", address='" + address + '\'' +
                ", branch='" + branch + '\'' +
                ", roomNumber=" + roomNumber +
                ", roomCat='" + roomCat + '\'' +
                ", roomStatus='" + roomStatus + '\'' +
                ", numPeople=" + numPeople +
                ", extraBed=" + extraBed +
                ", priceRate=" + priceRate +
                ", roomId=" + roomId +
                '}';
    }
}