package com.cse.tansik.BAL;

import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Prequistes;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class GMBAOimpl implements GMBAO {
    public GMBAOimpl() {
        super();
    }

    @Override
    public List<Admin> getAllAdmins() {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public List<Student> getAllStudent() {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean editUser(User user) {
        // TODO Implement this method
        return false;
    }

    @Override
    //
    public Student getData(User user) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean setRequsetsForStudent(List<Request> requests, Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean sendMessage(String text, Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public Message getMessage() {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean setDate(Date start, Date end) {
        // TODO Implement this method
        return false;
    }

    @Override
    public Student getStudent(String userName, String Password) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean editStudent(Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean editPrequistes(Prequistes preq, Department dep) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<Prequistes> getPrequsites(Department dep) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public Department getDep(EduYear year, String name) {
        // TODO Implement this method
        return null;
    }

    @Override
    public List<Department> getDeps(EduYear year) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public Admin getData() {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean setData() {
        // TODO Implement this method
        return false;
    }

    @Override
    public User login(String name, String password) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean addRequest(List<Request> requests) {
        // TODO Implement this method
        return false;
    }
}
