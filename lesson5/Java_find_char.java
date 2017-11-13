/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_find_char;

/**
 *
 * @author Alekarios
 */
public class Java_find_char {

    public static void main(String[] args) {
        
        String value = "10hel10lo10";
        findChar(value);
        
    }
    
    public static void findChar(String value){
        
        int x = value.length()-1;
        int y =0;
        do{
          if(value.charAt(x) == 'l'){
              System.out.println(x);
              break;
          }
             
          
              x --;
          
       }
       
       while(y<x);
    
}
}
