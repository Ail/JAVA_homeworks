/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop_2;

/**
 *
 * @author Alekarios
 */
public class bankAccount {
    
    private double balance;
    private String account_number;
    private String customer_name;
    private String email;
    private String phone_number;
    
    public bankAccount(double balance,String account_number,String customer_name,
            String email,String phone_number){
        this.balance = balance;
        this.account_number = account_number;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;  
    }
    public void deposit(double balance){
        this.balance += balance; 
        System.out.println("This balance of "+this.balance+" completed");
    }
    public void withdraw(double withdraw_ammount){
        if (this.balance -withdraw_ammount <= 0){
            System.out.println("Can't proccess");
        }
        else{
            this.balance -= withdraw_ammount;
            System.out.println("The withdraw of "+withdraw_ammount+" completed"+
                    "\n"+"Remainig ammount is: "+this.balance);
        }
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    
    public void setAccountNumber(String account_number){
        this.account_number = account_number;
    }
    public String getAccountNumber(){
        return this.account_number;
    }
    public void setCustomerName(String customer_name){
        this.customer_name = customer_name;
    }
    public String getCustomerName(){
        return this.customer_name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phone_number){
        this.phone_number = phone_number;
    }
    public String getPhoneNumber(){
        return this.phone_number;
    }
    
    
}
