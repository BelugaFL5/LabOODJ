/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author 
 */


public class learn_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        /*
        data type
        int
        float
        double
        
        non numeric data type
        char
        string
        boolean
        */
        int age;
        String name;
        String hobby;
        boolean ageStatus = false;
        float height;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your age:") ;
        age = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter your name:") ;
        name = scan.nextLine();
        
        System.out.println("Enter your hobby:") ;
        hobby = scan.nextLine();
        
        System.out.println("Enter your height:") ;
        height = Float.parseFloat(scan.nextLine());
        
        System.out.println("BIO INFO \n");
        System.out.println("age is:" + age +
                "\nName is:" + name +
                "\nHobby is:" + hobby+
                "\nHeight is(in m):" + height
        );
        
    
        
    }}
    

