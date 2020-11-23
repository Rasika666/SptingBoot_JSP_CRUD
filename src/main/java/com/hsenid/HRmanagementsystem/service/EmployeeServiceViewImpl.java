package com.hsenid.HRmanagementsystem.service;

import com.hsenid.HRmanagementsystem.Model.Employee;
import com.hsenid.HRmanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceViewImpl implements EmployeeServiceView{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getEmployees();
    }

    @Override
    public List<Employee> getEmployeeById(int id) {
        return null;
    }

    @Override
    public Employee getEmployeeByIdCrud(Integer id) {
        return employeeRepository.findEmployeeByEmployeeId(id);
    }

    @Override
    public Employee updateEmployeeCrud(Integer id, Employee employee) {
        Employee existsEmp = employeeRepository.findEmployeeByEmployeeId(id);
        if(existsEmp != null) {
            existsEmp.setFirstName(employee.getFirstName());
            existsEmp.setLastName(employee.getLastName());
            existsEmp.setAddress(employee.getAddress());
            existsEmp.setAge(employee.getAge());
            existsEmp.setGender(employee.getGender());
            existsEmp.setDesignation(employee.getDesignation());
            existsEmp.setEmail(employee.getEmail());
            existsEmp.setMobileNumber(employee.getMobileNumber());
            existsEmp.setFraction(employee.getFraction());
            existsEmp.setDepartments(employee.getDepartments());
            existsEmp.setSbus(employee.getSbus());
        }

        employeeRepository.save(existsEmp);

        return  existsEmp;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployeeCrud() {
        List<Employee> employees = new ArrayList<>();
        Iterable<Employee> all = employeeRepository.findAll();
        all.forEach(employees::add);

        return employees;
    }
}
