package com.TypesOfClasses;

@FunctionalInterface
public interface A {

	//No non-static and static fields*
	
	//public static final fields
	public static final int ORGANIZATION_CODE = 8907;
	public static final String ORGANIZATION_NAME = "IBM";


	//methods*
	
	default void get1()
	{
		
	}
	
	default void get2()
	{
		
	}
	//abstract method
	public void getInfo1();//Abstract methods do not specify a body

	//public void getInfo2();//Abstract methods do not specify a body


	public static void getData()
	{
		System.out.println(ORGANIZATION_NAME);
		System.out.println(ORGANIZATION_CODE);		
	}


	//inner classes

	//No Objects


}
