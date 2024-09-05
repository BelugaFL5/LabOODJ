/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_Q1;

/**
 *
 * @author SIOW HAN BIN
 */
public class Main {
    public static void main(String[] args) {
        MovableCircle mc = new MovableCircle(-5,10,100,200,2);
        System.out.println(mc.toString());
        mc.moveUp();
        mc.moveDown();
        mc.moveLeft();
        mc.moveRight();
    }
}
