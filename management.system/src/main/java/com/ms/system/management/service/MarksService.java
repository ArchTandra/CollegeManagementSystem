package com.ms.system.management.service;

import com.ms.system.management.entity.Student;
import com.ms.system.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MarksService {

    @Autowired
    StudentRepository repository;

    public Optional<Student> getStudent(int id)
    {
        return repository.findById(id);
    }

    public void createStudent(Student student)
    {
        repository.save(student);
    }

    public void deleteStudent(int id)
    {
        repository.deleteById(id);
    }


}
