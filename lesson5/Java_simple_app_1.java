/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_simple_app_1;

/**
 *
 * @author Alekarios
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Java_simple_app_1 {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give your first name");
        String firstName = input.next();
        
        System.out.println("Give your last name");
        String lastName = input.next();
        
        System.out.println("Give your father's name");
        String fathersName = input.next();
        
        System.out.println("Giver your  day of birth (xx)");
        int day = input.nextInt();
        System.out.println("Giver your month of birth (xx)");
        int month = input.nextInt();
        System.out.println("Giver your year of birth (xxxx)");
        int year = input.nextInt();
        String birthday = String.format("%d/%d/%d",day,month,year);
        
        PrintWriter writer = new PrintWriter(lastName+"."+firstName+".txt");
        for (int i =1; i<=3; i++){
            switch(i){
                
                case 1: writer.println("Line "+i+": "+lastName+", "+firstName+", "+fathersName);
                break;
                case 2: writer.println("Line "+i+": "+birthday);
                break;
                default: writer.println("Line "+i+": "+"Your age is "+(2017-year));
                writer.close();
                break;
        }
        }
        
    }
    
}
