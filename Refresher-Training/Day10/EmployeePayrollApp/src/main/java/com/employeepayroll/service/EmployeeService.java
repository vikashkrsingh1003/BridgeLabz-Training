package com.employeepayroll.service;

import java.util.List;

import com.employeepayroll.dto.EmployeeDTO;
public interface EmployeeService {
	
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

   
    EmployeeDTO getEmployeeById(int id);


    List<EmployeeDTO> getAllEmployees();

   
    EmployeeDTO updateEmployee(int id, EmployeeDTO employeeDTO);


    void deleteEmployee(int id);
    
    
}
