/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab2;



/**
 *
 * @author Hello
 */
import java.util.Scanner;

public class exe3Sample {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter number from 0 to 1000");
    int num = input.nextInt();
    int ld, sum = 0;
    while(num > 0) {
      ld = num % 10;  
      sum += ld;
      num /= 10;
    }
    System.out.println("Sum of digits is: " + sum);

  }

}