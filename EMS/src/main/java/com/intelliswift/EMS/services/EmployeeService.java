package com.intelliswift.EMS.services;

import com.intelliswift.EMS.DAOs.Employee;
import com.intelliswift.EMS.DTOs.EmployeeDTO;

public interface EmployeeService {
    public Employee createEmployee(EmployeeDTO empDTO);
    public Employee getEmployee(int empId);
    public Employee getEmployeeLogin(EmployeeDTO empDTO);
}
