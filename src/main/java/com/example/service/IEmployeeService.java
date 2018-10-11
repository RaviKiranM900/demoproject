/*
 * @TodoService.java	@30-Aug-2018
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Todo;

/**
 * <p>
 * </p>
 *
 * @author Ravi.m
 * @version 1.0
 *
 */
@Service
public class IEmployeeService {

    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;
    static {
        todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "in28Minutes", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "in28Minutes", "Learn Hibernate", new Date(),
                false));
    }
    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

}
