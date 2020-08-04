package com.lambdaschool.crudyrestaurants;

import com.lambdaschool.crudyrestaurants.models.JobTitle;
import com.lambdaschool.crudyrestaurants.repositories.JobTitleRepository;
import com.lambdaschool.crudyrestaurants.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Transactional
@Component
public class SeedData implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private JobTitleRepository jobTitlerepos;

    @Override
    public void run(String... args) throws Exception {
        JobTitle jt1 = new JobTitle();
        jt1.setTitle("Big Boss");
        jobTitlerepos.save(jt1);

        jobTitle jt2 = new JobTitle();
        jt2.setTitle("Wizard");
        jobTitlerepos.save(jt2);
    }
}
