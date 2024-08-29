/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Q1;

/**
 *
 * @author SIOW HAN BIN
 */
public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;
    //initialize person object in constructor
    public Person(
            String name,String address,String phoneNumber,String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    @Override
    public String toString(){
        
        return "Class:" + this.getClass().getSimpleName() + ",Name:" +name;
        
    }
}
