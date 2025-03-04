package org.krishnam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCaching {
    public static void main(String args[]){
        System.out.println(",,");

        Configuration config= new Configuration();
        config.addAnnotatedClass(org.krishnam.Student.class);
        config.configure();

        SessionFactory factory= config.buildSessionFactory();
        Session session= factory.openSession();

//     -----------1ST LEVEL CACHING-----------

      /* Calling Find will check in 1st level caching then 2nd level caching
       * Since Data is FETCHED for 1st time, caches it empty so Hibernate
       * fetches Data from Database and also saves it !st level Cache memory.
       */
        Student s= session.find(Student.class,1);
        System.out.println(s);

        /*Calling Find from SAME SESSION for 2nd time will now
         *fetch data from 1st level cache memory,
         */

//        Student s2= session.find(Student.class,1);
//        System.out.println(s2);

        session.close();

//      Creating Another Session
        Session session2= factory.openSession();

       /*Calling find from different Session again fires the query
       * as in 1st level caching 2 different sessions cannot use same 1st level cache memory
       */
        Student s2 =session2.find(Student.class,1);
        System.out.println(s2);
    }
}
