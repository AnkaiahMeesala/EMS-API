package com.intelliswift.EMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intelliswift.EMS.DAOs.Employee;
import com.intelliswift.EMS.DTOs.EmployeeDTO;
import com.intelliswift.EMS.services.EmployeeServiceImpl;
import com.intelliswift.EMS.utils.APIResponse;

@RestController
@RequestMapping("/api/user")
public class EmployeeController {

	    @Autowired
	    private EmployeeServiceImpl employeeServiceImpl;

	    @PostMapping("/")
	    public ResponseEntity<APIResponse> createUser(@RequestBody EmployeeDTO employeeDTO){
	        Employee employee = employeeServiceImpl.createEmployee(employeeDTO);
	        return new ResponseEntity<>(new APIResponse("S", employee, "Employee Successfully Onboarded..."), HttpStatus.CREATED);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<APIResponse> getEmployee(@PathVariable("id") int empId){
	        Employee employee = employeeServiceImpl.getEmployee(empId);
	        if(employee == null)
	            return new ResponseEntity<APIResponse>(new APIResponse("Employee data not found", "Failed"), HttpStatus.NOT_FOUND);
	        else
	            return new ResponseEntity<APIResponse>(new APIResponse("Successfully retrieved the user", employee, "Success"), HttpStatus.CREATED);
	    }
	    
	    @PostMapping("/login")
	    public ResponseEntity<APIResponse> getEmployeeLogin(@RequestBody EmployeeDTO employeeDTO){
	        Employee employee = employeeServiceImpl.getEmployeeLogin(employeeDTO);
	        if(employee == null)
	            return new ResponseEntity<APIResponse>(new APIResponse("Employee data not found", "Failed"), HttpStatus.NOT_FOUND);
	        else
	            return new ResponseEntity<APIResponse>(new APIResponse("Successfully retrieved the user", employee, "Success"), HttpStatus.CREATED);
	    }
	    
}
