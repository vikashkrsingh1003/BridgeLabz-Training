package com.employeepayroll.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeepayroll.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
 
	
	  @Query("SELECT MAX(e.salary) FROM Employee e WHERE e.salary < (SELECT MAX(e2.salary) FROM Employee e2)")
	    Double findSecondHighestSalary();

	    @Query("SELECT COUNT(e) FROM Employee e")
	    Long countEmployees();
	
}