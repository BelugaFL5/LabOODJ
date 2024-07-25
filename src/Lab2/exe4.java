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
public class exe4 {  // More descriptive class name

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Corrected Scanner object creation
        System.out.println("Input your text here for case conversion:");
        String inputString = scanner.nextLine();  // Use nextLine() for entire line

        String convertedString = "";
        for (char character : inputString.toCharArray()) {
            if (Character.isUpperCase(character)) {
                convertedString += Character.toLowerCase(character);
            } else {
                convertedString += Character.toUpperCase(character);
            }
        }
        System.out.println("Converted Text: " + convertedString);
    }
}
