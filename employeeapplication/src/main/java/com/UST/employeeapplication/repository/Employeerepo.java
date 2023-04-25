package com.UST.employeeapplication.repository;

import com.UST.employeeapplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Employeerepo extends JpaRepository<Employee,String> {
    Employee findByempId(String empId);

    void deleteByempId(String empId);
}
