/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_factorial;

/**
 *
 * @author Alekarios
 */
import java.util.Scanner;
public class Java_factorial {

    public static void main(String[] args) {
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Give number");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
           factorial *= i; 
        }
        System.out.println("the factorial of "+num+" is: "+factorial);
        
    }
    
}
