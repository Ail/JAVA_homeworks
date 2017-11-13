/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_java_app_2;

/**
 *
 * @author Alekarios
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Person {
    
    
    private String lastName;
    private String firstName;
    private String fathersName;
    private String birthday;
    private String writeString;
    
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFatherName(String fathersName){
        this.fathersName = fathersName;
    }
    public String getFathersName(){
        return this.fathersName;
    }
    public void setBirthday(int day,int month,int year){
        this.birthday = String.format("%d/%d/%d",day,month,year);
    }
    public String getBirthday(){
        return this.birthday;
    }
    public void WriteString(int year) throws FileNotFoundException{
        
        PrintWriter writer = new PrintWriter(this.lastName+"."+this.firstName+".txt");
        for(int i = 1; i<= 3; i++){
            switch(i){
                case 1: writer.println("Line "+i+": "+this.lastName+", "+this.firstName+", "+this.fathersName);
                break;
                case 2: writer.println("Line "+i+": "+this.birthday);
                break;
                default: writer.println("Line "+i+": "+"Your age is "+(2017-year));
                writer.close();
                break;
            }
        }
    }
    
    }
    
    
    

