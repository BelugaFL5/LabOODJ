/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9Demo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SIOW HAN BIN
 */
public class Demo1 {
    public static void main(String[] args) {
        
    
  try{  
    //Declare random obj
    Random random = new Random();
    //Declare scanner
//    Scanner sc = new Scanner(System.in);
//    int num;
    //Declare 100 integer numbers
    int nums[] =new int [100];
    
    //random 100 integers num
    for(int i = 0; i < nums.length; i++){
        nums[i] = random.nextInt(nums.length);
            System.out.println("#"+(i+1)+":"+nums[i]);
    }
    
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index Out of bound");
    }catch(NumberFormatException e){
            System.out.println("You stubid");
    }
}
}