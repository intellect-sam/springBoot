package com.intellectCode.Springboottutorial.service;

import com.intellectCode.Springboottutorial.entity.Department;
import com.intellectCode.Springboottutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImplement implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepatmentList() {
        return departmentRepository.findAll();
    }
}
