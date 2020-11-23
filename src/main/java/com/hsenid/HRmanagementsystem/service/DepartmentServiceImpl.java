package com.hsenid.HRmanagementsystem.service;

import com.hsenid.HRmanagementsystem.Model.Department;
import com.hsenid.HRmanagementsystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository riRepository;
    @Override
    public List<Department> getAllDepartments() {
        List<Department>  departments = new ArrayList<>();
        Iterable<Department> all = riRepository.findAll();
        all.forEach(departments::add);
        return departments;
    }
}
