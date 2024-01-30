package com.learnspring.springbootdemo.service;

import com.learnspring.springbootdemo.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department updateDepartment(Long departmentId, Department department);

    public Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Optional<Department> fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department getDepartmentByName(String departmentName);
}
