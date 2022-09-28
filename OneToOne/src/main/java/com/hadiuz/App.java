package com.hadiuz;

import com.hadiuz.daoimpl.CitizenDAOImpl;

public class App 
{
    public static void main(String[] args)
    {
        CitizenDAOImpl cdao = new CitizenDAOImpl();
        cdao.addCitizen();
        cdao.fetchCitizen();
    }
}