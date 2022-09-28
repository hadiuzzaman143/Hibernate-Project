package com.hadiuz;

import com.hadiuz.daoimpl.DepartmentDAOImpl;

public class App 
{
    public static void main( String[] args )
    {
       DepartmentDAOImpl dt=new DepartmentDAOImpl();
       dt.addDept();
    }
}

