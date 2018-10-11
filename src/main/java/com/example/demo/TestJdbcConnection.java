/*
 * @TestJdbcConnection.java	@05-Sep-2018
 *
 * Copyright (c) 2013 ForSe. 
 * All rights reserved. 
 * 
 * No part of this document may be reproduced or transmitted in any form or by 
 * any means, electronic or mechanical, whether now known or later invented, 
 * for any purpose without the prior and express written consent of ForSe 
 * 
 */
package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <p>
 * </p>
 *
 * @author Ravi.m
 * @version 1.0
 *
 */
public class TestJdbcConnection {

	/**
	 * <p>
	 * </p>
	 *
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		String connectionUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String userName ="hbstudent";
		String password ="hbstudent";
		Connection newConnection = DriverManager.getConnection(connectionUrl, userName, password);
		System.out.println("Success!!!");

	}

}
