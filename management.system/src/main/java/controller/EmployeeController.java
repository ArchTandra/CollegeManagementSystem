package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.MarksService;

@RestController
public class EmployeeController {

    @Autowired
    MarksService marksService;

    @GetMapping("/class/marks/students/names/name/{id}")
    public String getMarks(@PathVariable String id, @RequestParam(required = false) String subjectName)
    {
        //call to database

        return marksService.getMarks(id, subjectName);
    }



}
