package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class payment_method {
    @Id
    private int idMethod;
    @Column(name="method", length=50, nullable=true, unique=false)
    private String method;

    public payment_method(int idMethod, String method) {
        this.idMethod = idMethod;
        this.method = method;
    }

    public int getIdMethod() {
        return idMethod;
    }

    public void setIdMethod(int idMethod) {
        this.idMethod = idMethod;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
