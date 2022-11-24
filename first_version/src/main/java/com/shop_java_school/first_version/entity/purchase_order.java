package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

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

    public purchase_order(int idOrder, int idCustomer, int idAddress, int paymentMethod, String deliveryMethod, int paymentStatus, int orderStatus) {
        this.idOrder = idOrder;
        this.idCustomer = idCustomer;
        this.idAddress = idAddress;
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
        this.paymentStatus = paymentStatus;
        this.orderStatus = orderStatus;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
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

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }
}
