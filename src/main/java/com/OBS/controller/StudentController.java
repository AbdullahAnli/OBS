package com.OBS.controller;

import com.OBS.entity.Student;
import com.OBS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student>getStudentById(@PathVariable Long id){
        Student student=studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }
    @PostMapping
    public ResponseEntity<Student>createStudent(@RequestBody Student student){
        Student createStudent= studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createStudent);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }



}
