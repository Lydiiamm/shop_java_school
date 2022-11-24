package com.shop_java_school.first_version.entity;

import javax.persistence.Column;

public class customerAddress {
    @Column(name="idCustomer", nullable=false, unique=false)
    private int idCustomer;
    @Column(name="idAddress", nullable=false, unique=false)
    private int idAddress;

    public customerAddress(int idCustomer, int idAddress) {
        this.idCustomer = idCustomer;
        this.idAddress = idAddress;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }
}
