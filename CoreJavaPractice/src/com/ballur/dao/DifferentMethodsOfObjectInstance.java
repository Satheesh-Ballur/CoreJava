package com.ballur.dao;

public class DifferentMethodsOfObjectInstance {

	public static void main(String[] args) throws ClassNotFoundException, Exception, Exception
	{
	
		
	Class c= Class.forName("com.ballur.dao.A");
	
	c.newInstance();
	

	
	
	}

}


class A
{
	private void show()
	{
		System.out.println("In Show A");
	}
}