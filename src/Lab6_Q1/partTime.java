/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Q1;

import java.util.Date;

/**
 *
 * @author SIOW HAN BIN
 */
public class partTime extends Staff{
    private double hourlyRate;
    private int hoursWorked;
    //Constructor to initialize the partTime object
    
    partTime(String name ,
            String address,
            String phoneNumber,
            String emailAddress,
            String office,
            double hourlyRate,
            Date dateHired, String title, int hoursWorked){
        super(name,address,phoneNumber,emailAddress,office,hourlyRate * hoursWorked,dateHired,title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    //method to calculate earning
    public double calcEarn(){
        return hourlyRate * hoursWorked;
    }
}
