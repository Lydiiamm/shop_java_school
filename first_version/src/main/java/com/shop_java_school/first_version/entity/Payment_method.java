package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Clas that selects the payment method
 */
@Entity
public class Payment_method {
    @Id
    private int idMethod;
    @Column(name="method", length=50, nullable=true, unique=false)
    private String method;

    /**
     * Constructor of the class payment method
     * @param idMethod identifier of the payment method
     * @param method actual payment method
     */

    public Payment_method(int idMethod, String method) {
        this.idMethod = idMethod;
        this.method = method;
    }

    /**
     * Getter
     * @return idMethod
     */
    public int getIdMethod() {
        return idMethod;
    }

    /**
     * Setter
     * @param idMethod
     */
    public void setIdMethod(int idMethod) {
        this.idMethod = idMethod;
    }

    /**
     * Getter
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * Setter
     * @param method
     */
    public void setMethod(String method) {
        this.method = method;
    }
}
