package com.pratik.userApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.Emp;

public class ClientApp_Insert {

	public static void main(String[] args) 
		{
		//initialize hibernate resources
			Configuration cfg = null;
			SessionFactory factory = null;
			Session ses = null;
			Transaction tx = null;

		cfg = new Configuration().configure("Qualified name of configuration ");//activate or configure hibernate framework,read and store HB cfg file and configuration object
				factory = cfg.buildSessionFactory();	//create session factory object
					ses = factory.openSession();	//get session object
	//create domain class object with data
	Emp em = null;
		em = new Emp();
		
		em.setEid(555);
			em.setEname("Pratik");
				em.setEsalary(40000);
					em.setEcity("PUNE");

		try {
			tx = ses.beginTransaction();
			ses.save(em);			//save record or object(i.e insert the record)
			tx.commit();			//save object as record in database table
			System.out.println("object is saved");
		}//try ends 
		catch (Exception e) {
			e.printStackTrace();
			tx.rollback();//rollback the transaction if any erroes occus or failed
		}//catch ends
		finally
		{
			try {
				//	CLOSE THE RESOURSES
						ses.close();
						factory.close();
			}//try with finally ends
			catch (Exception e2) {
				e2.printStackTrace();
			}//catch with finally ends
		}// finally ends
		System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE(06:00)==\n\n\n");

	}//main() ends

}//class ends
