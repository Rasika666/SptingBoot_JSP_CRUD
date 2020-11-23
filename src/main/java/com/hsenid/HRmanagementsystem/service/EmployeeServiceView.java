package com.hsenid.HRmanagementsystem.service;

import com.hsenid.HRmanagementsystem.Model.Employee;

import java.util.List;

public interface EmployeeServiceView extends EmployeeService{
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Integer id);
    List<Employee> getAllEmployeeCrud();
    Employee getEmployeeByIdCrud(Integer id);
    Employee updateEmployeeCrud(Integer id, Employee employee);
}
