/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author SIOW HAN BIN
 */

public class Account {
    //Declarations
   private int id;//only account class can access
   private double balance;
   private double annualInterestRate;
   
   public Account(){//constructor
       id = 0;
       balance = 0.0;//initialisation
       annualInterestRate =  0.0;
       
   }
   public int getID(){//constructor with datatype need return
       return id;
   }
   public double getBalance(){//we call this as getter
       return balance;
   }
   public double getAnnualInterestRate(){
       return annualInterestRate;
   }
   
   public void setID(int id){
       this.id = id;//to access from local variable
   }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    //additianal Method
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
        
    }
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient Balance lah! Cabai!");
        }else{
            balance -= amount;
            System.out.println("Successful withdrawal");
        }
        System.out.println("Current balance is: "+ balance);
    }
    
    public void deposit(double amount){
        balance += amount;
        System.out.println("Successfully added"+ amount+"into your account!!!");
        System.out.println("Current balance is "+balance);}
}
