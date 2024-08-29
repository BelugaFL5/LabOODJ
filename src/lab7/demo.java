/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author SIOW HAN BIN
 */
public class demo implements MyInterface{
    private int num1;
    private int num2;
    public demo(int num, int num2){
        this.num1 = num1;
        this.num2 = num2;
        
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    
    
    @Override
    public int sum(){
        return this.num1 + this.num2;
    }
 

    @Override
    public int division() {
        return this.num1/this.num2;
        }

    @Override
    public int multiply() {
        return this.num1*this.num2;
    }

    @Override
    public int substract() {
        return this.num1 - this.num2;
       }
}
