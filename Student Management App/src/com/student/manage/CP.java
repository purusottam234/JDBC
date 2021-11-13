/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.manage;

 
import java.sql.Connection;  
import java.sql.DriverManager;  
 

/**
 *
 * @author Purusottam
 */
public class CP {
   static Connection con;
   public static Connection createC(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           //create the connection
           String user = "root";
           String password = "root";
           String url = "jdbc:mysql://localhost:3306/student_manage";
           con = DriverManager.getConnection(url,user,password);
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return con;
    }
        
   
    
    
}
