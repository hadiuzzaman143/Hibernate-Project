package com.hadiuz.daoimpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hadiuz.config.HibernateUtil;
import com.hadiuz.dao.DepartmentDAO;
import com.hadiuz.entity.Department;
import com.hadiuz.entity.Employee;

public class DepartmentDAOImpl implements DepartmentDAO {
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();

	@SuppressWarnings("deprecation")
	public void addDept() {
		Department d=new Department();
		d.setDname("Softwar Dpt");
		d.setDzone("kolkata");
	
		Employee e=new Employee();
		e.setEname("Hadiuz");
		e.setCity("Malda");
		e.setSalary(35000);
		e.setEmail("hadiuz@gmail.com");
		
		Employee e1=new Employee();
		e1.setEname("Adi");
		e1.setCity("Kolkata");
		e1.setSalary(45000);
		e1.setEmail("adi@gmail.com");
		
		Employee e2=new Employee();
		e2.setEname("Sankhojit");
		e2.setCity("CB");
		e2.setSalary(25000);
		e2.setEmail("sankho@gmail.com");
		
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(e);
		a1.add(e1);
		a1.add(e2);
		d.setEmployees(a1);
		
		session.save(d);
		t.commit();
		
		
	}

	public void fetchDept() {
		
	}

}
