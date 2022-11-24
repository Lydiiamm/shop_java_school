package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class color {

    @Id
    private int idColor;
    @Column(name="color", length=10, nullable=true, unique=false)
    private String color;

    public color(int idColor, String color) {
        this.idColor = idColor;
        this.color = color;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
