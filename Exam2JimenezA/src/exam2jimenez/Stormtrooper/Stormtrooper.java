/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2jimenez.Stormtrooper;
import exam2jimenez.Interfaces.Location;


/**
 *
 * @author lillimj
 */
public abstract class Stormtrooper {
    private String STID;
    private String Rank;
    private String Gender;
    private int ServiceYears;
    private int Height;
    private int weight;
    private String DutyCategory;
    private String DutyStatus;
    private String UnitAssigned; //STUID
    private String Role;


    public Stormtrooper(String STID, String Rank, String Gender, int ServiceYears, int Height, int weight, String DutyCategory, String DutyStatus, String UnitAssigned, String Role) {
        this.STID = STID;
        this.Rank = Rank;
        this.Gender = Gender;
        this.ServiceYears = ServiceYears;
        this.Height = Height;
        this.weight = weight;
        this.DutyCategory = DutyCategory;
        this.DutyStatus = DutyStatus;
        this.UnitAssigned = UnitAssigned;
        this.Role = Role;
      
    }

    public String getSTID() {
        return STID;
    }

    public void setSTID(String STID) {
        this.STID = STID;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getServiceYears() {
        return ServiceYears;
    }

    public void setServiceYears(int ServiceYears) {
        this.ServiceYears = ServiceYears;
    }
    

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDutyCategory() {
        return DutyCategory;
    }

    public void setDutyCategory(String DutyCategory) {
        this.DutyCategory = DutyCategory;
    }

    public String getDutyStatus() {
        return DutyStatus;
    }

    public void setDutyStatus(String DutyStatus) {
        this.DutyStatus = DutyStatus;
    }

    public String getUnitAssigned() {
        return UnitAssigned;
    }

    public void setUnitAssigned(String UnitAssigned) {
        this.UnitAssigned = UnitAssigned;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

 

    public void CurrentPos(Location CurrentPos) {
            
    }

  

    public int Ammunition() {
        int ammo = 700;
        return ammo;
    }

  
    
    public void firesWeapon(){
        
    }
    
    public void moves(){
        
    }
    
    public void communicates(){
        
    }
    
   
    
    
    
}
