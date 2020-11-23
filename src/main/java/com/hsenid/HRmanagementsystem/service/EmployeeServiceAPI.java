package com.hsenid.HRmanagementsystem.service;

import com.hsenid.HRmanagementsystem.Model.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeServiceAPI extends EmployeeService{
    List<Employee> viewEmployeeByName(String fname, String lname);
    List<Employee> getEmployeesByDepartmentName(String dname);
    Employee createOrUpdateEmployee(Employee employee);
    @Transactional
    void deleteEmployee(Integer id);

}
