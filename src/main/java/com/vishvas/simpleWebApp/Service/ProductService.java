package com.vishvas.simpleWebApp.Service;

import com.vishvas.simpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;

@Service
public class ProductService {
    List<Product> products= Arrays.asList(new Product("Dove",1000,100),
            new Product("Axe",900,987));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductID(int prodID)
    {
//        System.out.println("Hello");
        return products.get(0);
    }

}
