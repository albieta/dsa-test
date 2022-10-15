package src.Structures;

import src.Entity.Product;
import src.ComparatorsAndMore.ProductComparatorByPrice;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorStructures {
    List<Product> products;

    public ComparatorStructures(){
        this.products = new ArrayList<>();
    }

    public void addProduct(String productId, String name, double price, int numSales){
        this.products.add(new Product(productId, name, price, numSales));
    }

    public List<Product> firstOption(){
        this.products.sort(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2){
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        return this.products;
    }

    public List<Product> firstOptionWithInteger(){
        this.products.sort(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2){
                return (o1.getNumSales()-o2.getNumSales());
            }
        });
        return this.products;
    }

    public List<Product> secondOption(){
        this.products.sort((Product p1, Product p2)->Double.compare(p1.getPrice(),p2.getPrice()));
        return this.products;
    }

    public List<Product> thirdOption(){
        this.products.sort(new ProductComparatorByPrice());
        return this.products;
    }
}
