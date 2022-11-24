package com.shop_java_school.first_version.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class product {
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

    public product(int idProduct, int price, String category, float weight, float volume) {
        this.idProduct = idProduct;
        this.price = price;
        this.category = category;
        this.weight = weight;
        this.volume = volume;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
