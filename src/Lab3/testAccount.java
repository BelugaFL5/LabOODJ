/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author SIOW HAN BIN
 */
public class testAccount {
    public static void main(String[] args) {
         Account acc1 = new Account(); //object reference
    acc1.setId(100);
    acc1.setBalance(500);
    acc1.setAnnualInterestRate(0.1);
        System.out.println("Account id:"+acc1.getID());
        System.out.println("Account Balance:"+acc1.getBalance());
        System.out.println("");
        System.out.println("Annual interest rate in(%):"+ acc1.getAnnualInterestRate() );
        
        //withdraw
        acc1.withdraw(900);
        
        //deposit
        acc1.deposit(0);
    }
}
