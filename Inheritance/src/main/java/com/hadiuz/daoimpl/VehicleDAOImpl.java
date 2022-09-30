package com.hadiuz.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hadiuz.config.HibernateUtil;
import com.hadiuz.dao.VehicleDAO;
import com.hadiuz.entity.FourWheel;
import com.hadiuz.entity.TwoWheel;


public class VehicleDAOImpl implements VehicleDAO 
{
	
     Session session=HibernateUtil.getSessionFactory().openSession();
     Transaction t=session.beginTransaction();

	@SuppressWarnings("deprecation")
	
	public void addVehicle() 
	{
		TwoWheel tw=new TwoWheel();
		tw.setEngine("300cc");
		tw.setAbs(true);
		tw.setBtype("sports");
		tw.setFuel("petrol");
		tw.setModelname("BMW");
		tw.setModelno(876);
		tw.setPrice(400000);
		tw.setSpeed(200);
		tw.setTyretype(140);
		tw.setVtype("bike");
		
		FourWheel fw=new FourWheel();
		fw.setAc(true);
		fw.setEngine("1180cc");
		fw.setEtype("automatic");
		fw.setFuel("diesel");
		fw.setModelname("Hyundai");
		fw.setModelno(9860);
		fw.setMusicsystem(true);
		fw.setPrice(700000);
		fw.setSpeed(280);
		fw.setVtype("car");
		
		session.save(fw);
		session.save(tw);
		t.commit();
		System.out.println("----------inserted Successfully----------");
		
	}

	public void fetchVehicle() 
	{
		// TODO Auto-generated method stub
		
	}

}