package com.hsenid.HRmanagementsystem.repository;

import com.hsenid.HRmanagementsystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>, CustomEmployeeRepository {
    List<Employee> findByFirstNameOrLastName(String fname, String lname);
    List<Employee> findByDepartmentsDepartmentName(String dname);
    void deleteEmployeeByEmployeeId(Integer id);
    Employee findEmployeeByEmployeeId(Integer id);
}
