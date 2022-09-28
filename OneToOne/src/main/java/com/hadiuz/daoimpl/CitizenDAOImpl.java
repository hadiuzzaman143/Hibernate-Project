package com.hadiuz.daoimpl;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hadiuz.config.HibernateUtil;
import com.hadiuz.dao.CitizenDAO;
import com.hadiuz.entity.Address;
import com.hadiuz.entity.Citizen;

public class CitizenDAOImpl implements CitizenDAO {
     
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();

	@SuppressWarnings("deprecation")

	public void addCitizen() {
		
		Citizen c = new Citizen();
		c.setCname("Hadiuz");
		c.setSurname("Zaman");
		c.setPhone(768875646);
		c.setEmail("hadi@gmail.com");
		c.setDob("2000-06-30");
		
		Address a = new Address();
		a.setIdnumber(12345);
		a.setIdtype("addhar");
		a.setAddress("Malda");
		a.setState("West Bengal");
		a.setPin(732102);
		
		a.setCitizen(c);
		c.setAddress(a);   // link address object to citizen object
		 

		System.out.println("----------Inserted Successfully-----------");
	}

	public void fetchCitizen() 
	{
     Query q=session.createQuery("from Citizen");
		
		List<Citizen> a1=q.getResultList();
		Iterator<Citizen> itr =a1.iterator();
		while (itr.hasNext()) {
		 
		
		Citizen c2 = new Citizen();
		System.out.println(c2.getCname()+" "+c2.getSurname());
		
		Address a2 = new Address();
		System.out.println(a2.getIdnumber()+" "+a2.getIdtype()+" "+a2.getCity());
	}

	}
}