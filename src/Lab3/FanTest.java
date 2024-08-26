/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author leehu
 */
public class FanTest {
    public static void main(String[] args) {
       Fan fan = new Fan();
        System.out.println("Fan 1");
        System.out.println("--------------");
        fan.setColor("RED");
        fan.setOn(true);
        fan.setRadius(5.8);
        fan.setSpeed(1);
        System.out.println(fan.toString());
        
        Fan fan2 = new Fan();
        System.out.println("Fan 2");
        System.out.println("--------------");
        fan2.setColor("BLUE");
        fan2.setOn(true);
        fan2.setRadius(18.8);
        fan2.setSpeed(2);
        System.out.println(fan2.toString());
    }
}
