/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Alekarios
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class File {
    
    public void writeToFile(String lastName,String firstName,
            String fathersName,String birthday) throws FileNotFoundException{
        
        String line[] = {"Line1","line2","Line3"};
        
        PrintWriter writer = new PrintWriter(lastName+"."+firstName+".txt");
        
        for(int i = 0; i <= 2; i++){
            switch(i){
                case 0:
                    writer.println(line[i]+" :"+lastName+", "+firstName+", "+fathersName);
                    break;
                case 1:
                    writer.println(line[i]+" :"+birthday.substring(0, 2)+
                            "/"+birthday.substring(2, 4)+"/"+birthday.substring(4, 8));
                    break;
                default:
                    writer.println(line[i]+" :"+(2017-Integer.parseInt(birthday.substring(4, 8))));
                    writer.close();
                    break;
                    
            }
            
        }
    }
}
