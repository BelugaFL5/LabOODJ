/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SIOW HAN BIN
 */
public class Q2 {

    public static void main(String[] args) {
        try {
            String filename = "scores.txt";
            double total = 0, average = 0;
            int count = 0;

            //use scanner to read
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            //read each line from file
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(","); //split the line

                for (int i = 0; i < parts.length; i++) {
                    String part = parts[i];
                    try {
                        double score = Double.parseDouble(part);
                        total += score;
                        count++;
                        average = total / count;
                    } catch (NumberFormatException e) {
                        System.out.println("Error" + e.getMessage());
                    }
                }
            }
            System.out.println("Total Average:" + total);
            System.out.println("average score:" + average);

            //close the scanner
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            System.out.println("This error is for number format exception");
        }//end of finally
    }//en of main method
}//end of class