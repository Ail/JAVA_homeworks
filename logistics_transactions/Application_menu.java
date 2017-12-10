/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afdemp_project_main;

import java.sql.SQLException;

/**
 *
 * @author Alekarios
 */
import java.util.Scanner;
public class Application_menu extends Login_Screen {

  
   

   //check the login mod and print it
    public void Screen() throws ClassNotFoundException, SQLException{
            
            if(super.getModeAdmin() == true){
               
                System.out.println("\n"+"1.View admin internal bank account"
                +"\t"+"2.View Members accounts"+"\n"
                +"\n"+"3.Deposit to Members bank account"+"         "
                +"\t"+"4.Withdraw from Members "
                        + "\n"+"\n"+"5.Send Transaction To LogFile"
                        + "\t"+"\t"+"\t"+"\t"+"\t"+"6.Exit");
            }
            else{
                System.out.println("\n"+"1.View bank account"
                        +"\t"+"\t"+"\t"+"\t"+"\t"+"2.Deposit to Cooperatives internal bank account"
                        +"\n"+"\n"+"3.Deposit to another Members bank account"
                        +"\t"+"\t"+"4.Send Transaction To LogFile"
                        +"\n"+"\n"+"5.Exit");
            }
    
        }
 
    
 
}
    

