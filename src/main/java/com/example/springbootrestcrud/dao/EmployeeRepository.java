package com.example.springbootrestcrud.dao;

import com.example.springbootrestcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * By annotate @RepositoryRestResource(path = "members")
 * customize resource path  then it will expose members (/members) instead of employee (/employees)
 **/
// @RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
