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
public class exe3Loop {
    public static void main(String[] args) {
        //declare
        Scanner x = new Scanner(System.in);
        int num;
        //input
        System.out.println("enter num from 0 to 1000");
     num = Integer.parseInt(x.nextLine());
    
    while(num <0 | num>1000){
        System.out.println("invalid");
        num = Integer.parseInt(x.nextLine());
    }
    //convert into string
String strNum = String.valueOf(num);
int total = 0;
//for loop
for(int k = 0; k < strNum.length();k++){
    total = total + Character.getNumericValue(strNum.charAt(k));
}
        System.out.println("The sum is "+ total);
    }
}
