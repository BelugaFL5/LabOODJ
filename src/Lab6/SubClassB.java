/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author leehu
 */
public class SubClassB extends SuperClass{
    private String data3;
    
    public SubClassB(String data1, String data3) {
        super(data1);
        this.data3 = data3;
    }
    
    public void subClassBMsg(){
         System.out.println("Data 3 is "+ super.data1);
        super.superClassMsg();
        super.superClassMsg("Custom Polymorphism method");
    }
    
    
}
