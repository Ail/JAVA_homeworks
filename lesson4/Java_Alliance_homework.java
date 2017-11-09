/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_alliance_homework;

/**
 *
 * @author Alekarios
 */


import java.util.Scanner;
public class Java_Alliance_homework {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your 1st number");
        int num1 = scan.nextInt();
        System.out.println("Type your 2nd number");
        int num2 = scan.nextInt();
        System.out.println("Type your 3rd number");
        int num3 = scan.nextInt();
        
        if (num2 == 3*num1 && num3 > num1 + num2){
          System.out.println("Succesfull combination: "+num1+" "+num2+" "+num3);
        }
        else{
            System.out.println("Try again");
        }
        
       
    }
    
}
