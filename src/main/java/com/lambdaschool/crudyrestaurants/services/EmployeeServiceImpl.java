package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.models.Employee;
import com.lambdaschool.crudyrestaurants.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "employeeService") // need to name this implementation as the service to use
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeerepos;

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeerepos.save(employee);
    }
}
