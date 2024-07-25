/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author Hello
 */
public class exe1TempConv {
    //step1 psvm
   public static void main(String[] args){
       //step 2 declarations & input
       Scanner input = new Scanner(System.in);
       float Fahren = input.nextFloat();
       //prompt
       System.out.println("Please enter temperature in Fahrenheit");
       
       
       //process
       float Cel = (Fahren - 32) * 5/9;
       System.out.println("The temperature in degrees Celsius is " + Cel);
       
   }
         
}