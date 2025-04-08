package org.example;

public class DiscountedProduct extends Product {
    public double discountPercentage;

    public DiscountedProduct(String name, double price, String description, double discountPercentage) {
        super(name, price, description);
        this.discountPercentage = discountPercentage;
    }

    public double calculateDiscountedPrice() {

       return price * ((100 - discountPercentage) * 0.01);
    }


}