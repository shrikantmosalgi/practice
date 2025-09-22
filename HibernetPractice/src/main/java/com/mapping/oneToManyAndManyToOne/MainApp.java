package com.mapping.oneToManyAndManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		
		
	       Question q1= new Question();
	       
	       q1.setQuestion("what is java");
	       
	       Answer a1 = new Answer();
	       a1.setAnswer("java is programming language");
	       a1.setQuestion(q1);
	       
	       Answer a2 = new Answer();	      
	       a2.setAnswer("using java we can create softwares");
	       a2.setQuestion(q1);
	    
	       
	       List<Answer> answerList = new ArrayList<>();
	       answerList.add(a1);
	       answerList.add(a2);
	       
	       q1.setAnswers(answerList);
	       //session
	       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	        
	       Session session= sessionFactory.openSession();
	       org.hibernate.Transaction transaction= session.beginTransaction();
	       
	       session.persist(a1);
	       session.persist(q1);
	       
	       
	       
	       
	       transaction.commit();
	       session.close();
	       
	}

}
