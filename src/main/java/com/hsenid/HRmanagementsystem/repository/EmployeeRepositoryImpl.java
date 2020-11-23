package com.hsenid.HRmanagementsystem.repository;

import com.hsenid.HRmanagementsystem.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class EmployeeRepositoryImpl implements CustomEmployeeRepository {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<Employee> getEmployees() {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        List<Employee> employees = template.query("SELECT * FROM employee",
                new EmployeeRowMapper());

        return employees;

    }

    @Override
    public Employee findByID(int id) {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        Employee employee = template.queryForObject("SELECT * FROM employee WHERE employee_id = ?",
                new EmployeeRowMapper(),
                id);

        return employee;
    }
}
