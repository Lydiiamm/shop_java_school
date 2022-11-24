package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class that selects the status of the order
 */
@Entity
public class order_status {

    @Id
    private int idOrderStatus;
    @Column(name="status_order", length=50, nullable=true, unique=false)
    private String status_order;

    /**
     * Constructor of the class order_status
     * @param idOrderStatus identifier of the status
     * @param status_order real status
     */
    public order_status(int idOrderStatus, String status_order) {
        this.idOrderStatus = idOrderStatus;
        this.status_order = status_order;
    }

    /**
     * Getter
     * @return idOrderStatus
     */
    public int getIdOrderStatus() {
        return idOrderStatus;
    }

    /**
     * Setter
     * @param idOrderStatus
     */
    public void setIdOrderStatus(int idOrderStatus) {
        this.idOrderStatus = idOrderStatus;
    }

    /**
     * Getter
     * @return status_order
     */
    public String getStatus_order() {
        return status_order;
    }

    /**
     * Setters
     * @param status_order
     */
    public void setStatus_order(String status_order) {
        this.status_order = status_order;
    }
}
