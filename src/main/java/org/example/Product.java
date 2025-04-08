package org.example;

public class Product {
    private String name;
    public double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public void displayProductInfo() {
        System.out.printf("Product Name: %s, Product Price: %s, Product Description: %s", this.name, this.price, this.description);
    }


}
