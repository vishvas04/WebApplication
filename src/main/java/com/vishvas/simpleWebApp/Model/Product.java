package com.vishvas.simpleWebApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String productName;
    private Integer price;
    private int productId;
}
