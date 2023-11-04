package com.example.springbootrestcrud.springjpa.service;

import com.example.springbootrestcrud.entity.Employee;
import com.example.springbootrestcrud.service.EmployeeService;
import com.example.springbootrestcrud.springjpa.dao.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeJPAServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeJPAServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        }else {
            throw new RuntimeException("Couldn't find employee Id: "+ id);
        }
    }


    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }


    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
}
