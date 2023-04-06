package com.HBOneToManyMap;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToMany {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Answer ans1 = new Answer();
		ans1.setAnswer("Answer 1");
		ans1.setPostedBy("Rashmika sen");

		Answer ans2 = new Answer();
		ans2.setAnswer("Answer 2");
		ans2.setPostedBy("Nidhi Chauhan");

		Answer ans3 = new Answer();
		ans3.setAnswer("Answer 3");
		ans3.setPostedBy("Abdul Kalam");

		Answer ans4 = new Answer();
		ans4.setAnswer("Answer 4");
		ans4.setPostedBy("Narendra Modi");

		ArrayList<Answer> ansList = new ArrayList<Answer>();
		ansList.add(ans1);
		ansList.add(ans2);
		ansList.add(ans3);
		ansList.add(ans4);
		
		
		Question question  = new Question();
		question.setQuestion("What is java?");
		question.setAnswers(ansList);
		
		session.persist(question);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		System.out.println("Object saved successfully ");
		session.close();
		factory.close();
		
	}

}
