/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afdemp_project_main;

/**
 *
 * @author Alekarios
 */

//import necessary libraries

import java.io.Console;
import java.sql.SQLException;
import java.util.Scanner;


public  class Login_Screen extends Database_Access {
    
    //private fields (flag role)
    
    private static boolean ModeAdmin ;
    private static boolean ModeUser ;
    private static String UserLogIn;
    
   
 
    Scanner input = new Scanner(System.in);


    public  void checkInput() throws ClassNotFoundException, SQLException{
        Console console = System.console();
        
        for(int i = 0; i <=2; i++){
            
          
            // Asking for username
            System.out.println("Type the username:");
            String usernameInput = input.next();
            
            // Asking for password
           char passwordArray[] = console.readPassword("Type the password:");
           String passwordInput = new String(passwordArray);
           
           //execute real time encryption
           super.encryption(usernameInput, passwordInput);
         
            //extended method which returns data from database
            super.connection(usernameInput,(super.sha256(passwordInput)));
            
   
            //block code which checks credentials and admin or simple user mode
            if(usernameInput.equals(super.getUsername()) && super.sha256(passwordInput).equals(super.getPassword())){
                
                
                if(usernameInput.equals("admin")){
               
                System.out.println("You logged as administrator mode");   
                this.ModeAdmin=true;
                this.UserLogIn = usernameInput;
                break;
                }
                else{
                    System.out.println("You logged as user mode,Your username is: "+
                        usernameInput);
                this.ModeUser = true;
                this.UserLogIn = usernameInput;
                break;
                }
            }
            //switch statement for printing how many attemps left
            switch(i){
                
                case 0:
                    System.out.println("Try again,two attemps left");
                    break;
                
                case 1:
                    System.out.println("Try again,one attemps left");
                    break;
                
                case 2:
                    System.out.println("No attemps left");
                    System.exit(0);
                    break;
            }
        
        }

    }
    
    //return admin mode
    public   boolean getModeAdmin(){
        
        return this.ModeAdmin;
    }
    //return usermode
    public boolean getModeUser(){
        
        return this.ModeUser;
    }
    //return the user who logged in
    public String getUserLogIn(){
        
        return this.UserLogIn;
    }
    
    

}

