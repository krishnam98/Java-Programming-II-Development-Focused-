package org.example;

public class Dev {
    private int age;
    private Computer comp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Dev(){
        System.out.println("Dev is Created");
    }
// Parameterised Constructor for Setting age using Constructor Injection
    public Dev(int age){
        this.age=age;
        System.out.println("Dev1 is Created");

    }

    public Dev(Computer comp){
        this.comp=comp;
    }


    public void build(){
        comp.compile();
        System.out.println("Working on Project");
    }
}
