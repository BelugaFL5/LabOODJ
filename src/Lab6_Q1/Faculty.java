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
public class Faculty extends Employee{
    private String officeHours;
    private String rank;
    
    public Faculty(String name ,
            String address,
            String phoneNumber,
            String emailAddress,
            String office,
            double salary,
            Date dateHired, String officeHours, String rank){
    super(name,address,phoneNumber,emailAddress,office,salary,dateHired);
    this.officeHours = officeHours;
    this.rank = rank;
      
    }
}
