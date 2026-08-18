package com.employeepayroll.mapper;

import org.springframework.stereotype.Component;

import com.employeepayroll.dto.DepartmentRequestDTO;
import com.employeepayroll.dto.DepartmentResponseDTO;
import com.employeepayroll.model.Department;


@Component
public class DepartmentMapper {

    public Department toEntity(DepartmentRequestDTO request) {
       
    	Department department = new Department();
        department.setName(request.getName());
        return department;
    }

    public DepartmentResponseDTO toResponseDTO(Department department) {
       
    	return new DepartmentResponseDTO(department.getId(), department.getName());
    }
}