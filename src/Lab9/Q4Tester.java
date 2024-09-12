/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author SIOW HAN BIN
 */


public class Q4Tester {
    public static void main(String[] args) {
        try {
            Q4 loan = new Q4(1.0, 1, 1.0); 
            loan.setNumberOfYears(0);
            System.out.println("Loan Date:"+loan.getLoanDate());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }
}
