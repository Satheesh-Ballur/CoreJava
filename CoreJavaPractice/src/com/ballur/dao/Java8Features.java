package com.ballur.dao;

public class Java8Features {

	public static void main(String[] args)
	
	{

		
		Func f = ()->System.out.println("In Impl");
		
		
		
		/*
		 * Func f = new Func() { public void disp() { System.out.println("Im Impl"); }
		 * };
		 */
				
				f.disp();	
		
	}

}

/*
 * class FuncImpl implements Func {
 * 
 * public void disp() { System.out.println("Im impl"); }
 * 
 * }
 */


interface Func
{
	
	
	public void disp();
}