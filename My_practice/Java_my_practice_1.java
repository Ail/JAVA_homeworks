/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_online_course_example4;

/**
 *
 * @author Alekarios
 */
import java.util.Scanner;
public class Java_online_course_example4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give players name: ");
        String name = input.next();
        System.out.println("Give players goals");
        int goals = input.nextInt();
        int score = calculateHighScorePosition(goals);
        displayHighScorePosition(name,score);    
        
    }
    
    
    
    public static void displayHighScorePosition(String name,int position){
        System.out.println("The players name is: "+name+"\n"+
                "his position is: "+position);
        
        
    }
    public static int calculateHighScorePosition(int score){
        
        if (score >= 100){
            int position = 1;
            return position;
        }
        else if(score <100 && score >= 50){
            int position = 2;
            return position;
        }
        else if(score < 50 && score >= 20){
            int position = 3;
            return position;
        }
        else{
            int position = 4;
            return position;
        }
        
        
    }
    
}
