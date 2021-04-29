package com.ballur.controllers;

import org.springframework.stereotype.Component;

@Component
public class ServiceController 
{

	public int service(int i , int j)
	{
		return i+j;
	}
	
	
}
