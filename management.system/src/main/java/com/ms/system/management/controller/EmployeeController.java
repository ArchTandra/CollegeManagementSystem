package com.ms.system.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ms.system.management.service.MarksService;

@RestController
public class EmployeeController {

    @Autowired
    MarksService marksService;

   @GetMapping("/hello")
    public ResponseEntity<String> getMarks()
    {
        //call to database
        marksService.getMarks("maitri", "");

        return new ResponseEntity<String>("Hello", HttpStatus.OK);
    }



}
