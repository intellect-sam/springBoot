package com.intellectCode.Springboottutorial.service;

import com.intellectCode.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService  {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepatmentList();

   public Department fetchDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);

   public Department fetchDepartmentByCode(String departmentCode);
}
 