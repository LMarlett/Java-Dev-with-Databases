/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimenezfinalexam;

/**
 *
 * @author lillimj
 */
public class Location {
    
    private int xCoord;
    private int yCoord;

    public Location(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public String toString() {
        String s = "";
        s = "[" + this.xCoord + " " + this.yCoord + "]";
        return s;
    }   
    public static void EuclideanDistance(Location L1, Location L2){
  
        double deltaX = L1.xCoord - L2.xCoord;
      double deltaY = L2.yCoord - L2.yCoord;       
      
      double x=deltaX*deltaX;
      double y = deltaY*deltaY;
      
      double d = (x+y);
      
      double D = Math.sqrt(d);
      // double 2D = (Math.sqrt());
    }
}