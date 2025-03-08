package com.krishnam.simpleWebApp.controllers;

import com.krishnam.simpleWebApp.service.ProductService;
import com.krishnam.simpleWebApp.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Products> getProducts(){
        return service.getProduct();
    }
}
