package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;


/**
 * Class that relates the idOrder and the idProductDescription with the quantity
 */
@Entity
public class Good {
    @Column(name="idOrder", nullable=false, unique=false)
    private int idOrder;
    @Column(name="idProductDescription", nullable=false, unique=false)
    private int idProductDescription;
    @Column(name="quantity", nullable=false, unique=false)
    private int quantity;

    /**
     * Constructor of the class good
     * @param idOrder identier of the order
     * @param idProductDescription identifier of the parameters of the product
     * @param quantity quantity of the same product
     */
    public Good(int idOrder, int idProductDescription, int quantity) {
        this.idOrder = idOrder;
        this.idProductDescription = idProductDescription;
        this.quantity = quantity;
    }

    /**
     * Getter
     * @return idOrder
     */
    public int getIdOrder() {
        return idOrder;
    }

    /**
     * Getter
     * @return idProductDescription
     */
    public int getIdProductDescription() {
        return idProductDescription;
    }

    /**
     * Getter
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
