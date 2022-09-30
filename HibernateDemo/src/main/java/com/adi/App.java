package com.adi;
 
import com.adi.entity.Employee;

public class App
{
	public static void main(String []args)
	{
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Adi");
		emp.setEphone(700441111);
		emp.setEaddr("Malda");
		emp.setEsalary(10000.2);
		
		System.out.println(emp.getEid()+" "+emp.getEname()+""+emp.getEphone()+" "+emp.getEaddr()+" "+emp.getEsalary());
	}
}