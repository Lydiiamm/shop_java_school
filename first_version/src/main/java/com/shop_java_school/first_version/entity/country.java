package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class country {

    @Id
    private int idCountry;
    @Column(name="countryName", length=50, nullable=true, unique=false)
    private String countryName;

    public country(int idCountry, String countryName) {
        this.idCountry = idCountry;
        this.countryName = countryName;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
