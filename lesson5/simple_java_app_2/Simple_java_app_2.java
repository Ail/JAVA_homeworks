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
import java.util.Scanner;

public class Simple_java_app_2 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        
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
        
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setFatherName(fathersName);
        person.setBirthday(day, month, year);
        person.WriteString(year);
        
        
        
    }
    
}
