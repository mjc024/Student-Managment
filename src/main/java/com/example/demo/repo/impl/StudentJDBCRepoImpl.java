package com.example.demo.repo.impl;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Slf4j
@Repository
@RequiredArgsConstructor
public class StudentJDBCRepoImpl implements StudentRepository {

    private final JdbcTemplate template;

    public Boolean createStudent(StudentDto studentDto) {
        String query = "insert into student(name,email) values(?,?)";
        template.update(query, new Object[]{studentDto.getName(), studentDto.getEmail()});
        return true;
    }

    public Boolean deleteStudent(int id) {
        String query = "delete from student where id = ?";
        template.update(query,id);
        return true;
    }

    public Boolean updateStudent( int id, StudentDto studentDto){
        StringBuilder query = new StringBuilder("update student set");

        if(Objects.isNull(studentDto.getName())  && Objects.isNull(studentDto.getEmail()) ) {
            return false;
        }

        List<String> setClauses = new ArrayList<>();
        ArrayList params = new ArrayList<>();

        if(studentDto.getName()!= null){
            setClauses.add(" name = ?");
            params.add(studentDto.getName());
        }

        if(studentDto.getEmail()!= null){
            setClauses.add(" email = ?");
            params.add(studentDto.getEmail());
        }

        query.append(String.join(",", setClauses));
        query.append(" where id = ?");
        params.add(id);

        template.update(query.toString(), params.toArray());

        return true;
    }

    public Boolean findAll(){
        String query = "select * from student";

        List<Student> listStudents = template.query(query, new BeanPropertyRowMapper( Student.class));

        for(Student s : listStudents){
            System.out.println(s);
            System.out.println("**************************************");
        }

        return true;
    }
}
