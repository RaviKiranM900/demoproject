/*
 * @Employee.java	@04-Sep-2018
 *
 * Copyright (c) 2013 ForSe. 
 * All rights reserved. 
 * 
 * No part of this document may be reproduced or transmitted in any form or by 
 * any means, electronic or mechanical, whether now known or later invented, 
 * for any purpose without the prior and express written consent of ForSe 
 * 
 */
package com.example.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * </p>
 *
 * @author Ravi.m
 * @version 1.0
 *
 */
public class Employee {
	
	@NotNull(message="is required")
	private String empName;
	@NotBlank(message="is required")
	private String empComp;
	
	
	
	public String getEmpName() {
	
		return empName;
	}
	
	public void setEmpName(String empName) {
	
		this.empName = empName;
	}
	
	public String getEmpComp() {
	
		return empComp;
	}
	
	public void setEmpComp(String empComp) {
	
		this.empComp = empComp;
	}

}
