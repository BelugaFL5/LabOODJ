/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author leehu
 */
public class SuperClass {
     
    protected String data1;
    
    public SuperClass(String data1){
        this.data1 = data1;
    }
    
    // polymorphism concept: same method name but implement differently*/
    public void superClassMsg() {
        System.out.println("This is a super class");
    }
    
    public void superClassMsg(String customMsg) {
        System.out.println("Custom Message is :" + customMsg);
    }
    
    
    public String getData1() {
        return data1;
    }
    }
