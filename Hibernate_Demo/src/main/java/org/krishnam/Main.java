package org.krishnam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s1=new Student();

        s1.setRollNo(13);
        s1.setName("Abhinav");
        s1.setAge(23);

        Configuration config=new Configuration();
        config.addAnnotatedClass(org.krishnam.Student.class);
        config.configure();

        SessionFactory factory=config.buildSessionFactory();

        Session session= factory.openSession();


        Transaction transaction= session.beginTransaction();
//      Saving the Student
       session.persist(s1);

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