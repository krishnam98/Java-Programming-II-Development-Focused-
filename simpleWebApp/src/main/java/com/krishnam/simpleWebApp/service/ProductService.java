package com.krishnam.simpleWebApp.service;

import com.krishnam.simpleWebApp.model.Products;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List <Products> productList= Arrays.asList(new Products(101,"hp", 50000),
                                               new Products(102,"dell",60000),
                                               new Products(102,"Macbook",90000));
    public List<Products> getProduct(){
        return productList;

    }
}
