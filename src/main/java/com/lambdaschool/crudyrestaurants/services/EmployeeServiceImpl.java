package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "employeeService") // need to name this implementation as the service to use
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeerepos;
}
