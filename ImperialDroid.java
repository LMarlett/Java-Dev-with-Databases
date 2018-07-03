/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimenez.examc1;

import java.util.ArrayList;

/**
 *
 * @author class
 */
public class ImperialDroid {

    private String DroidID;
    private String manufacturer;
    private String serialNumber;
    private String missionRole;
    private boolean armored;
    private int height;
   private int weight;
   private ArrayList<String> battleKit;
   public static int DroidCount = 0;

    public ImperialDroid() {
        this.DroidID = DroidID;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.missionRole = missionRole;
        this.armored = armored;
        this.height = height;
        this.weight = weight;
        this.battleKit = battleKit;
        DroidCount++;
    }
    public ImperialDroid(String DroidID, String manufacturer) {
        this.DroidID = DroidID;
        this.manufacturer = manufacturer;
        this.serialNumber = ((this.manufacturer).substring(0,3))+ Integer.toString(this.DroidCount); 
                //int n = 8;
                //String s = "Hello, World!";
                //System.out.println(s.substring(0,n);
                
                
        this.missionRole = "Communication";
        this.armored = true;
        this.height = 98;
        this.weight = 350;
        this.battleKit =  new ArrayList<String>();
         battleKit.add("radio");
          battleKit.add("GPS");
          battleKit.add("Satellite Reciever");
        DroidCount++;
    }
    
    public ImperialDroid(String DroidID, String manufacturer, String missionRole) {
        this.DroidID = DroidID;
        this.manufacturer = manufacturer;
      // this.serialNumber = (this.manufacturer.substring(0,3))+ (Integer.toString(this.DroidCount)); 
       this.serialNumber = (this.manufacturer.substring(0,3))+ (Integer.toString(this.DroidCount)); 
       // this.missionRole
       if (missionRole.equalsIgnoreCase("Communication")|| missionRole.equalsIgnoreCase("Pilot")  ){
           this.missionRole = missionRole;
        
       }
       else {
           this.missionRole = "Communication";
       }
       if (missionRole.equalsIgnoreCase("Communication")){
           this.armored = true;
        this.height =90;
        this.weight = 350; 
        this.battleKit =  new ArrayList<String>();
         battleKit.add("radio");
          battleKit.add("GPS");
          battleKit.add("Satellite Reciever");
       }
       else {
            this.armored = false;
        this.height = 98;
        this.weight = 300;
        this.battleKit =  new ArrayList<String>();
         battleKit.add("parachute");
        
       }
       
        
        DroidCount++;
    }

    
    
    
    public String getDroidID() {
        return DroidID;
    }

    public void setDroidID(String DroidID) {
        this.DroidID = DroidID;
    }

    public String getMaufacturer() {
        return manufacturer;
    }

    public void setMaufacturer(String maufacturer) {
        this.manufacturer = maufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMissionRole() {
        return missionRole;
    }

    public void setMissionRole(String missionRole) {
        this.missionRole = missionRole;
    }

    public boolean isArmored() {
        return armored;
    }

    public void setArmored(boolean armored) {
        this.armored = armored;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<String> getBattleKit() {
        return battleKit;
    }

    public void setBattleKit(ArrayList<String> battleKit) {
        this.battleKit = battleKit;
    }

    public static int getDroidCount() {
        return DroidCount;
    }

    public static void setDroidCount(int DroidCount) {
        ImperialDroid.DroidCount = DroidCount;
    }
    
    
   
    //////////////////////////////////////////////
    //methods
    public void displayInfo(){
        System.out.println("__________________");
        System.out.println("Imperial Droid");
        System.out.println("Droid ID " + this.DroidID);
        System.out.println("Serial Number " + this.serialNumber);
        System.out.println("Manufacturer " + this.manufacturer);
        System.out.println("Mission Role " + this.missionRole);
        System.out.println("Is Armoured " + this.armored);
        System.out.println("Height " + (double)this.height);
        System.out.println("Weight " + (double)this.weight);
    }
    
    public int encodeMessage(String msg){
        int length = msg.length();
        return length;
    }
    
    public void displayBattleKit(){
         for(int i = 0; i<battleKit.size(); i++){
            System.out.println("ITEM: " + (i+1) + " " + battleKit.get(i));
        }
        
    }
    
    public static void dropArmor(ImperialDroid d){
       
       d.armored = false;
       if (d.armored == false ){
           d.weight = (int)((double)d.weight - ((double)d.weight * .1));
       }
    }
    
    
    
    
    
    
    
    ///////////////////////////////////////////////////////
    public static void main(String[] args) {
        // TODO code application logic here
 
        // Stormtroopera ST1 = new Stormtroopera
        ImperialDroid ID1 = new ImperialDroid("DX-01", "Rash42", "Communication");
        ImperialDroid ID2 = new ImperialDroid("DX-02", "Styx23", "Pilot");

        System.out.println("__________________");
        ID1.displayInfo();
        ID2.displayInfo();
            
        System.out.println("__________________");
        int message = ID2.encodeMessage("Hello Professor Locklear");
         System.out.println(message);
         
        System.out.println("__________________");
        ID1.displayBattleKit();
        System.out.println("__________________");
        dropArmor(ID1);
        System.out.println("__________________");
        ID1.displayInfo();
    }
    
}
