package com.employeepayroll.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeepayroll.dto.DepartmentRequestDTO;
import com.employeepayroll.dto.DepartmentResponseDTO;
import com.employeepayroll.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@PostMapping
	public ResponseEntity<DepartmentResponseDTO> createDepartment(@Valid @RequestBody DepartmentRequestDTO request) {
		return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.createDepartment(request));
	}

	@GetMapping
	public ResponseEntity<Page<DepartmentResponseDTO>> getAllDepartments(
			@PageableDefault(page = 0, size = 5) Pageable pageable) {

		return ResponseEntity.ok(departmentService.getAllDepartments(pageable));
	}

	@GetMapping("/{id}")
	public ResponseEntity<DepartmentResponseDTO> getDepartmentById(@PathVariable Long id) {
		return ResponseEntity.ok(departmentService.getDepartmentById(id));
	}

	@PutMapping("/{id}")
	public ResponseEntity<DepartmentResponseDTO> updateDepartment(@PathVariable Long id,
			@Valid @RequestBody DepartmentRequestDTO request) {
		return ResponseEntity.ok(departmentService.updateDepartment(id, request));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
		return ResponseEntity.noContent().build();
	}
}