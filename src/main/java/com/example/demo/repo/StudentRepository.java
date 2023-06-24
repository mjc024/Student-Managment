package com.example.demo.repo;

import com.example.demo.dto.StudentDto;

public interface StudentRepository {
    Boolean createStudent(StudentDto studentDto);
    Boolean deleteStudent(int id);
    Boolean updateStudent( int id, StudentDto studentDto);
    Boolean findAll();
}
