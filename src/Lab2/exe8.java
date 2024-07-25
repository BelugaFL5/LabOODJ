/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author SIOW HAN BIN
 */
public class exe8 {
  public static void main(String[] args) {
        double[] numbers = new double[100]; // Array capacity is 100

        Scanner scanner = new Scanner(System.in);

        // Accept user input to populate the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0;

        // Sum up all the values using the enhanced for-loop
        for (double number : numbers) {
            sum += number;
        }

        System.out.println("Sum of all values: " + sum);
    }  
}
