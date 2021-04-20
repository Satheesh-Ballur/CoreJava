package com.ballur.hibernate.HibernateDemo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{

	public static void main(String[] args) 
	{
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Laptop l1 = session.get(Laptop.class, 5);
//		System.out.println(l1);
		
		session.getTransaction().commit();
		
	}

}
