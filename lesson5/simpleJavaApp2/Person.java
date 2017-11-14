/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Alekarios
 */
public class Person {
    
    private String lastName;
    private String firstName;
    private String fathersName;
    private String birthday;
    
    
    public void setString(int x,String s){
        
        switch(x){
            
            case 0: 
                this.lastName = s;
                break;
            case 1:
                this.firstName = s;
                break;
            case 2:
                this.fathersName = s;
                break;
            case 3:
                this.birthday = s;
                
        }
        
    }
    
    public String getString(int x){
        
        switch(x){
            case 0:
                return this.lastName;
            case 1:
                return this.firstName;
            case 2:
                return this.fathersName;
            case 3:
                return this.birthday;
        }
        return null;
       
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}


