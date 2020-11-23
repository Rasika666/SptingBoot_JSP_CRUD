package com.hsenid.HRmanagementsystem.repository;

import com.hsenid.HRmanagementsystem.Model.Employee;

import java.util.List;

/**
 * used for writing template queries
 */
interface CustomEmployeeRepository {
    List<Employee> getEmployees();
    Employee findByID(int id);
}
