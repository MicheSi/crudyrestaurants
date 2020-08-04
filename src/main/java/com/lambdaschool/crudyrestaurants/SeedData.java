package com.lambdaschool.crudyrestaurants;

import com.lambdaschool.crudyrestaurants.models.Email;
import com.lambdaschool.crudyrestaurants.models.Employee;
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

        JobTitle jt2 = new JobTitle();
        jt2.setTitle("Wizard");
        jobTitlerepos.save(jt2);

        Employee emp1 = new Employee();
        emp1.setName("CINNAMON");
        emp1.setSalary(80000.00);
        emp1.getEmails()
                .add(new Email("hops@local.com",
                        emp1));
        emp1.getEmails()
                .add(new Email("bunny@hoppin.local",
                        emp1));
        emp1.getJobtitles().add(jt1);
        emp1.getJobtitles().add(jt2);
        employeeService.save(emp1);

        Employee emp2 = new Employee();
        emp2.setName("BARNBARN");
        emp2.setSalary(80000.00);
        emp2.getEmails()
                .add(new Email("barnbarn@local.com",
                        emp2));
        emp2.getJobtitles().add(jt1);
        employeeService.save(emp2);

        Employee emp3 = new Employee();
        emp3.setName("JOHN");
        emp3.setSalary(75000.00);
        employeeService.save(emp3);
    }
}
