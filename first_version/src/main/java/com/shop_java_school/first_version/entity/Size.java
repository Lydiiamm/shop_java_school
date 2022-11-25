package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class that selects the size of the product
 */
@Entity
public class Size {

    @Id
    private int idSize;
    @Column(name="size", length=3, nullable=true, unique=false)
    private String size;

    /**
     * Constructor of the class size
     * @param idSize identifier of the size
     * @param size real size
     */
    public Size(int idSize, String size) {
        this.idSize = idSize;
        this.size = size;
    }

    /**
     * Getter
     * @return idSize
     */
    public int getIdSize() {
        return idSize;
    }

    /**
     * Setter
     * @param idSize
     */
    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    /**
     * Getter
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * Setter
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }
}
