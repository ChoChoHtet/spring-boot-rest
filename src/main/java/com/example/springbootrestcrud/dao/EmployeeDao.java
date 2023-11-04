package com.example.springbootrestcrud.dao;

import com.example.springbootrestcrud.entity.Employee;
import java.util.List;

public interface EmployeeDao {
    List<Employee>  findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void delete(int id);

}
