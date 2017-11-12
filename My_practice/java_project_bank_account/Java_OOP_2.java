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
public class Java_oop_2 {

    public static void main(String[] args) {
        
        bankAccount eurobank = new bankAccount(1000,"eurobank123","bob",
        "bob@hotmail.com","210677787");
        System.out.println(eurobank.getCustomerName());
        System.out.println(eurobank.getAccountNumber());
        System.out.println(eurobank.getPhoneNumber());
        System.out.println(eurobank.getEmail());
        System.out.println(eurobank.getBalance());
        eurobank.deposit(1000);
        eurobank.withdraw(900);
        
    }
    
}
