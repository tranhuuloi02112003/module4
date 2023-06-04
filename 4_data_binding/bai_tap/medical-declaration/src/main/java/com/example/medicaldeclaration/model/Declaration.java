package com.example.medicaldeclaration.model;

import java.util.Date;

public class Declaration {
    private String name;
    private Date dayOfBirth;
    private String gender;//giới tính
    private String nationality;//quốc tịch
    private String idPeople;
    private String vehicle;//Phương tiện đi lại
    private String idCar;
    private int numberSeats;//Số ghế
    private String departureDate;//ngày khỏi hành
    private String endDate;
    private String address;
    private String phoneNumber;
    private String email;

    public Declaration() {
    }

    public Declaration(String name, Date dayOfBirth, String gender, String nationality, String idPeople, String vehicle, String idCar, int numberSeats, String departureDate, String endDate, String placesVisited, String address, String phoneNumber, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.idPeople = idPeople;
        this.vehicle = vehicle;
        this.idCar = idCar;
        this.numberSeats = numberSeats;
        this.departureDate = departureDate;
        this.endDate = endDate;

        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(String idPeople) {
        this.idPeople = idPeople;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
