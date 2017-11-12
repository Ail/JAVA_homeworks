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
public class Grades {
    private String first_name;
    private String Second_name;
    private String student_identity;
    private int grade;
    
    public void setName(String first_name,String second_name){
        String name = first_name.toUpperCase();
        String name1 = second_name.toUpperCase();
        this.first_name = name;
        this.Second_name = name1;
        
    }
    public String getName(){
        return this.first_name+" "+this.Second_name; 
    }
    
    public void setStudentIdentity(String identity){
        this.student_identity = identity;
    }
    public String getStudentIdentity(){
        return this.student_identity;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getGrade(){
        return this.grade;
    }
    
}
