/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Purusottam
 */
public class StudentDao {
    public static boolean insertStudentToDB(Student st){
        
        boolean f = false;
        try{
            Connection con= CP.createC();
            String q = "insert into students(sname,sphone,scity) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());
            
            //execute 
            pstmt.executeUpdate();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    
        
    }
    
        
    public static boolean deleteStudent(int userId){
         boolean f = false;
        try{
            Connection con= CP.createC();
            String q = "delete from students where sid=?;";
            PreparedStatement pstmt = con.prepareStatement(q);
             pstmt.setInt(1, userId);
            //execute 
            pstmt.executeUpdate();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    
    }
    
    public static void showAllStudent(){
         boolean f = false;
        try{
            Connection con= CP.createC();
            String q = " select * from students;";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while(set.next())
            {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString("scity");
                System.out.println("Id:"+id);
                System.out.println("Name:"+name);
                System.out.println("phone:"+phone);
                System.out.println("city:"+city);
                System.out.println("++++++++++++++");
            }
            //execute 
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
             
    }

         
    
    
            
        
         
        
        
     
}
