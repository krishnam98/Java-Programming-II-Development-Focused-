package com.krishnam.simpleWebApp.service;

import com.krishnam.simpleWebApp.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List <Products> productList= new ArrayList<>(Arrays.asList(new Products(101,"hp", 50000),
                                               new Products(102,"dell",60000),
                                               new Products(103,"Macbook",90000)));

    public List<Products> getProduct(){
        return productList;

    }

    public Products getProductByid(int prodId){
        return productList.stream().filter(p -> p.getProduct_id()==prodId).findFirst().get();
    }

    public void addProduct(Products product){

        productList.add((product));

    }

    private int getIndex(int id){
        for(int i=0;i<productList.size();i++){
            if(productList.get(i).getProduct_id()==id){
                return i;
            }
        }

        return -1;
    }

    public void updateProduct(Products product) {
        int idx=getIndex(product.getProduct_id());
        if(idx!=-1){
            productList.set(idx,product);

        }


    }

    public void deleteProduct(int prodId) {
        int idx=getIndex(prodId);
        if(idx!=-1){
            productList.remove(idx);
        }
    }
}
