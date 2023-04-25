package com.UST.CollegeManager.controller;

import com.UST.CollegeManager.entity.College;
import com.UST.CollegeManager.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colleges/{collegeId}/faculties")
public class TeacherController {

    @Autowired
    private Teacher teacher;

    @PostMapping
    public ResponseEntity<Teacher> addTeacher(@PathVariable Long collegeId, @RequestBody Teacher faculty) {
        teacher.setCollege(new College(collegeId));
        return new ResponseEntity<>(TeacherService.addFaculty(faculty), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Teacher>> getFacultiesByCollegeId(@PathVariable Long collegeId) {
        return ResponseEntity.ok(TeacherService.getFacultiesByCollegeId(collegeId));
    }

    @GetMapping("/departments/{departmentId}")
    public ResponseEntity<List<Teacher>> getFacultiesByDepartmentId(@PathVariable Long departmentId) {
        return ResponseEntity.ok(TeacherService.getFacultiesByDepartmentId(departmentId));
    }
}

