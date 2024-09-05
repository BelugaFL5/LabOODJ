/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_Q1;

/**
 *
 * @author SIOW HAN BIN
 */
public class MovablePoint implements Movable {
    int x,y,xSpeed,ySpeed;
    
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        //need getter for these
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getXSpeed(){
        return xSpeed;
    }
    public int getYSpeed(){
        return ySpeed;
    }
    @Override
    public void moveUp(){
        System.out.println(" moving up");
    }
    @Override
    public void moveDown(){
        System.out.println(" moving up");
    }
    @Override
    public void moveLeft(){
        System.out.println("moving up");
    }
    @Override
    public void moveRight(){
        System.out.println("moving up");
    }
    @Override
    public String toString(){
        return "This is a movable point class";
    }
}
