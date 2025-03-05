package com.vishvas.simpleWebApp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping("/product")
    public String greet(){
        return "Hello";
    }
}
