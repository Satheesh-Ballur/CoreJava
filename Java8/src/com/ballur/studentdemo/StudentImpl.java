package com.ballur.studentdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentImpl {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Random r = new Random();
		for (int i = 1 ; i<10;i++)
		{
			Student s = new Student();
			s.setId(i);
			s.setName("Name " + i);
			s.setMarks(r.nextInt(100));
			list.add(s);
		}		
		//list.forEach(s->System.out.println(s));		
		//list.stream().filter(t->t.getMarks()>70).forEach(System.out::println);
		System.out.println(list.stream().findFirst());
		
	}

}
