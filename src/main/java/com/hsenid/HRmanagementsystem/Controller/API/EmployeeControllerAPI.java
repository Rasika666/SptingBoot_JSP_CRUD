package com.hsenid.HRmanagementsystem.Controller.API;

import com.hsenid.HRmanagementsystem.Model.Employee;
import com.hsenid.HRmanagementsystem.service.EmployeeService;
import com.hsenid.HRmanagementsystem.service.EmployeeServiceAPI;
import com.hsenid.HRmanagementsystem.service.EmployeeServiceAPIImpl;
import com.hsenid.HRmanagementsystem.service.EmployeeServiceView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeControllerAPI {
    @Autowired
    private EmployeeServiceAPI service;

    @GetMapping("api/v0/employees")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v0/employee/{id}")
    public List<Employee> getEmployeeById(@PathVariable Integer id) {
        return  service.getEmployeeById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v0/employees/name")
    public List<Employee> getEmployeeByName(@RequestParam(name="fname", required = false) String fname,
                                            @RequestParam(name="lname", required = false) String lname) {
        return service.viewEmployeeByName(fname, lname);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v0/employees/department")
    public List<Employee> getEmployeeByDepartmentName(@RequestParam(name="dname", required = false) String dname) {
        return service.getEmployeesByDepartmentName(dname);
    }

    @PostMapping("api/v0/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createOrUpdateEmployee(@RequestBody Employee employee) {
        return service.createOrUpdateEmployee(employee);
    }

    @DeleteMapping("api/v0/employee/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable Integer id) {
        service.deleteEmployee(id);
    }
}
