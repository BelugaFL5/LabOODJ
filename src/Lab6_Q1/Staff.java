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
public class Staff extends Employee {
    private String title;
    
      //Constructor to initialize the employee object
    public Staff(String name ,String address,String phoneNumber,String emailAddress,String office,double salary,Date dateHired,String title){
    super (name,address,phoneNumber,emailAddress,office,salary,dateHired);
        this.title = title;
}
    //override toString to provide a string representation of the Staff
    @Override
    public String toString(){
        //super.toString() calling from person
        return super.toString()+ "Title:" +title;
}
}