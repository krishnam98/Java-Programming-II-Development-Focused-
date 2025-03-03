package org.krishnam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String lname;

    @ManyToMany
    private List<Student> studs=new ArrayList<>();

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    public List<Student> getStuds() {
        return studs;
    }

    public void setStuds(List<Student> studs) {
        this.studs = studs;
    }
}
