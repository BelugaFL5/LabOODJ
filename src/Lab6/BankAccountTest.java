/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author SIOW HAN BIN
 */
public class BankAccountTest {
     public static void main(String[] args) {
        //to instatiate the account object
        Account acc = new Account();
        Scanner scan = new Scanner(System.in);
        double amount;
        
        //to set the value
        acc.setId(100);
        acc.setBalance(300.00);
        acc.setAnnualInterestRate(0.12);
        
        //withdraw process
        System.out.println("Enter the amount(in RM):");
        amount = Double.parseDouble(scan.nextLine());
        acc.withdraw(amount);
        
        //deposit process
        System.out.println("Enter the amount(in RM):");
        amount = Double.parseDouble(scan.nextLine());
        acc.deposit(amount);
    }
}
