package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class that relates all the relevant information about the products of an order
 */
@Entity
public class Product_description {

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


    /**
     * Constructor of the class product_description
     * @param idProductDescription indentifier of a product with al its characteristics
     * @param idSize identifier of the size
     * @param idColor identifier of the color
     * @param idProduct identifier of the product
     * @param stock quantity on stock
     */
    public Product_description(int idProductDescription, int idSize, int idColor, int idProduct, int stock) {
        this.idProductDescription = idProductDescription;
        this.idSize = idSize;
        this.idColor = idColor;
        this.idProduct = idProduct;
        this.stock = stock;
    }

    /**
     * Getter
     * @return idProductDescription
     */
    public int getIdProductDescription() {
        return idProductDescription;
    }

    /**
     * Setter
     * @param idProductDescription
     */
    public void setIdProductDescription(int idProductDescription) {
        this.idProductDescription = idProductDescription;
    }

    /**
     * Getter
     * @return idSize
     */
    public int getIdSize() {
        return idSize;
    }

    /**
     * Getter
     * @return idColor
     */
    public int getIdColor() {
        return idColor;
    }

    /**
     * Getter
     * @return idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * Getter
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Setter
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
