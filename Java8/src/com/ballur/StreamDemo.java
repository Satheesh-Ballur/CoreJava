package com.ballur;

import java.util.Arrays;
import java.util.List;
public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		int result = 0;
		 for(int i : list)
		 {
			 result = result +i*2;
		 }
	System.out.println(result);
	
	System.out.println(list.stream().map(i->i*2).reduce((i,j)->i+j).orElse(50));
	}
	
	
	

}
