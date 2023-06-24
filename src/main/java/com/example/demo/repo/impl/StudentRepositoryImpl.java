//package com.example.demo.repo.impl;
//
//import com.example.demo.dto.StudentDto;
//import com.example.demo.repo.DatabaseConnection;
//import com.example.demo.repo.StudentRepository;
//import org.springframework.stereotype.Repository;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//@Repository
//public class StudentRepositoryImpl implements StudentRepository {
//
//    public Boolean createStudent(StudentDto studentDto){
//        try{
//            Connection con = DatabaseConnection.createConnection();
//            String query = "insert into student(name, email) values(?,?)";
//
//            PreparedStatement preparedStatement = con.prepareStatement(query);
//
//            preparedStatement.setString(1, studentDto.getName());
//            preparedStatement.setString(2, studentDto.getEmail());
//
//            preparedStatement.executeUpdate();
//        }
//        catch (Exception e){
//
//            e.printStackTrace();
//        }
//
//        return true;
//    }
//}
