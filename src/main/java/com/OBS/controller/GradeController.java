package com.OBS.controller;

import com.OBS.entity.Grade;
import com.OBS.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @GetMapping
    public List<Grade>getGradesAll(){
        return gradeService.getGradesAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Grade>getGradeById(@PathVariable Long id){
        Grade grade= gradeService.getGrandeById(id);
        return ResponseEntity.ok(grade);
    }
    @PostMapping
    public ResponseEntity<Grade>createGrade(@RequestBody Grade grade){
        Grade createGrade = gradeService.createGrade(grade);
        return ResponseEntity.status(HttpStatus.CREATED).body(createGrade);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrade(@PathVariable Long id) {
        gradeService.deleteGrade(id);
        return ResponseEntity.noContent().build();
    }

}
