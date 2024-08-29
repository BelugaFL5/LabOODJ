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
public class Employee  {
    private String office;
    private double salary;
    private Date dateHired;
    //Constructor to initialize the employee object
public Employee(String name,String address,String phoneNumber,String emailAddress,String office,double salary,Date dateHired){
    this.office = office;
    this.salary = salary;
    this.dateHired = dateHired;
}
}
