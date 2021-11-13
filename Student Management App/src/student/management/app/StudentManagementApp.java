/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.app;

import com.student.manage.Student;
import com.student.manage.StudentDao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Purusottam
 */
public class StudentManagementApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODOcode application logic here
        System.out.println("Welcome to student management app");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
          
        while(true){
            System.out.println("Press 1 to Add student");
            System.out.println("Press 2 to delete student");
            System.out.println("press 3 to display student");
            System.out.println("press 4 to exit app");
            int c= Integer.parseInt(br.readLine());
            if(c == 1){
                //add
                System.out.println("Enter user name:");
                String name = br.readLine();
                System.out.println("Enter user phone:");
                String phone = br.readLine();
                System.out.println("Enter user city:");
                String city = br.readLine();
                // create student object to store student
                Student st = new Student(name,phone,city);
                
                boolean answer = StudentDao.insertStudentToDB(st);
//                StudentDao.insertStudentToDB(st);
                if(answer){
                    System.out.println("SUCCESSFULLY ADDED");
                }
                else{
                    System.out.println("something went wrong");
                }
                System.out.println(st);
            }
            else if(c == 2){
            //delete student
                System.out.println("Enter student id to delete:");
                int userId= Integer.parseInt(br.readLine());
                boolean f = StudentDao.deleteStudent(userId);
                if(f)
                {
                    System.out.println("Deleted....");
                }
                else{
                    System.out.println("Something went wrong");
                    
                }
                
        }
            else if(c == 3){
            //display
                System.out.println("showing all records");
            StudentDao.showAllStudent();
        }
            else if(c==4){
                //exit
                break;
            }
                    
                    
        }
    
    
    }
    

    
    
}
