package com.example.springbootrestcrud.rest;

import com.example.springbootrestcrud.entity.Student;
import com.example.springbootrestcrud.exception.StudentErrorException;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private final List<Student> students = new ArrayList<>();

    @PostConstruct
    private void loadData() {
        students.add(new Student("Cho", "Htet"));
        students.add(new Student("Aye", "Aye"));
        students.add(new Student("Mg", "Mg"));

    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        if (studentId < 0 || studentId >= students.size()) {
            throw new StudentErrorException("Student Id not found " + studentId);
        }
        return students.get(studentId);
    }


}
