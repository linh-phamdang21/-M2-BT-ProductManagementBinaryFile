package model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brand;
    private int price;

    public Product(){

    }

    public Product(int id, String name, String brand, int price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void editProduct(String name, String brand, int price){
        this.setName(name);
        this.setBrand(brand);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return  "ID=" + this.id +
                ", name='" + this.name + '\'' +
                ", brand='" + this.brand + '\'' +
                ", price=" + this.price;
    }
}
