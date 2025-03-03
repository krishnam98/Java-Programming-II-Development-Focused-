package org.krishnam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String lname;

    @ManyToOne
    private Student stud;

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


    public Student getStud() {
        return stud;
    }

    public void setStud(Student stud) {
        this.stud = stud;
    }
}
