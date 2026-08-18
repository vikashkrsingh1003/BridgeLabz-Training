package com.employeepayroll.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequestDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Enter a valid email")
    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@amazon\\.com$",
            message = "Email must be a company email"
        )
    private String email;

    @NotBlank(message = "Phone is required")
    private String phone;

    @Positive(message = "Salary must be greater than 0")
    private double salary;

    @NotNull(message = "Department ID is required")
    @Positive(message = "Department ID must be greater than zero")
    private Long departmentId;
}