package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class is the entity of the address of the client, it includes an address id
 * that is the primary key and all the relevant information.
 */
@Entity
public class address {
    @Id
    private int idAddress;
    @Column(name="idCountry", nullable=true, unique=false)
    private int idCountry;
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

    /**
     *  Constructor of the class
     * @param idAddress identification of the whole address
     * @param idCountry identifier of the country
     * @param city name of the city
     * @param postalCode postalCode
     * @param streetLine1   street
     * @param streetLine2 additional information about the street
     * @param home  number on the street
     * @param apartment floor and letter
     */
    public address(int idAddress, int country, String city, String postalCode, String streetLine1, String streetLine2, String home, String apartment) {
        this.idAddress = idAddress;
        this.idCountry = country;
        this.city = city;
        this.postalCode = postalCode;
        this.streetLine1 = streetLine1;
        this.streetLine2 = streetLine2;
        this.home = home;
        this.apartment = apartment;
    }

    /**
     * Getter
     * @return idAddress
     */
    public int getIdAddress() {
        return idAddress;
    }

    /**
     * Setter
     * @param idAddress
     */
    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    /**
     * Getter
     * @return idCountry
     */
    public int getCountry() {
        return idCountry;
    }
    //I dont know if it needs a setter but country is a foreign key of address, so I set the color on its own table.

    /**
     * Getter
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Getter
     * @return streetLine1
     */
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Setter
     * @param streetLine1
     */
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }
    /**
     * Getter
     * @return streetLine2
     */
    public String getStreetLine2() {
        return streetLine2;
    }
    /**
     * Setter
     * @param streetLine2
     */
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    /**
     * Getter
     * @return home
     */
    public String getHome() {
        return home;
    }

    /**
     * Setter
     * @param home
     */
    public void setHome(String home) {
        this.home = home;
    }

    /**
     * Getter
     * @return apartment
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Setter
     * @param apartment
     */
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
