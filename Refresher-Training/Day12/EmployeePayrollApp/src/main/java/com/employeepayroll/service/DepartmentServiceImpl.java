package com.employeepayroll.service;


import java.util.logging.Logger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.employeepayroll.dto.DepartmentRequestDTO;
import com.employeepayroll.dto.DepartmentResponseDTO;
import com.employeepayroll.exception.DepartmentNotFoundException;
import com.employeepayroll.mapper.DepartmentMapper;
import com.employeepayroll.model.Department;
import com.employeepayroll.repository.DepartmentRepository;



@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	 private static final Logger logger =
	            Logger.getLogger(DepartmentServiceImpl.class.getName());

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, DepartmentMapper departmentMapper) {
        this.departmentRepository = departmentRepository;
        this.departmentMapper = departmentMapper;
    }

    @Override
    public DepartmentResponseDTO createDepartment(DepartmentRequestDTO request) {
    	
    	logger.info("Creating department with name: " + request.getName());
    	
        Department department = departmentMapper.toEntity(request);
        Department savedDepartment = departmentRepository.save(department);
        
        logger.info(
                "Department created successfully with id: "
                        + savedDepartment.getId());
        return departmentMapper.toResponseDTO(savedDepartment);
    }

    @Override
    public Page<DepartmentResponseDTO> getAllDepartments(Pageable pageable) {
    	
        return departmentRepository.findAll(pageable)
                .map(departmentMapper::toResponseDTO);
    }

    @Override
    public DepartmentResponseDTO getDepartmentById(Long id) {
    	
    	 logger.info("Fetching department with id: " + id);
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new DepartmentNotFoundException("Department not found with id: " + id));

        logger.info("Department found with id: " + id);
        return departmentMapper.toResponseDTO(department);
    }


    @Override
    public DepartmentResponseDTO updateDepartment(
            Long id,
            DepartmentRequestDTO request) {

        logger.info("Updating department with id: " + id);

        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> {

                    logger.warning(
                            "Department not found with id: " + id);

                    return new DepartmentNotFoundException(
                            "Department not found with id: " + id);
                });

        department.setName(request.getName());

        Department updatedDepartment =
                departmentRepository.save(department);

        logger.info(
                "Department updated successfully with id: "
                        + updatedDepartment.getId());

        return departmentMapper.toResponseDTO(updatedDepartment);
    
    }

    @Override
    public void deleteDepartment(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new DepartmentNotFoundException("Department not found with id: " + id));

        departmentRepository.delete(department);
    }
}