package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		
		
	       Question q1= new Question();
	       
	       q1.setQuestionId(1);
	       q1.setQuestion("what is java");
	       
	       Answer a1 = new Answer();
	       a1.setAnswerId(1);
	       a1.setAnswer("java is programming language");
	       a1.setQuestion(q1);
	       q1.setAnswer(a1);
	       
	       Question q2= new Question();
	       
	       q2.setQuestionId(2);
	       q2.setQuestion("what is collection");
	       
	       Answer a2 = new Answer();
	       a2.setAnswerId(2);
	       a2.setAnswer("collection is api to work with group of object");
	       a2.setQuestion(q2);
	       q2.setAnswer(a2);
	       
	       
	       //session
	       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	        
	       Session session= sessionFactory.openSession();
	       org.hibernate.Transaction transaction= session.beginTransaction();
	       
	       session.merge(a1);
	       session.merge(a2);
	       session.merge(q1);
	       session.merge(q2);
	       
	       
	       transaction.commit();
	       session.close();
	       
	}

}
