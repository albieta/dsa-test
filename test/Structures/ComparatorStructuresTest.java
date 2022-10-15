package test.Structures;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.Entity.Product;
import src.Structures.ComparatorStructures;

import java.util.List;

public class ComparatorStructuresTest {
    ComparatorStructures comparatorStructures;

    @Before
    public void setUp() {
        this.comparatorStructures = new ComparatorStructures();
        this.comparatorStructures.addProduct("01a", "papas", 1.8, 0);
        this.comparatorStructures.addProduct("01b", "olivas", 2.2, 2);
        this.comparatorStructures.addProduct("01c", "cocacola", 1.5, 1);
        this.comparatorStructures.addProduct("01d", "queso", 2, 3);
    }

    @After
    public void tearDown() {
        this.comparatorStructures = null;
    }

    @Test
    public void first_option_orders_products_by_price() {
        List<Product> productsAfterOrder = this.comparatorStructures.firstOption();
        Assert.assertEquals("01c", productsAfterOrder.get(0).getProductId());
        Assert.assertEquals("01b", productsAfterOrder.get(3).getProductId());
    }

    @Test
    public void first_option_orders_products_by_sales() {
        List<Product> productsAfterOrder = this.comparatorStructures.firstOptionWithInteger();
        Assert.assertEquals("01a", productsAfterOrder.get(0).getProductId());
        Assert.assertEquals("01d", productsAfterOrder.get(3).getProductId());
    }

    @Test
    public void second_option_orders_products_by_price() {
        List<Product> productsAfterOrder = this.comparatorStructures.secondOption();
        Assert.assertEquals("01c", productsAfterOrder.get(0).getProductId());
        Assert.assertEquals("01b", productsAfterOrder.get(3).getProductId());
    }

    @Test
    public void third_option_orders_products_by_price() {
        List<Product> productsAfterOrder = this.comparatorStructures.thirdOption();
        Assert.assertEquals("01c", productsAfterOrder.get(0).getProductId());
        Assert.assertEquals("01b", productsAfterOrder.get(3).getProductId());
    }
}