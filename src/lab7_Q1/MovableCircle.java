/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_Q1;

/**
 *
 * @author SIOW HAN BIN
 */
public class MovableCircle {
    private int radius;
    private MovablePoint center; //center is object of MovablePoint
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius //parameter
    ){
    center = new MovablePoint(x,y,xSpeed,ySpeed); //link centre object to constructor
    //we did not do MovablePoint center = new MovablePoint(x,y,xSpeed,ySpeed) because
    this.radius = radius;
    }
    public String toString(){
        return "Radius:" + this.radius +"\n"
                +"x value"+ center.x +"\n"
                +"y value:"+center.y+"\n"
                +"xSpeed value" + center.xSpeed+"\n"
                +"ySpeed value" + center.ySpeed ;
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}
