/*
 * @Todo.java	@30-Aug-2018
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

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * <p>
 * </p>
 *
 * @author Ravi.m
 * @version 1.0
 *
 */
@Component
public class Todo { 
	
	private int id;
private String user;
private String desc;
private Date targetDate;

Todo(){
	
}

public Todo(int id,String user,String desc,Date targetDate,boolean isDone){
	this.id = id;
	this.user = user;
	this.desc = desc;
	this.targetDate = targetDate;
	this.isDone = isDone;
}

public int getId() {

	return id;
}

public void setId(int id) {

	this.id = id;
}

public String getUser() {

	return user;
}

public void setUser(String user) {

	this.user = user;
}

public String getDesc() {

	return desc;
}

public void setDesc(String desc) {

	this.desc = desc;
}

public Date getTargetDate() {

	return targetDate;
}

public void setTargetDate(Date targetDate) {

	this.targetDate = targetDate;
}

public boolean isDone() {

	return isDone;
}

public void setDone(boolean isDone) {

	this.isDone = isDone;
}
private boolean isDone;}
