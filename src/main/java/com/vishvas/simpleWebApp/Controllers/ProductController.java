package com.vishvas.simpleWebApp.Controllers;

import com.vishvas.simpleWebApp.Model.Product;
import com.vishvas.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @RequestMapping("/product")
    public List<Product> greet(){
//        return "Hello";
        return service.getProducts();
    }

}
