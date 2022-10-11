package com.hadiuz;

import java.util.Scanner;

import com.hadiuz.daoimpl.HospitalDAOImpl;

public class App 
{
	private static Scanner sc;
 
	public static void main(String[] args) 
    {   
		 		
	     HospitalDAOImpl dao = new HospitalDAOImpl();
		 char c;
        // using do-while loop to traversing the methods
        do {
        	sc = new Scanner(System.in);
        	System.out.println("\n*****Hospital Management System*****\n");
        	
        	System.out.println("------DOCTOR------");
        	// take user input
        	System.out.println("1.Add Doctor Data ");
        	System.out.println("2.Fetch Doctor Data");
        	System.out.println("3.Delete Doctor Data");
        	System.out.println("4.Update Doctor Data");
        	
        	System.out.println("------PATIENT------");
        	// take user input
        	System.out.println("5.Add Patient Data ");
        	System.out.println("6.Fetch Patient Data");
        	System.out.println("7.Delete Patient Data");
        	System.out.println("8.Update Patient Data");
        	System.out.println("9.Exit");
        	 
        	// reading user input
        	int a = sc.nextInt();
        	// to get the method
        	switch(a) {
        	
        	// called method to add student data
        	case 1: dao.addDoctor();
        		break;
        	// called method to fetch student data
        	case 2: dao.fetchDoctor();
        		break;
        	// called method to delete student data
        	case 3: dao.deleteDoctor();
        		break;
        	// called method to update student data
        	case 4: dao.updateDoctor();
        		break;
        	case 5: dao.addPatient();
    		break;
    	    // called method to fetch student data
        	case 6: dao.fetchPatient();
    		break;
    	    // called method to delete student data
    	    case 7: dao.deletePatient();
    		break;
    	     // called method to update student data
    	    case 8: dao.updatePatient();
    		break;	
        	// Exit
        	case 9: 
        		System.out.println("Thank You.");
        		System.exit(0);
        		break;
        			
        	// default case for invalid choice	
        	default: System.out.println("Invalid Choice!");
        	}
        	// to continue run the operation or not
        	System.out.println("Do you want to continue? Y/N");
        	c = sc.next().charAt(0);
        
        	
        // pass the condition to continue or not	
		} while (c == 'y' || c=='Y');
        System.out.println("Thank You.");
		
		} 
    
  }


