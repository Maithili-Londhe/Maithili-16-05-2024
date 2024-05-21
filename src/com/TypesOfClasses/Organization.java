package com.TypesOfClasses;

public interface Organization 
{

	//No non-static and static fields*
	/**
	 * Illegal modifier for the interface field Organization.organizationCode; 
	 * only public, static & final are permitted
	 */
	
	//public static final fields
	public static final int ORGANIZATION_CODE = 8907;
	public static final String ORGANIZATION_NAME = "IBM";


	//constructors
	/*
	 * public Organization()//Interfaces cannot have constructors {
	 * 
	 * }
	 */
	
	//blocks
	/*
	 * static//The interface Organization cannot define an initializer {
	 * 
	 * }
	 */
	
	//methods*
	
	//abstract method
	public void getInfo1();//Abstract methods do not specify a body
	
	public void getInfo2();//Abstract methods do not specify a body
	
	
	public static void getData()
	{
		System.out.println(ORGANIZATION_NAME);
		System.out.println(ORGANIZATION_CODE);		
	}
	
	
	//inner classes

	//No Objects

}
