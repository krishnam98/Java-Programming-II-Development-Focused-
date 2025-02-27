package org.krishnam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Record {
    @Id
    private int rollno;
    private StudentName name;
    private int age;

    public StudentName getName() {
        return name;
    }

    public void setName(StudentName name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
