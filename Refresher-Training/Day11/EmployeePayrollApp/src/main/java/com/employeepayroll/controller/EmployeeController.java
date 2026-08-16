package com.employeepayroll.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(
            @Valid @RequestBody EmployeeDTO employeeDTO) {

        EmployeeDTO savedEmployee =
                employeeService.createEmployee(employeeDTO);

        return new ResponseEntity<>(
                savedEmployee,
                HttpStatus.CREATED
        );
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(
            @PathVariable int id) {

        EmployeeDTO employee =
                employeeService.getEmployeeById(id);

        return ResponseEntity.ok(employee);
    }

    // READ ALL using pagination
    @GetMapping
    public ResponseEntity<Page<EmployeeDTO>> getAllEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        Page<EmployeeDTO> employees =
                employeeService.getAllEmployees(page, size);

        return ResponseEntity.ok(employees);
    }
    
    //Sort basis of salary
    
    @GetMapping("/sort/salary")
    public ResponseEntity<List<EmployeeDTO>> getEmployeesSortedBySalary(
            @RequestParam(defaultValue = "asc") String direction) {

        List<EmployeeDTO> employees =
                employeeService.getEmployeesSortedBySalary(direction);

        return ResponseEntity.ok(employees);
    }
    
    
    
    @GetMapping("/second-highest-salary")
    public ResponseEntity<Double> findSecondHighestSalary() {

        Double salary =
                employeeService.findSecondHighestSalary();

        return ResponseEntity.ok(salary);
    }
    
    
    @GetMapping("/count")
    public ResponseEntity<Long> countEmployees() {

        Long count =
                employeeService.countEmployees();

        return ResponseEntity.ok(count);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(
            @PathVariable int id,
            @Valid @RequestBody EmployeeDTO employeeDTO) {

        EmployeeDTO updatedEmployee =
                employeeService.updateEmployee(id, employeeDTO);

        return ResponseEntity.ok(updatedEmployee);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(
            @PathVariable int id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }
}