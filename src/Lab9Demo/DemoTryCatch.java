/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9Demo;

import java.util.Scanner;

/**
 *
 * @author SIOW HAN BIN
 */
public class DemoTryCatch {
    public static void main(String[] args) {
        try{
           int num1,num2,product;
           Scanner scan = new Scanner(System.in);
           
           //input
            System.out.println("Enter a number for num1:");
            num1 = Integer.parseInt(scan.nextLine());
            System.out.println("Enter a number for num2:");
            num2 = Integer.parseInt(scan.nextLine());
            product = num1/num2;
            System.out.println(num1 + " divide "+num2 +" = "+product);
        }catch(ArithmeticException e){
            System.out.println("You stubid");
        }
    }
}
