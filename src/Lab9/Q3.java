/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SIOW HAN BIN
 */
public class Q3 {
    public static void main(String[] args) {
        String filename = "ints.txt";
        int[] numbers = new int[100]; //initialize an array that can store 100 integers
        
        //write 100 random num
        
        try{
            FileWriter fw = new FileWriter(filename);
            Random random = new Random();
            for (int i = 0;i<100;i++){
                int randomInt = random.nextInt(100); //rnadom num from 0 to 99
                fw.write(randomInt + ",");
                
            }
            //close filewriter
            fw.close();
        }catch (IOException e){
            System.out.println("Error occur while writing file"+e.getMessage());
        }
        
        //Read integers back from the file
        try{
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);
            int i=0;
            while (scan.hasNextInt()){
                numbers[i++]= scan.nextInt();
            }
            scan.close();
        }catch(IOException e){
            System.out.println("Error occur while reading the file :" + e.getMessage());
            }
        
        
        //sort the numbers with simple bubble sort
        for(int i=0 ; i<numbers.length - 1;i++){
            for (int j = 0; j<numbers.length -1 -i;j++){
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
            }
        }
        }
        
        
        
        
                //Display the sorted numbers
                System.out.println("sorted numbers:");
                for (int k = 0; k<numbers.length;k++){
                    System.out.println(numbers[k]);
                }
        }
    }

