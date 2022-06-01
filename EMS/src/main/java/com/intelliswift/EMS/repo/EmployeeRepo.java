package com.intelliswift.EMS.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.intelliswift.EMS.DAOs.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	Employee findEmployeeById(int empid);
	Employee findEmployeeByEmailAndPassword(String email, String password);
}
