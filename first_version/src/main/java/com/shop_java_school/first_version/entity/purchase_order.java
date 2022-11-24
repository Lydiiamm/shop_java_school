package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.Id;
import java.util.Date;

/**
 * Class that constains all the relevant information about one order
 */
@Entity
public class purchase_order {

    @Id
    private int idOrder;
    @Column(name="idCustomer", nullable=false, unique=false)
    private int idCustomer;
    @Column(name="idAddress", nullable=true, unique=false)
    private int idAddress;
    @Column(name="paymentMethod", nullable=true, unique=false)
    private int paymentMethod;
    @Column(name="deliveryMethod", length=50, nullable=true, unique=false)
    private String deliveryMethod;
    @Column(name="paymentStatus", nullable=true, unique=false)
    private int paymentStatus;
    @Column(name="orderStatus", nullable=true, unique=false)
    private int orderStatus;

    /**
     * Constructor of the class purchase_order
     * @param idOrder identifier of the order
     * @param idCustomer identifier of the costumer
     * @param idAddress identifier of the address
     * @param paymentMethod identifier of the payment method
     * @param deliveryMethod delivery method selected
     * @param paymentStatus identifier of the payment status
     * @param orderStatus identifier of the order status
     */
    public purchase_order(int idOrder, int idCustomer, int idAddress, int paymentMethod, String deliveryMethod, int paymentStatus, int orderStatus) {
        this.idOrder = idOrder;
        this.idCustomer = idCustomer;
        this.idAddress = idAddress;
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
        this.paymentStatus = paymentStatus;
        this.orderStatus = orderStatus;
    }

    /**
     * Getter
     * @return idOrder
     */
    public int getIdOrder() {
        return idOrder;
    }

    /**
     * Setter
     * @param idOrder
     */
    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
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

    /**
     * Getter
     * @return paymentMethod
     */
    public int getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Getter
     * @return deliveryMethod
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Setter
     * @param deliveryMethod
     */
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    /**
     * Getter
     * @return paymentStatus
     */
    public int getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Getter
     * @return orderStatus
     */
    public int getOrderStatus() {
        return orderStatus;
    }

}
