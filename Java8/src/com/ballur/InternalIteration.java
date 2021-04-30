package com.ballur;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InternalIteration {

	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		
		
//		Consumer<Integer> c = new Consumer<Integer>()
//		{
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//				
//			}
//			
//			
//		
//		};
		list.forEach(t->System.out.println(t));
		list.forEach(System.out::println);
		list.forEach(com.ballur.InternalIteration::show);
			}

	
	public static void show(int i )
	{
		System.out.println(i*2);
	}
}
 