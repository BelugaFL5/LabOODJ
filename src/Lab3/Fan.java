/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;
//lab3 q2
/**
 *
 * @author SIOW HAN BIN
 */
public class Fan {
    //Constants to represents fan speeds
    //constructor don't have return
  private final int SLOW = 1;  
  private final int MEDIUM = 2;  
  private final int FAST = 3; 
  
  //Attributes of the Fan
  private int speed;
  private boolean on;
  private String color;
  private double radius;

// Constructor to initialize default values
public Fan(){
this.speed = SLOW;
this.on = false;
this.radius = 0.0;
this.color = "";
}

public int getSpeed(){
switch (this.speed){
case 1:
    return SLOW;
case 2:
    return MEDIUM;
case 3:
    return FAST;
default:
    return 0;
}
//return speed
}

public boolean isOn(){
    return on;
}

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
//mutator/setters method
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

  @Override
  public String toString(){
    if(on){
        return "Fan is on(Speed :" +
                this.speed + ",Color:"+
                this.color+ ",Radius:" +
                this.radius + ")";
    }else{
        return "Fan is off (Color:" +
                this.color+
                ",Radius:"
                + this.radius + ")";
    }
}

}