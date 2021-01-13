package com.ms.system.management.controller;

import com.ms.system.management.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ms.system.management.service.MarksService;

import javax.validation.Valid;

@RestController
public class EmployeeController {

    @Autowired
    MarksService marksService;

   @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id)
    {
        Student st = marksService.getStudent(id).get();
        return new ResponseEntity<Student>(st, HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<String> createStudent(@RequestBody Student st)
    {
        marksService.createStudent(st);
        return new ResponseEntity<String>("Created", HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id)
    {
        marksService.deleteStudent(id);
        return new ResponseEntity<String>("deleted", HttpStatus.OK);
    }



}
