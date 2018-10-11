/*
 * @LoginController.java	@30-Aug-2018
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.service.ILoginService;

/**
 * <p>
 * </p>
 *
 * @author Ravi.m
 * @version 1.0
 *
 */
@Controller
@SessionAttributes("name")
public class LoginController {

	 @Autowired
	 ILoginService service;
	    @RequestMapping(value="/login", method = RequestMethod.GET)
	    public String showLoginPage(ModelMap model){
	        return "login";
	    }
	    @RequestMapping(value="/login", method = RequestMethod.POST)
	    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
	        boolean isValidUser = service.validateUser(name, password);
	        if (!isValidUser) {
	            model.put("errorMessage", "Invalid Credentials");
	            return "login";
	        }
	        model.put("name", name);
	        model.put("password", password);
	        return "welcome";
	    }
}
