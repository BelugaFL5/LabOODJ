/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author SIOW HAN BIN
 */
public class Account {

    //attributes
    private int id;
    private double balance;
    private double annualInterestRate;
    //constructor method
    public Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }
    //accessor or getters methods
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    //mutator or setters methods
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //additional methods
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public void withdraw(double amount){
        System.out.println("The amount is "+amount);
        //condition
        if(amount > balance){
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("The current balance is "+ balance);
        }
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("The current balance is "+ balance);

    }
}

