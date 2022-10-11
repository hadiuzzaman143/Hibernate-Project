package com.hadiuz.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hadiuz.config.HibernateUtil;
import com.hadiuz.dao.HospitalDAO;
import com.hadiuz.entity.Doctor;
import com.hadiuz.entity.Patient;

public class HospitalDAOImpl implements HospitalDAO 
{    
	@SuppressWarnings("unused")
	private Doctor doc;
	@SuppressWarnings("unused")
	private Patient p;

	// DAO implementation class
	
	@SuppressWarnings({ "deprecation", "resource" })
	public void addDoctor() 
	{     

		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		String n,d,e;
		long p;
		 
		// taking user input & read the user input
		System.out.println("Enter Doctor Name: ");
		n = sc.nextLine();
		System.out.println("Enter Doctor Department: ");
		d = sc.nextLine();
		System.out.println("Enter Doctor Email: ");
		e = sc.nextLine();
		System.out.println("Enter Doctor Phone: ");
		p = sc.nextLong();
		// creating a student class object
		Doctor doc = new Doctor();
		// set values
		doc.setDname(n);
		doc.setDdept(d);
		doc.setDemail(e);
		doc.setDphone(p);
		 
		// mapping with entity classes
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(doc);
		t.commit();
		
	}

	
	@SuppressWarnings({ "deprecation", "resource" })
	public void deleteDoctor() {           // method delete the data
		// creating a scanner class object
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Doctor ID: ");
		int id = sc.nextInt();
		
		// create a object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		// given entity class with the given identifier
		Doctor doc1 = session.get(Doctor.class, id);
		// to remove data from table 
		session.delete(doc1);
		System.out.println("Deleted Succesfully.");
		// commit the statement
		t.commit();
		
	}


	@SuppressWarnings({ "deprecation", "resource" })
	public void updateDoctor() {     // method for update the data
		// creating a scanner class object
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		// create a object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		// given entity class with the given identifier
		Doctor doc1 = session.get(Doctor.class, id);
		// taking user input
		System.out.println("Enter Doctor Phone: ");
		long dphone = sc.nextLong();
		doc1.setDphone(dphone);
		// update & commit the session
		session.update(doc1);
		System.out.println("Update Succesfully.");
		t.commit();
		
	}

	@SuppressWarnings("resource")
	public void fetchDoctor() 
	{        // method for fetch the data
		// creating scanner class object
		Scanner d1 = new Scanner(System.in);
		int id;
		// taking user input
		System.out.println("Enter Doctor ID: ");
		// reading user input
		id = d1.nextInt();
		// create a object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		Doctor doc = session.get(Doctor.class, id);
		// fetch the data from selected table
		System.out.println("----------- Doctor Data -----------");
		System.out.println(doc.getDname()+" "+doc.getDdept()+" "+doc.getDemail()+" "+doc.getDphone());
			
		
	}

	// Patient
	
	@SuppressWarnings({ "deprecation", "resource" })
	public void  addPatient() 
	{     

		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		String n,a;
		long ph;
		double f;
		// taking user input & read the user input
		System.out.println("Enter Patient Name: ");
		n = sc.nextLine();
		System.out.println("Enter Patient Address: ");
		a = sc.nextLine();
		System.out.println("Enter Patient Phone: ");
		ph = sc.nextLong();
		System.out.println("Enter Patient Fees: ");
		f= sc.nextDouble();
		// creating a student class object
		Patient p = new Patient();
		// set values
		p.setPname(n);
		p.setPadd(a);
		p.setPphone(ph);
		p.setPfee(f);
		// mapping with entity classes
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(p);
		t.commit();
		
	}

	
	@SuppressWarnings({ "deprecation", "resource" })
	public void deletePatient() {           // method delete the data
		// creating a scanner class object
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Patient ID: ");
		int id = sc.nextInt();
		
		// create a object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		// given entity class with the given identifier
		Patient doc1 = session.get(Patient.class, id);
		// to remove data from table 
		session.delete(doc1);
		System.out.println("Deleted Succesfully.");
		// commit the statement
		t.commit();
		
	}


	@SuppressWarnings({ "deprecation", "resource" })
	public void updatePatient() {     // method for update the data
		// creating a scanner class object
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Patient ID: ");
		int id = sc.nextInt();
		
		// create a object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		// given entity class with the given identifier
		Patient doc = session.get(Patient.class, id);
		// taking user input
		System.out.println("Enter Phone: ");
		long pphone = sc.nextLong();
		doc.setPphone(pphone);
		// update & commit the session
		session.update(doc);
		System.out.println("Update Succesfully.");
		t.commit();
		
		
	}

	@SuppressWarnings("resource")
	public void  fetchPatient() 
	{        // method for fetch the data
		// creating scanner class object
		Scanner d1 = new Scanner(System.in);
		int id;
		// taking user input
		System.out.println("Enter Patient ID: ");
		// reading user input
		id = d1.nextInt();
		// create a object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		Patient doc = session.get(Patient.class, id);
		// fetch the data from selected table
		System.out.println("-----------Patient Data -----------");
		System.out.println(doc.getPname()+" "+doc.getPadd()+" "+doc.getPphone()+" "+doc.getPfee());
			
		
	}	
}
