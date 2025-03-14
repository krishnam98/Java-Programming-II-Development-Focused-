package com.krishnam.simpleWebApp.service;

import com.krishnam.simpleWebApp.Repository.ProductRepo;
import com.krishnam.simpleWebApp.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
//    List <Products> productList= new ArrayList<>(Arrays.asList(new Products(101,"hp", 50000),
//                                               new Products(102,"dell",60000),
//                                               new Products(103,"Macbook",90000)));

    @Autowired
    ProductRepo repo;
    public List<Products> getProduct(){
        return repo.findAll();

    }

    public Products getProductByid(int prodId){
        return repo.findById(prodId).orElse(new Products());
    }

    public void addProduct(Products product){

        repo.save(product);

    }

    public void updateProduct(Products product) {
        repo.save(product);

    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
