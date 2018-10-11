/*
 * @TodoController.java	@30-Aug-2018
 *
 * Copyright (c) 2013 ForSe. 
 * All rights reserved. 
 * 
 * No part of this document may be reproduced or transmitted in any form or by 
 * any means, electronic or mechanical, whether now known or later invented, 
 * for any purpose without the prior and express written consent of ForSe 
 * 
 */
package com.example.logincontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.model.Employee;
import com.example.service.IEmployeeService;

/**
 * <p>
 * </p>
 *
 * @author Ravi.m
 * @version 1.0
 *
 */
@Controller
public class EmployeeController {
	 @Autowired
	    IEmployeeService employeeService;
	 
	    @RequestMapping(value="/empform", method = RequestMethod.GET)
	    public String showTodos(Model model){
	    	model.addAttribute("employee", new Employee());
	       return "form";
	    }
	    
	    @RequestMapping(value="/processEmpForm", method = RequestMethod.POST)
	    public String showTodos(@Valid @ModelAttribute ("employee") Employee emp,BindingResult theBindingResult){
	    	
	    	if(theBindingResult.hasErrors()) {
	    		theBindingResult.getAllErrors();
	    		System.out.println("The binding result has errors");
	    		return null;
	    	}else {
	    	System.out.println(emp.getEmpName());
	       return "successform";
	    	}
	    	 
	    }
}
