package com.hibernate.HibernetPractice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        
        //if configuration file dose not found then write file name in configure()
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
        System.out.println(sessionFactory);
    }
}
