package com.krishnam.simpleWebApp.controllers;

import com.krishnam.simpleWebApp.service.ProductService;
import com.krishnam.simpleWebApp.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProductsController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Products> getProducts(){
        return service.getProduct();
    }

    @RequestMapping("/products/{prodId}")
    public Products getProductbyId(@PathVariable int prodId){
        return service.getProductByid(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Products product){
        service.addProduct(product);
    }

    @PutMapping("/updateProduct")
    public void updateProduct(@RequestBody Products product){
        service.updateProduct(product);
    }
    @DeleteMapping("/delete/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
