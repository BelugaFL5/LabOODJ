/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author SIOW HAN BIN
 */
public class exe8EnhancedFor {
    public static void main(String[] args) {
        //declare array
        //int size=100
        double values[] = new double[100];
        Random lj = new Random();//random number
        DecimalFormat df = new DecimalFormat("#.##");
        double sam = 0.0;
        int ai = 1;
        
        for(double num:values){//for enhanced loop
            num = lj.nextDouble(values.length);
            System.out.println("#"+ ai + ":"+df.format(num));
            sam += num;
            ai++;
        }
        System.out.println("The total sum for "+values.length +" is "+ df.format(sam));
    }
}
