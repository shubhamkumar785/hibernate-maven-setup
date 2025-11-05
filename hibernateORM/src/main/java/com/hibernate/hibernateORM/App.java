package com.hibernate.hibernateORM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started...");
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        // Creating Student
        Student st = new Student();
        st.setId(101);
        st.setName("Shubham");
        st.setCity("Greater Noida");
        System.out.println(st);
        
        Session session = factory.openSession();
        Transaction txt = session.beginTransaction();
        session.save(st);
        txt.commit();

        session.close();
    }

	
}

