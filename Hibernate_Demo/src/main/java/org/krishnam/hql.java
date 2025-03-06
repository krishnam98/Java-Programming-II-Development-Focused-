package org.krishnam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Random;

public class hql {
    public static void main(String[] args){
        Configuration config=new Configuration();
        config.addAnnotatedClass(org.krishnam.Student.class);
        config.configure();

        SessionFactory factory= config.buildSessionFactory();

        Session session= factory.openSession();

        Transaction transaction= session.beginTransaction();

//        Setting up database with 50 entries
//        Random r=new Random();
//        for(int i=1;i<=50;i++){
//            Student s=new Student();
//            s.setRollNo(i);
//            s.setName("Name"+i);
//            s.setAge(r.nextInt(40));
//            session.persist(s);
//        }

//        Getting All Students
//        Query q= session.createQuery("from Student");
//        List<Student> students= q.list();
//
//        for(Student s:students){
//            System.out.println(s);
//        }

//        Using WHERE Clause
//        Query q1= session.createQuery("from Student where age > 25");
//        List<Student> students25= q1.list();
//
//        for(Student s:students25){
//            System.out.println(s);
//        }


//        Fetching Unique Results
//        Query q2= session.createQuery("from Student where rollNo=10");
//        Student s= (Student)q2.uniqueResult();
//        System.out.println(s);


//        Getting Data according to columns
//        Query q3=session.createQuery(" select rollNo,name,age from Student where rollNo=10");
//        Object[] student= (Object[]) q3.uniqueResult();

//        for( Object o: student){
//            System.out.println(o);
//        }

//       Other way of Output
//        System.out.println(student[0] + " : " + student[1]+ " : " + student[2]);


//        Fetching List of Data according to Columns
//        Query q4=session.createQuery("select rollNo,name,age from Student");
//        List<Object[]> students= (List<Object[]>)q4.list();
//
//        for(Object[] student:students){
//            System.out.println(student[0] + " : " + student[1]+ " : " + student[2]);
//        }

//       Calculating sum of values for age column using alias with (we can do it without alias with as well)
//        Query q5=session.createQuery("select sum(age) from Student s where s.age>20");
//        Long ageSum= (Long) q5.uniqueResult();
//        System.out.println(ageSum);

//        Using Dynamic Query
//        int b=20;
//        Query q6=session.createQuery("select sum(age) from Student s where s.age > :b");
//        q6.setParameter("b",b);
//        Long ageSum= (Long) q6.uniqueResult();
//        System.out.println(ageSum);

//       Writing Native SQL Queries in Hibernate

//         For all records in Student
//        String sql="SELECT * FROM student";
//        Query q7= session.createNativeQuery(sql,Student.class);
//        List <Student> students= q7.list();
//        for(String s:students){
//            System.out.println(s);
//        }

//        For specific Column in Student
//        String sql="SELECT name FROM student";
//        Query q8= session.createNativeQuery(sql);
//        List <String> students= (List <String>) q8.list();
//        for(String s:students){
//            System.out.println(s);
//        }

//        Student s= new Student();
//        s.setAge(22);
//        s.setRollNo(51);
//        s.setName("Krishnam");
//
//        session.persist(s);
//        Student s1= session.find(Student.class,51);
//        System.out.println(s1);

//        s.setAge(23); //changes will occur in database as well


        transaction.commit();
//        s.setAge(23); //this change will be there in hibernate but not in database but if you fetch updated value will be there

//        Detaches the s object
//        session.evict(s);
//        s.setAge(23);
//
//        Student s2= session.find(Student.class,51);
//        System.out.println(s2);

        session.close();
        factory.close();


    }
}
