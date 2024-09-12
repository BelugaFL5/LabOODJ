/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author SIOW HAN BIN
 */


import java.util.Date;

public class Q4 {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // Default constructor
    public Q4() {
        this.annualInterestRate = 0.0;
        this.numberOfYears = 0;
        this.loanAmount = 0.0;
    }

    // Parameterized constructor
    public Q4(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            throw new IllegalArgumentException(
                    "Interest rate, number of years and loan amount must be greater than zero.");
        }
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(); // Capture the current date
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Interest rate must be greater than zero.");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Number of years must be greater than zero.");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // Assume placeholder for calculating monthly payment
    public double monthlyPayment() {
        // Calculation logic goes here
        return 0.0;
    }

    // Assume placeholder for calculating total payment
    public double totalPayment() {
        // Calculation logic goes here
        return 0.0;
    }
}


 