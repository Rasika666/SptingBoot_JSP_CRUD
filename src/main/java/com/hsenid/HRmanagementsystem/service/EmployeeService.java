package com.hsenid.HRmanagementsystem.service;

import com.hsenid.HRmanagementsystem.Model.Department;
import com.hsenid.HRmanagementsystem.Model.Employee;
import com.hsenid.HRmanagementsystem.Model.Sbu;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    List<Employee> getEmployeeById(int id);

}
