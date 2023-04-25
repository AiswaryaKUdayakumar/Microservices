package com.UST.employeeapplication.service;

import com.UST.employeeapplication.entity.Employee;
import com.UST.employeeapplication.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
@RestController
@RequestMapping
public class Employeeservice {
    @Autowired
    private Employeerepo repo;
    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getALLEmployee() {
        return repo.findAll();
    }

    public Employee getEmployeeByempId(String empId) {
        return repo.findByempId(empId);
    }
@Transactional
    public String deleteEmployeeByempId(String empId) {
        repo.deleteByempId(empId);
        return "deleted";
    }

    public Employee updateEmployee(String empid, Employee employee) {
        Employee existingEmployee = repo.findById(empid).orElse(null);
        if(existingEmployee == null) {
            return null;
        }
        existingEmployee.setEmpname(employee.getEmpname());
        existingEmployee.setEmpemailid(employee.getEmpemailid());
        existingEmployee.setDesignation(employee.getDesignation());
        existingEmployee.setEmphr(employee.getEmphr());
        return repo.save(existingEmployee);
    }


}
