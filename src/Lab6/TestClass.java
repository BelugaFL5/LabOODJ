/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author leehu
 */
public class TestClass {
    public static void main(String[] args) {
        SubClassA subA = new SubClassA("data A1" , "data A2");
        System.out.println("THIS IS SUBCLASS OBJECT");
        System.out.println("--------------------------");
        subA.subClassAMsg();
        
        System.out.println("--------------------------");
        System.out.println("THIS IS SUBCLASS OBJECT");
        System.out.println("--------------------------");
        SubClassB subB = new SubClassB("Data B1","Data B2");
        subB.subClassBMsg();
    }
    
    
}
