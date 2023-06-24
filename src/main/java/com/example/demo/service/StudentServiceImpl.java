package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import com.example.demo.repo.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public Boolean createStudent(StudentDto studentDto) {
        return studentRepository.createStudent(studentDto);
    }

    public Boolean updateStudent(Long id,StudentDto studentDto) {
        return true;
    }

    public Boolean deleteStudent(int id){
        studentRepository.deleteStudent(id);
        return true;
    }

    public Boolean updateStudent( int id, StudentDto studentDto){
        studentRepository.updateStudent(id,studentDto);
        return true;
    }

    public Boolean getAll(){
        studentRepository.findAll();
        return true;
    }
}
