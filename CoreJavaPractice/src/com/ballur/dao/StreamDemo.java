package com.ballur.dao;



public class StreamDemo {

	public static void main(String[] args)
	{

		StreamDemo.calc(1,100);
		
		
		
	}
	
	public static void calc(int start, int end)
	{
	
		if(start<=end)
		{
			System.out.println(start);
		start++;
		calc(start,end);
		
	}
		

}
	
}


