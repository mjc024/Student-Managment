package com.example.demo.service;


import com.example.demo.dto.StudentDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentService {

    Boolean createStudent(StudentDto studentDto);
    Boolean updateStudent(Long id, StudentDto studentDto);

    Boolean deleteStudent(int id);

    Boolean updateStudent( int id, StudentDto studentDto);

    Boolean getAll();

}
