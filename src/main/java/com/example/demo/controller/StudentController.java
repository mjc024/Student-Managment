package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @RequestMapping("/student")
    public String viewHomePage(Model model, @RequestBody StudentDto studentDto){
        if(studentService.createStudent(studentDto)){
          log.info("Student added successfully");
        }
        return "books/index";
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "books/index";
    }

    @PatchMapping ("/student/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody StudentDto studentDto){
        studentService.updateStudent(id, studentDto);
        return "books/index";
    }

    @ResponseBody
    @GetMapping("/students/list")
    public String getAll(){
        studentService.getAll();
        return "books/index";
    }

}
