package com.employeepayroll.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    private String email;
    private String phone;
    private double salary;
    
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}