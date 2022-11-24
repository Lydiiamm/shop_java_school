package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class product_description {

    @Id
    private int idProductDescription;
    @Column(name="idSize", nullable=false, unique=false)
    private int idSize;
    @Column(name="idColor", nullable=false, unique=false)
    private int idColor;
    @Column(name="idProduct", nullable=false, unique=false)
    private int idProduct;
    @Column(name="stock", nullable=false, unique=false)
    private int stock;

    public product_description(int idProductDescription, int idSize, int idColor, int idProduct, int stock) {
        this.idProductDescription = idProductDescription;
        this.idSize = idSize;
        this.idColor = idColor;
        this.idProduct = idProduct;
        this.stock = stock;
    }

    public int getIdProductDescription() {
        return idProductDescription;
    }

    public void setIdProductDescription(int idProductDescription) {
        this.idProductDescription = idProductDescription;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
