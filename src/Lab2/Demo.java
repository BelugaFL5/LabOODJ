/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SIOW HAN BIN
 */
public class Demo {
    public static void main(String[] args) {
        //declarations
        //Step1 step5 declare meters data type
        double feet, meters;
        //step2 Scanner class
        Scanner input = new Scanner(System.in);
        //
        DecimalFormat df = new DecimalFormat("#.##");
        //step3 input
        System.out.println("Please enter a value in feet:");
        feet = Double.parseDouble(input.nextLine());
        
        //Step4 process
        meters = feet * 0.305;
        
        //output
        System.out.println(feet + " feets equals to " + df.format(meters) + " metres");
        // TODO code application logic here
    }
}
