package com.hadiuz;

import com.hadiuz.daoimpl.VehicleDAOImpl;

public class App 
{
    public static void main( String[] args )
    {
      VehicleDAOImpl v = new VehicleDAOImpl();
      v.addVehicle();
    }
}
