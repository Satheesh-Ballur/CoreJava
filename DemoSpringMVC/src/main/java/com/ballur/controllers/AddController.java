package com.ballur.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController 
{

	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest req , HttpServletResponse res)
	{
		
		int i = Integer.parseInt(req.getParameter("t1"));
		int j = Integer.parseInt(req.getParameter("t2"));
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		ServiceController s = cxt.getBean(ServiceController.class);
		
		int result = s.service(i, j);
		
		
		//req.setAttribute("result", result);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Display.jsp");
		mv.addObject("result", result);	
		return mv;
		
		
	}
	
	
	
}
