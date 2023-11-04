package com.example.springbootrestcrud.springjpa.controller;

import com.example.springbootrestcrud.entity.Employee;
import com.example.springbootrestcrud.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeJPARestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeJPARestController(@Qualifier("employeeJPAServiceImpl") EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employeesJPA")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employeesJPA/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.findById(id);
        if (employee == null) {
            throw new RuntimeException("Employee Id not found: " + id);
        }
        return employee;
    }

    @PostMapping("/employeesJPA")
    public Employee addEmployee(@RequestBody Employee employee) {
        //force id to save data
        employee.setId(0);
        return employeeService.save(employee);

    }

    @PutMapping("/employeesJPA")
    public Employee updateEmployee(@RequestBody Employee employee) {
        //update existing record
        return employeeService.save(employee);
    }

    @DeleteMapping("/employeesJPA/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Delete Employee Id not found: " + employeeId);
        }
        employeeService.delete(employeeId);
        return "Deleted Employee Id: " + employeeId;
    }
}
