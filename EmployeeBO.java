package com.pratik.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Employee_Table")//your table name which tou have to mapped with project

public class EmployeeBO
	{
		private int eid;
		private String ename;
		private float esalary;
		private String ecity;
	
			public EmployeeBO()
				{
					System.out.println("o-param-constructor ");	//constructor creating for how many objects are created/called
				}

	//write getters setters methods with annotations
	@Id
	@Column(name="ID",length=10,nullable=false)
	@Type(type="int")
		public int getEid()
		{
				return eid;
			}
	public void setEid(int eid) 
		{
			this.eid = eid;
		}
	
	@Column(name="NAME",length=20,nullable=false)
	@Type(type="string")
		public String getEname() 
		{
			return ename;
		}
		public void setEname(String ename) 
			{
				this.ename = ename;
			}

	@Column(name="SALARY",length=10,nullable=false,precision=2)
	@Type(type="float")
		public float getEsalary()
		{
				return esalary;
		}
	public void setEsalary(float esalary) 
		{
			this.esalary = esalary;
		}

	@Column(name="CITY",length=10,nullable=false)
	@Type(type="int")
		public String getEcity() 
		{
			return ecity;
		}
		public void setEcity(String ecity) 
			{
				this.ecity = ecity;
			}

//write toString() method for print the result
	@Override
	public String toString() 
		{
			return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", ecity=" + ecity + "]";
		}//end of method
}//end of class
