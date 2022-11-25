package com.shop_java_school.first_version.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class that has all the information of a selected product
 */
@Entity
public class Product {
    @Id
    private int idProduct;
    @Column(name="price", nullable=false, unique=false)
    private int price;
    @Column(name="category", length=50, nullable=false, unique=false)
    private String category;
    @Column(name="weight", nullable=false, unique=false)
    private float weight;
    @Column(name="volume", nullable=false, unique=false)
    private float volume;

    /**
     * Constructor of the class product
     * @param idProduct identifier of the product
     * @param price price of the product
     * @param category category of the product
     * @param weight weight of the product
     * @param volume volume of the product
     */
    public Product(int idProduct, int price, String category, float weight, float volume) {
        this.idProduct = idProduct;
        this.price = price;
        this.category = category;
        this.weight = weight;
        this.volume = volume;
    }

    /**
     * Getter
     * @return idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * Setter
     * @param idProduct
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * Getter
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Getter
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Setter
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter
     * @return weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Setter
     * @param weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Getter
     * @return volume
     */
    public float getVolume() {
        return volume;
    }

    /**
     * Setter
     * @param volume
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }
}
