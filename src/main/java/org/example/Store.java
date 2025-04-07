package org.example;

public class Store {
    public static void main(String[] args) {
        Product regularProduct = new Product("Laptop", 1200.0, "High-performance laptop");
        DiscountedProduct discountedProduct = new DiscountedProduct("Smartphone", 800.0, "Latest model smartphone", 20.0);

        System.out.println("Regular Product Info:");
        regularProduct.displayProductInfo();

        System.out.println("\nDiscounted Product Info:");
        discountedProduct.displayProductInfo();
    }
}
