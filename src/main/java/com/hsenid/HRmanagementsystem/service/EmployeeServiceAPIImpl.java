package com.hsenid.HRmanagementsystem.service;

import com.hsenid.HRmanagementsystem.Model.Employee;
import com.hsenid.HRmanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceAPIImpl implements EmployeeServiceAPI{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        Iterable<Employee> all = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        all.forEach(employees::add);
        return employees;
    }

    @Override
    public List<Employee> getEmployeeById(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        List<Employee> employees = new ArrayList<>();
        byId.ifPresent(employees::add);
        return employees;

    }

    @Override
    public List<Employee> viewEmployeeByName(String fname, String lname) {
        return employeeRepository.findByFirstNameOrLastName(fname,lname);
    }

    @Override
    public List<Employee> getEmployeesByDepartmentName(String dname) {
        return employeeRepository.findByDepartmentsDepartmentName(dname);
    }

    @Override
    public Employee createOrUpdateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteEmployeeByEmployeeId(id);
    }


}
