package com.HBOneToManyMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadQuestion {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Object obj = session.load(Question.class, 24);
		Question q = (Question) obj;

		System.out.println(q.getQueid());
		System.out.println(q.getQuestion());
		for(Answer a:q.getAnswers()) {
			System.out.println(a.toString());

		}
	

		tx.commit();

		System.out.println("Object loaded successfully ");
		session.close();
		factory.close();
	}

}
