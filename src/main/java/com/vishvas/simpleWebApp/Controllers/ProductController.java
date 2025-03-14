package com.vishvas.simpleWebApp.Controllers;

import com.vishvas.simpleWebApp.Model.Product;
import com.vishvas.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @GetMapping("/product")
    public List<Product> getProducts(){
//        return "Hello";
        return service.getProducts();
    }

    @GetMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductID(prodId);
//        return
    }

    @PostMapping("/product")
    public String addProduct(@RequestBody Product prod)
    {
        service.addProduct(prod);
        return "Added";
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod)
    {
        service.updateProduct(prod);
    }

    @DeleteMapping("/product/{prodID}")
    public void deleteProduct(@PathVariable int prodID)
    {
        service.deleteProduct(prodID);
    }
}
