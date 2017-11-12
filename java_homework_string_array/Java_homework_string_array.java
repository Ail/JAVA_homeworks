/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_homework_string_array;

/**
 *
 * @author Alekarios
 */
public class Java_homework_string_array {

    public static void main(String[] args) {
       String values[] = {"cat","dog","pig","bear","bird","parrot","rabbit"};
       for (String items:values){
           //method1
           if(items.substring(0,1).equals("p")){
           //method2
           //if(items.startsWith("p")){
               System.out.println(items);
                       
           }
           
       }
    }
}
