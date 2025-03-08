package com.krishnam.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//   -----For Field Injection------
//    @Autowired
//    private Laptop laptop;

//   -----Constructor Injection------
//    private Laptop laptop;
//    @Autowired
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//    }


//    public Laptop getLaptop() {
//        return laptop;
//    }

//    ----Setter Injection-----
//    @Autowired
//    private Laptop laptop;
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

// ------Primary & Qualifier-----------
    private Computer comp;

    public Computer getComp() {
        return comp;
    }

// To show use of Primary and Qualifier
    @Autowired
//    @Qualifier("laptop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        comp.compile();
        System.out.println("Working on Project ");
    }
}
