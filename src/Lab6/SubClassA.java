/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author leehu
 */
public class SubClassA extends SuperClass{
    private String data2;
    
    public SubClassA(String data1, String data2) {
        super(data1);
        this.data2 = data2;
    }
    
    public void subClassAMsg(){
        System.out.println("Data 1 is "+ super.data1);
        super.superClassMsg();
        super.superClassMsg("Custom Polymorphism method");
    }
}
