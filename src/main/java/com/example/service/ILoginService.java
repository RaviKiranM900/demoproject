/*
 * @ILoginService.java	@30-Aug-2018
 *
 * Copyright (c) 2013 ForSe. 
 * All rights reserved. 
 * 
 * No part of this document may be reproduced or transmitted in any form or by 
 * any means, electronic or mechanical, whether now known or later invented, 
 * for any purpose without the prior and express written consent of ForSe 
 * 
 */
package com.example.service;

import org.springframework.stereotype.Service;

/**
 * <p>
 * </p>
 *
 * @author Ravi.m
 * @version 1.0
 *
 */
@Service
public class ILoginService {
	public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("ravikiran")
                && password.equalsIgnoreCase("ravikiran");
    }
}
