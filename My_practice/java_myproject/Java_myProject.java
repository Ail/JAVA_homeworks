/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_myproject;

/**
 *
 * @author Alekarios
 */
import java.util.Scanner;
public class Java_myProject {

    
    public static void main(String[] args) {
       
        Grades student = new Grades();
        Scanner input = new Scanner(System.in);
        System.out.println("Give first name");
        String name = input.next();
        System.out.println("Give second name");
        String name1 = input.next();
        student.setName(name, name1);
        System.out.println("Give student's identity");
        String idendity = input.next();
        student.setStudentIdentity(idendity);
        System.out.println("Give student's grade");
        int grade = input.nextInt();
        student.setGrade(grade);
        System.out.println("Student's full name is: "+student.getName()+
                "\n"+"student's identity is: "+student.getStudentIdentity()+
                "\n"+"Student's grade is: "+student.getGrade());
        
        
        
        
    }
    
}
