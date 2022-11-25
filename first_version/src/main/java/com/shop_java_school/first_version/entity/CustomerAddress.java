package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Class customerAddress it connects the idCustomer and idAddress
 */
@Entity
public class CustomerAddress {
    @Column(name="idCustomer", nullable=false, unique=false)
    private int idCustomer;
    @Column(name="idAddress", nullable=false, unique=false)
    private int idAddress;

    /**
     * Constructor of the class customerAddress
     * @param idCustomer identifier of the customer
     * @param idAddress identifier of the address
     */
    public CustomerAddress(int idCustomer, int idAddress) {
        this.idCustomer = idCustomer;
        this.idAddress = idAddress;
    }

    /**
     * Getter
     * @return idCustomer
     */
    public int getIdCustomer() {
        return idCustomer;
    }

    /**
     * Getter
     * @return idAddress
     */
    public int getIdAddress() {
        return idAddress;
    }

}
