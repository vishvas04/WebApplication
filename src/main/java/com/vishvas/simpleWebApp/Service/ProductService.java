package com.vishvas.simpleWebApp.Service;

import com.vishvas.simpleWebApp.Model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.*;

@Getter
@Service
public class ProductService {
    List<Product> products= new ArrayList<>(Arrays.asList(new Product("Dove",1000,100),
            new Product("Axe",900,987)));

    public Product getProductID(int prodId)
    {
//        System.out.println("Hello");
//        return products.get(0);
//        return products.stream().filter(p->p.getProductId()==prodID).findFirst();
//        return products.stream().filter(product -> product.)
        for (Product product : products) {
            if (product.getProductId() == prodId) {
                return product;
            }
        }
        return new Product("Axe",10000,prodId);
    }
    public String addProduct(Product prod){
        products.add(prod);
        return "Added";
    }

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getProductId()==prod.getProductId())
                index=i;
        }
        products.set(index,prod);
    }

    public void deleteProduct(int prodID) {
        int index=0;
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getProductId()==prodID)
                index=i;
        }
        products.remove(index);
    }
}
