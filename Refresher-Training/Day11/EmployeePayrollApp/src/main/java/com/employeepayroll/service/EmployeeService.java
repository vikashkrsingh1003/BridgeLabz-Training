package com.employeepayroll.service;




import java.util.List;

import org.springframework.data.domain.Page;

import com.employeepayroll.dto.EmployeeDTO;
public interface EmployeeService {
	
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

   
    EmployeeDTO getEmployeeById(int id);

    
    //for pagination
    Page<EmployeeDTO> getAllEmployees(int page, int size);
    
    
    List<EmployeeDTO> getEmployeesSortedBySalary(String direction);

    //using @Query
    Double findSecondHighestSalary();
    //using @Query
    Long countEmployees();
    
    
   
    EmployeeDTO updateEmployee(int id, EmployeeDTO employeeDTO);


    void deleteEmployee(int id);
    
    
}
