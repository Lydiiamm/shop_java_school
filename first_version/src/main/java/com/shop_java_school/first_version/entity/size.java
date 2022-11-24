package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class size {

    @Id
    private int idSize;
    @Column(name="size", length=3, nullable=true, unique=false)
    private String size;

    public size(int idSize, String size) {
        this.idSize = idSize;
        this.size = size;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
