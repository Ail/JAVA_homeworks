/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_array;

/**
 *
 * @author Alekarios
 */
public class Java_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][][] = new int[3][3][3];
        
        for (int i = 0; i<=2; i++){
            for (int j = 0; j <=2; j++){
                for (int k = 0; k <= 2; k++){
                    
                    a[i][j][k] = i+j+k;
                
                
                 
                System.out.println("["+i+"]"+"["+j+"]"+"["+k+"]: "+a[i][j][k]);
            }
            
        }
        
       
                
    }
    
}
}
