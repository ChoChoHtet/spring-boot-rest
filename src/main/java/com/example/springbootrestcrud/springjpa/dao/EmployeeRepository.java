package com.example.springbootrestcrud.springjpa.dao;

import com.example.springbootrestcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
