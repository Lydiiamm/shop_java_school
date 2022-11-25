package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class is a foreign key of address, it has the country and one id that identifies
 * each one. It is in case we want to access to all the orders in one country for example.
 */
@Entity
public class Country {

    @Id
    private int idCountry;
    @Column(name="countryName", length=50, nullable=true, unique=false)
    private String countryName;

    /**
     * Contructor of the class country
     * @param idCountry identifier of the country
     * @param countryName name of the countrys
     */
    public Country(int idCountry, String countryName) {
        this.idCountry = idCountry;
        this.countryName = countryName;
    }

    /**
     * Getter
     * @return idCountry
     */
    public int getIdCountry() {
        return idCountry;
    }

    /**
     * Setter
     * @param idCountry
     */
    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    /**
     * Getter
     * @return countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Setters
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
