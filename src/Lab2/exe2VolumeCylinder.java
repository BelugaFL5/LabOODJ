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
public class exe2VolumeCylinder {
    static final double PI = 3.14;
//step 1 psvm
  public static void main(String[] args) {
 //step 2 declarations
    double radius, length,areaOfCylinder,volumeOfCylinder;
    final double PI = 3.1415926; //constant
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");
    //step 3 input
      System.out.println("Radius calue");
      radius = Double.parseDouble(scan.nextLine());
      System.out.println("Length calue");
      length = Double.parseDouble(scan.nextLine());
      
      //process
      areaOfCylinder = radius * radius * PI;
      volumeOfCylinder = areaOfCylinder * length;
      
      //output
      System.out.println(("area of cylinder:") + df.format(areaOfCylinder));
      System.out.println(("Volumn of cylinder:") + df.format(volumeOfCylinder));
  }
}
