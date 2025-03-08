package com.krishnam.simpleWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class Products {
   private int product_id;
   private String product_name;
   private int produce_price;

   public Products(){

   }

   public Products(int id, String name,int price){
       this.product_id=id;
       this.product_name=name;
       this.produce_price=price;
   }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduce_price() {
        return produce_price;
    }

    public void setProduce_price(int produce_price) {
        this.produce_price = produce_price;
    }
}
