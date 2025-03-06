package org.krishnam;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Student {

    @Id
    private int rollNo;
    private String name;
    private int age;

//    Creating ONE TO ONE relation with laptop class
//    @OneToOne
//    private Laptop laptop;

//    Creations ONE TO MANY & MANY TO MANY relation with laptop class
//    @OneToMany (mappedBy = "studs")
//    private List<Laptop> laptops=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public List<Laptop> getLaptops() {
//        return laptops;
//    }
//
//    public void setLaptops(List<Laptop> laptops) {
//        this.laptops = laptops;
//    }

    //    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
