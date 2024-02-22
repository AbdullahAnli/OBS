package com.OBS.service;

import com.OBS.entity.Grade;
import com.OBS.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    public List<Grade>getGradesAll(){
        return gradeRepository.findAll();
    }
    public Grade getGrandeById(Long id){
        return gradeRepository.findById(id).orElseThrow(null);
    }
    public Grade createGrade(Grade grade){
        return gradeRepository.save(grade);
    }
    public void deleteGrade(Long id) {
        gradeRepository.deleteById(id);
    }

}
