package com.TypesOfClasses;

//Abstract Class
public abstract class Department 
{
	//fields*
	private int departementId;
	private String departmentName;
	
	public static String countryName;

	//constructors
	public Department()
	{
		
	}

	public Department(int departementId, String departmentName) 
	{
		this.departementId = departementId;
		this.departmentName = departmentName;
	}
	

	//blocks
	static 
	{
		countryName = "UK";
	}

	//methods*
	public void getDepartmentDetails()
	{
		
	}
	
	//abstract methods**
	public abstract void getDetails();//Abstract methods do not specify a body
	
	//inner classes

	//No Objects

}
