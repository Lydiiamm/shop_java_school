package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class that selects the status of a selected payment
 */
@Entity
public class payment_status {
    @Id
    private int idPaymentStatus;
    @Column(name="statusPayment", length=50, nullable=true, unique=false)
    private String statusPayment;

    /**
     * Contructor of the class payment_status
     * @param idPaymentStatus identifier of the status
     * @param statusPayment actual status
     */
    public payment_status(int idPaymentStatus, String statusPayment) {
        this.idPaymentStatus = idPaymentStatus;
        this.statusPayment = statusPayment;
    }

    /**
     * Getter
     * @return idPaymentStatus
     */
    public int getIdPaymentStatus() {
        return idPaymentStatus;
    }

    /**
     * Setter
     * @param idPaymentStatus
     */
    public void setIdPaymentStatus(int idPaymentStatus) {
        this.idPaymentStatus = idPaymentStatus;
    }

    /**
     * Getter
     * @return statusPayment
     */
    public String getStatusPayment() {
        return statusPayment;
    }

    /**
     * Setter
     * @param statusPayment
     */
    public void setStatusPayment(String statusPayment) {
        this.statusPayment = statusPayment;
    }
}
