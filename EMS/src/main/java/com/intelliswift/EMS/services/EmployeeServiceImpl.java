package com.intelliswift.EMS.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelliswift.EMS.DAOs.Employee;
import com.intelliswift.EMS.DTOs.EmployeeDTO;
import com.intelliswift.EMS.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

	@Override
	public Employee createEmployee(EmployeeDTO empDTO) {
		Employee emp = modelMapper.map(empDTO, Employee.class);
        return employeeRepo.save(emp);
	}

	@Override
	public Employee getEmployee(int empId) {
		Employee emp = employeeRepo.findEmployeeById(empId);
		return emp;
	}
	
	@Override
	public Employee getEmployeeLogin(EmployeeDTO empDTO) {
		Employee emp = modelMapper.map(empDTO, Employee.class);
		Employee emp2 = employeeRepo.findEmployeeByEmailAndPassword(emp.getEmail(), emp.getPassword());
		return emp2;
	}
	
}
