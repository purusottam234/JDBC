1/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.manage;

/**
 *
 * @author Purusottam
 */
public class Student {
    private int studentId;
    private String StudentName;
    private String studentPhone;
    private String studentCity;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public Student(int studentId, String StudentName, String studentPhone, String studentCity) {
        this.studentId = studentId;
        this.StudentName = StudentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(String StudentName, String studentPhone, String studentCity) {
        super();
        this.StudentName = StudentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }
    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", StudentName=" + StudentName + ", studentPhone=" + studentPhone + ", studentCity=" + studentCity + '}';
    }
    
    
}
