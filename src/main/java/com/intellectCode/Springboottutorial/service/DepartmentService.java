package com.intellectCode.Springboottutorial.service;

import com.intellectCode.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService  {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepatmentList();
}
