package com.hsenid.HRmanagementsystem.repository;

import com.hsenid.HRmanagementsystem.Model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getInt("employee_id"));
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setAge(resultSet.getInt("age"));
        employee.setGender(resultSet.getString("gender"));
        employee.setDesignation(resultSet.getString("designation"));
        employee.setAddress(resultSet.getString("address"));
        employee.setEmail(resultSet.getString("email"));
        employee.setMobileNumber(resultSet.getString("mobile_number"));
//        employee.setFrc_id(resultSet.getInt("frc_id"));
        employee.setLast_modified_date(resultSet.getTimestamp("last_modified_date"));

        return employee;
    }
}
