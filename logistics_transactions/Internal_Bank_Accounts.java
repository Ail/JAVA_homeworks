/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afdemp_project_main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Alekarios
 */
public class Internal_Bank_Accounts extends File_Access {
   
    private static double DepositToMember; 
    private static double WithdrawFromMember;
    private static double DepositAmountToUser;
    private static double DepositAmountToAdmin;
    private static String DepostitToUser;
    private static String WithdrawFromUser;
    private static String DepositFromMemberToMember;
    private static boolean Flag_Admin1 = false;
    private static boolean Flag_Admin2 = false;
    private static boolean Flag_User1 = false;
    private static boolean Flag_User2 = false;
    private StringBuffer Buffer = new StringBuffer();
    private StringBuffer Buffer1 = new StringBuffer();
   
       //check choices of admin
    public  void adminChoice() throws SQLException, ClassNotFoundException, IOException{
        
        while(super.getModeAdmin()){
         System.out.println("Enter operation:");
         int ChoiceModeAdmin = input.nextInt();
         super.adminAccount();
         switch(ChoiceModeAdmin){
             //print out admin's account data
             case 1:
                 
                 System.out.println("\n"+"Last update: "
                         +super.getTransactionDateAdmin()+" Ammount: "
                                 +super.getAmmountAdmin()+"\n");
                 break;
             //print out simple user's names    
             case 2:
                 
                 availableSimpleUsers() ;
                 System.out.println("choose user's account");
                 String choiceUser = input.next();
                 if(super.getSimpleUsers().contains(choiceUser)){
                     
                    super.simpleUserAccount(choiceUser);
                    System.out.println("\n"+"Last update: "
                         +super.getTransactionDateUser()+" Ammount: "
                                 +super.getAmountUser()+"\n"); 
                 }
                 else{
                     System.out.println("incorrect user");
                 }
                 break;
                //choosing users to deposit money
             case 3:
                 
                 this.Flag_Admin1 = true;
                 availableSimpleUsers();
                 System.out.println("choose user's account you want to deposit money");
                 this.DepostitToUser = input.next();
                 if(super.getSimpleUsers().contains(DepostitToUser)){
                    System.out.println("Give amount of money you want to deposit");
                    this.DepositToMember = input.nextFloat();
                    super.adminAccount();//execute query to database
                    
                    if(DepositToMember <= Double.parseDouble(super.getAmmountAdmin())){//checks if there ara enough money to account
                        super.depositAdminToSimpleUser(super.getSimpleUsers().indexOf(DepostitToUser)+1,DepositToMember);//deposit to simple users
                        Buffer.append(toString()+"\r\n");
                        this.Flag_Admin1 = false;
                        
                    }
                    else{
                        System.out.println("not enough money");
                    }
                 }
                 else{
                    System.out.println("incorrect user");
                 }
                 
                 break;
                //withdraw money from simple users 
             case 4:
                
                 this.Flag_Admin2 = true;
                 availableSimpleUsers();
                 System.out.println("choose user's account you want to withdraw money");
                 this.WithdrawFromUser = input.next();
                 if(super.getSimpleUsers().contains(WithdrawFromUser)){//check if username exists in list
                     System.out.println("Give amount of money you want to withdraw");
                     this.WithdrawFromMember = input.nextDouble();
                     
                     super.simpleUserAccount(WithdrawFromUser);//execute query to database
                     if(this.WithdrawFromMember <= Double.parseDouble(super.getAmountUser())){
                         super.withdrawAdminFromSimpleUser
                        (super.getSimpleUsers().indexOf(WithdrawFromUser)+1, this.WithdrawFromMember); 
                          Buffer.append(toString()+"\r\n");
                          this.Flag_Admin2 = false;
                          
                         
                     }
                     else{
                         System.out.println("Account doesn't have enough money");
                     }
                 }
                 else{
                     System.out.println("incorrect user");
                 }
                 
                 break;
                 
             case 5:
                 
                 super.writeToFile(super.getUserLogIn(),Buffer.toString());
                 break;
                 
             case 6:
                 clear();
                 break;
                 
             default:
                 System.out.println("Invalid operation");
                 break;
         }
        }
    }
    
    //check choices of user
    public void userChoice() throws SQLException, ClassNotFoundException, IOException{
        while(super.getModeUser()){
         System.out.println("Enter operation:");
         int ChoiceModeUser = input.nextInt();
         super.simpleUserAccount(super.getUserLogIn());
         switch(ChoiceModeUser){
             case 1:
                 super.simpleUserAccount(super.getUserLogIn());//execetu query to database
                 System.out.println("\n"+"Last update: "
                         +super.getTransactionDateUser()+" Ammount: "
                                 +super.getAmountUser()+"\n");
                 break;
             case 2:
                 this.Flag_User1 = true;
                 System.out.println("Enter amount of money you want to deposit to admin");
                 this.DepositAmountToAdmin = input.nextDouble();
                 super.simpleUserAccount(super.getUserLogIn());
                 if(this.DepositAmountToAdmin <= Double.parseDouble(super.getAmountUser())){
                     super.depositToAdmin
                    (this.DepositAmountToAdmin,super.getSimpleUsers().indexOf(super.getUserLogIn())+1);//update user's account
                     Buffer1.append(toString()+"\r\n");
                     this.Flag_User1 = false;
                 }
                 else{
                     System.out.println("not enough money");
                 }
                 break;
             case 3:
                 this.Flag_User2 = true;
                 availableSimpleUsers();
                 System.out.println("Select user you want to deposit money");
                 this.DepositFromMemberToMember = input.next();
                 if(super.getSimpleUsers().contains(DepositFromMemberToMember)){
                     
                    System.out.println("Enter amount of deposit");
                    this.DepositAmountToUser = input.nextDouble();
                     super.simpleUserAccount(super.getUserLogIn());//execute query to database
                     
                    if(this.DepositAmountToUser <= Double.parseDouble(super.getAmountUser())){//check if there are enough money in account
                        
                    super.depositMemberToMember(this.DepositAmountToUser,
                         super.getSimpleUsersB().indexOf(DepositFromMemberToMember)+1,
                         super.getSimpleUsersB().indexOf(super.getUserLogIn())+1);
                         Buffer1.append(toString()+"\r\n");
                         this.Flag_User2 = false;
                    }
                    else{
                        System.out.println("not enough money");
                    }
                 }
                 else{
                     System.out.println("incorrect user");
                 }
                 break;
             case 4:
                 
                 super.writeToFile(super.getUserLogIn(),Buffer1.toString());
                 break;
             case 5:
               clear();
                 break;
                 
             default:
                 System.out.println("Invalid operation");
                 break;
            
        }
    }
  

    }
    //print out all the simple users from database 
    public void availableSimpleUsers(){
    if(super.getUserLogIn().equals("admin")){
        
     for(int i = 0;i <= super.getSimpleUsers().size()-1; i++){
                      System.out.println((i+1)+
                              "."+super.getSimpleUsers().get(i));
     }
    }
    else{
        int userPos = super.getSimpleUsers().indexOf(super.getUserLogIn());
        super.getSimpleUsers().remove(userPos);
        for(int i = 0;i <= super.getSimpleUsers().size()-1; i++){
                      System.out.println((i+1)+
                              "."+super.getSimpleUsers().get(i));
                   
     }
        super.getSimpleUsers().add(userPos, super.getUserLogIn());
        
    }
    }
    
    @Override
    public String toString(){
        
        if(super.getModeAdmin() == true && this.Flag_Admin1 == true) {
            try {
                super.adminAccount();
            } catch (SQLException ex) {
                Logger.getLogger(Internal_Bank_Accounts.class.getName()).log(Level.SEVERE, null, ex);
            }
            return  "\n"+"Username: "+super.getUserLogIn()+"\n"+
                    "\t"+"\t"+"Deposit: "+this.DepositToMember+"\u20ac"+
                    " TO "+this.DepostitToUser+
                   "\t"+"\t"+"Transaction Date: "+super.getTransactionDateAdmin()+
                   "\t"+"\t"+"Current Balance: "+super.getAmmountAdmin()+"\u20ac";
            
        }
        else if(super.getModeAdmin() == true && this.Flag_Admin2 == true){
            try {
                super.adminAccount();
            } catch (SQLException ex) {
                Logger.getLogger(Internal_Bank_Accounts.class.getName()).log(Level.SEVERE, null, ex);
            }
            return "\n"+"Username: "+super.getUserLogIn()+"\n"+
                    "\t"+"\t"+"Withdraw : "+this.WithdrawFromMember+"\u20ac"+
                    " FROM "+this.WithdrawFromUser+
                   "\t"+"\t"+"Transaction Date: "+super.getTransactionDateAdmin()+
                   "\t"+"\t"+"Current Balance: "+super.getAmmountAdmin()+"\u20ac";
        }
        else if (super.getModeUser() == true && this.Flag_User1){
            try {
                super.simpleUserAccount(super.getUserLogIn());
            } catch (SQLException ex) {
                Logger.getLogger(Internal_Bank_Accounts.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            return "\n"+"Username: "+super.getUserLogIn()+"\n"+
                    "\t"+"\t"+"Deposit: "+this.DepositAmountToAdmin+"\u20ac"+
                    " TO "+"Admin"+
                   "\t"+"\t"+"Transaction Date: "+super.getTransactionDateUser()+
                   "\t"+"\t"+"Current Balance: "+super.getAmountUser()+"\u20ac";
        }
        else if(super.getModeUser() == true && this.Flag_User2){
            try {
                super.simpleUserAccount(super.getUserLogIn());
            } catch (SQLException ex) {
                Logger.getLogger(Internal_Bank_Accounts.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            return "\n"+"Username: "+super.getUserLogIn()+"\n"+
                    "\t"+"\t"+"Deposit: "+this.DepositAmountToUser+"\u20ac"+
                    " TO "+this.DepositFromMemberToMember+
                   "\t"+"\t"+"Transaction Date: "+super.getTransactionDateUser()+
                   "\t"+"\t"+"Current Balance: "+super.getAmountUser()+"\u20ac";
        }
        else{
            return "Failed to get data";
        }

  
}
    public void clear() throws ClassNotFoundException, SQLException{
        for(int i = 0; i < 500; i++) {
	           System.out.println();
                   
    }
        super.Screen();
    }
    
        
     
}
