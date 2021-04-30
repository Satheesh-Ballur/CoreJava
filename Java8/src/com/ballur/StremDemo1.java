package com.ballur;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StremDemo1 {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(12,20,35,46,55,68,75);
		
		Predicate<Integer> p = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				if(t%5==0)
				{
					return true;
				}
				return false;
			}
		};
		
		System.out.println(list.stream().filter(p).reduce((i,j)->i+j));
		
		
		
	}

}
