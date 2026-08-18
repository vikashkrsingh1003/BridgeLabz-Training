package com.employeepayroll.mapper;

import org.springframework.stereotype.Component;

import com.employeepayroll.dto.EmployeeRequestDTO;
import com.employeepayroll.dto.EmployeeResponseDTO;
import com.employeepayroll.model.Employee;

@Component
public class EmployeeMapper {

    public Employee toEntity(EmployeeRequestDTO request) {
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setPhone(request.getPhone());
        employee.setSalary(request.getSalary());

        return employee;
    }

    public EmployeeResponseDTO toResponseDTO(Employee employee) {
    	
        return new EmployeeResponseDTO(employee.getId(), employee.getName(), employee.getEmail(), employee.getPhone(), employee.getSalary(), employee.getDepartment().getId());
    }
}