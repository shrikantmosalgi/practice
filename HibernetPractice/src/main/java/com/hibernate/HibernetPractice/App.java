package com.hibernate.HibernetPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "project started" );
        
      
        Student student =new Student();
        student.setId(1);
        student.setName("jakob");
        student.setCity("usa");
        
        Address address = new Address();
        address.setAddressId(1);
        address.setCity("shrishail");
        address.setStreet("jm road");
        address.setX(1.0);
        address.setOpen(true);
        address.setAddedDate(new Date());
        
        FileInputStream fis = new FileInputStream("src/main/java/google.jpg");
        byte[] image = new byte[fis.available()];
        fis.read();
        address.setImage(image);
     
      //if configuration file dose not found then write file name in configure()
       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
       Session session= sessionFactory.openSession();
       org.hibernate.Transaction transaction= session.beginTransaction();
       session.merge(student);
       session.merge(address);
       
       transaction.commit();
       
       Address address1 = session.get(Address.class, 1);  //get() use when we dont know object is present or not in db 
                                                          //and load() when we are confirm that object is present in db       
       System.out.println(address1.getCity() + " , " + address1.getAddressId());
       
       session.close();
       
       
        
        System.out.println(student);
    }
}
