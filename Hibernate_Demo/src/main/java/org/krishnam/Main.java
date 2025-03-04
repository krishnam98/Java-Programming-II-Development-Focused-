package org.krishnam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        USING STUDENT AS TABLE
//        Student s1=new Student();

//        s1.setRollNo(13);
//        s1.setName("Abhinav");
//        s1.setAge(23);

//        USING RECORD AS TABLE
//        Record r1 =new Record();
//
//        StudentName s=new StudentName();
//        s.setfName("Krishnam");
//        s.setmName("Sushil");
//        s.setlName("Soni");
//
//        r1.setRollno(1);
//        r1.setName(s);
//        r1.setAge(22);


//        Studying Mapping Relations in Hibernate
//        Setting up student database
//        Student s= new Student();
//        s.setRollNo(1);
//        s.setName("Krishnam");
//        s.setAge(22);
//
//
//        Student s2= new Student();
//        s2.setRollNo(2);
//        s2.setName("Pranay");
//        s2.setAge(22);



//        Setting up laptop database
//        Laptop l1=new Laptop();
//        l1.setLid(101);
//        l1.setLname("hp");
//        l1.getStuds().add(s);
//
//        Laptop l2=new Laptop();
//        l2.setLid(102);
//        l2.setLname("dell");
//        l2.getStuds().add(s);
//
//        Laptop l3=new Laptop();
//        l3.setLid(103);
//        l3.setLname("macbook");
//        l3.getStuds().add(s2);
//        l3.getStuds().add(s);


//        Setting 1 Laptop for Student
//        s.setLaptop(l1);
//        s2.setLaptop(l3);

//        Setting list of Laptops for Student
//        s.getLaptops().add(l1);
//        s.getLaptops().add(l2);
//        s.getLaptops().add(l3);
//        s2.getLaptops().add(l3);


        Configuration config=new Configuration();

//        When Working with student Table use this Class
        config.addAnnotatedClass(org.krishnam.Student.class);

//        Laptop Table
//        config.addAnnotatedClass(org.krishnam.Laptop.class);


//       When Working with record Table use this class
//        config.addAnnotatedClass(org.krishnam.Record.class);

        config.configure();

        SessionFactory factory=config.buildSessionFactory();

        Session session= factory.openSession();


        Transaction transaction= session.beginTransaction();
//      Saving the Student
//       session.persist(s);
//       session.persist(s2);

//      Saving the Laptop
//       session.persist(l1);
//       session.persist(l2);
//       session.persist(l3);


//        Saving Record
//        session.persist(r1);

//       Updating the student
//        session.merge(s1);

//      Deleting the Student
//        Student s2=session.find(Student.class,13);
//        session.remove(s2);

        transaction.commit();

//        Fetching the Student
//        Student s= session.find(Student.class,2);
//        System.out.println(s);

        session.close();
        factory.close();

    }
}