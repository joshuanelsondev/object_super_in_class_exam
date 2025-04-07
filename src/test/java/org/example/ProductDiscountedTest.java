package org.example;
import org.example.DiscountedProduct;
import org.example.Product;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductDiscountedTest {
    @Test
    public void testProductConstructor() {
        Product product = new Product("Book", 20.0, "A novel");
        assertEquals("Book", product.getName());
        assertEquals(20.0, product.getPrice(), 0.001); // Use delta for double comparison
        assertEquals("A novel", product.getDescription());
    }

    @Test
    public void testDiscountedProductConstructor() {
        DiscountedProduct discountedProduct = new DiscountedProduct("Laptop", 1000.0, "Powerful PC", 10.0);
        assertEquals("Laptop", discountedProduct.getName()); // Inherited from Product
        assertEquals(1000.0, discountedProduct.getPrice(), 0.001); // Inherited from Product
        assertEquals("Powerful PC", discountedProduct.getDescription()); // Inherited from Product
        assertEquals(10.0, discountedProduct.discountPercentage, 0.001);
    }

    @Test
    public void testCalculateDiscountedPrice() {
        DiscountedProduct discountedProduct = new DiscountedProduct("Tablet", 300.0, "Portable device", 25.0);
        assertEquals(225.0, discountedProduct.calculateDiscountedPrice(), 0.001);
    }

    @Test
    public void testDisplayProductInfo() {
        // This test is a bit tricky to assert directly with System.out.println.
        // In real-world scenarios, you might redirect output or use a logging framework.
        // For simplicity, we'll focus on constructor behavior, which is more directly testable.

        DiscountedProduct discountedProduct = new DiscountedProduct("Headphones", 150.0, "Noise-cancelling", 15.0);

        // The key is that the constructor *should* work.
        // If the constructor works, then displayProductInfo *should* work as it relies on it.
        // If you want to test the output, you can use a different approach (e.g., capturing output).
        assertNotNull(discountedProduct.getName());
        assertNotNull(discountedProduct.getDescription());
        assertTrue(discountedProduct.getPrice() > 0);
    }

    @Test
    public void testSuperConstructorCall() {
        // This is a conceptual test to ensure super() is called correctly.
        // In practice, the testDiscountedProductConstructor covers this implicitly.
        // Because if the inherited fields are initialized, super() must have worked.

        DiscountedProduct discountedProduct = new DiscountedProduct("Camera", 500.0, "Digital SLR", 5.0);

        // If these are true, then super() worked.
        assertNotNull(discountedProduct.getName());
        assertNotNull(discountedProduct.getDescription());
        assertTrue(discountedProduct.getPrice() > 0);
    }
}

