/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Q1;

/**
 *
 * @author SIOW HAN BIN
 */
public class Student extends Person{
    //Enum for student status
    public enum Status{
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }
    private Status status;
    //constructure to initilize student object
    
    public Student(String name,String address,String phoneNumber,String emailAddress,Status status){
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }
}
