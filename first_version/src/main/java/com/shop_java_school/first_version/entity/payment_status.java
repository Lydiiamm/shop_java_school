package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class payment_status {
    @Id
    private int idPaymentStatus;
    @Column(name="statusPayment", length=50, nullable=true, unique=false)
    private String statusPayment;

    public payment_status(int idPaymentStatus, String statusPayment) {
        this.idPaymentStatus = idPaymentStatus;
        this.statusPayment = statusPayment;
    }

    public int getIdPaymentStatus() {
        return idPaymentStatus;
    }

    public void setIdPaymentStatus(int idPaymentStatus) {
        this.idPaymentStatus = idPaymentStatus;
    }

    public String getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(String statusPayment) {
        this.statusPayment = statusPayment;
    }
}
