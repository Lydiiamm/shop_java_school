package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class address {
    @Id
    private int idAddress;
    @Column(name="country", nullable=true, unique=false)
    private int country;
    @Column(name="city", length=50, nullable=true, unique=false)
    private String city;
    @Column(name="postalCode", length=50, nullable=true, unique=false)
    private String postalCode;
    @Column(name="streetLine1", length=50, nullable=true, unique=false)
    private String streetLine1;
    @Column(name="streetLine2", length=50, nullable=true, unique=false)
    private String streetLine2;
    @Column(name="home", length=50, nullable=true, unique=false)
    private String home;
    @Column(name="apartment", length=50, nullable=true, unique=false)
    private String apartment;

    public address(int idAddress, int country, String city, String postalCode, String streetLine1, String streetLine2, String home, String apartment) {
        this.idAddress = idAddress;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.streetLine1 = streetLine1;
        this.streetLine2 = streetLine2;
        this.home = home;
        this.apartment = apartment;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
