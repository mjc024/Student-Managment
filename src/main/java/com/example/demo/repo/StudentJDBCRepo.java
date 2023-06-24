package com.example.demo.repo;

import com.example.demo.dto.StudentDto;

public interface StudentJDBCRepo {

    int createUser(StudentDto studentDto);
}
