/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Alekarios
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        File file = new File();
        System.out.println("Give last name");
        String lastname = input.next();
        System.out.println("Give first name");
        String firstname = input.next();
        System.out.println("Give father's name");
        String fathersname = input.next();
        System.out.println("Give full bithdate like DDMMYYYY");
        String birthdate = input.next();
        
        person.setString(0, lastname);
        person.setString(1, firstname);
        person.setString(2, fathersname);
        person.setString(3, birthdate);
        file.writeToFile(person.getString(0), person.getString(1),
                 person.getString(2), person.getString(3));
        
    }
    
}
