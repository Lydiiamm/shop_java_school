package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class order_status {

    @Id
    private int idOrderStatus;
    @Column(name="status_order", length=50, nullable=true, unique=false)
    private String status_order;

    public order_status(int idOrderStatus, String status_order) {
        this.idOrderStatus = idOrderStatus;
        this.status_order = status_order;
    }

    public int getIdOrderStatus() {
        return idOrderStatus;
    }

    public void setIdOrderStatus(int idOrderStatus) {
        this.idOrderStatus = idOrderStatus;
    }

    public String getStatus_order() {
        return status_order;
    }

    public void setStatus_order(String status_order) {
        this.status_order = status_order;
    }
}
