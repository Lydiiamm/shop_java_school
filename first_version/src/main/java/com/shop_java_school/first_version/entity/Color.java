package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class to choose the clothes color, it can be null. Each color has an id.
 */
@Entity
public class Color {

    @Id
    private int idColor;
    @Column(name="color", length=10, nullable=true, unique=false)
    private String color;

    /**
     * Constructor of the class color
     * @param idColor identifier of the color
     * @param color name of the color
     */
    public Color(int idColor, String color) {
        this.idColor = idColor;
        this.color = color;
    }

    /**
     * Getter
     * @return idColor
     */
    public int getIdColor() {
        return idColor;
    }

    /**
     * Setter
     * @param idColor
     */
    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    /**
     * Getter
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
