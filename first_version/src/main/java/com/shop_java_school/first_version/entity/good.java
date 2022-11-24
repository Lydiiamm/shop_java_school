package com.shop_java_school.first_version.entity;

import javax.persistence.Column;

public class good {

    @Column(name="idOrder", nullable=false, unique=false)
    private int idOrder;
    @Column(name="idProductDescription", nullable=false, unique=false)
    private int idProductDescription;
    @Column(name="quantity", nullable=false, unique=false)
    private int quantity;

    public good(int idOrder, int idProductDescription, int quantity) {
        this.idOrder = idOrder;
        this.idProductDescription = idProductDescription;
        this.quantity = quantity;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdProductDescription() {
        return idProductDescription;
    }

    public void setIdProductDescription(int idProductDescription) {
        this.idProductDescription = idProductDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
