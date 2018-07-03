/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2jimenez.StormtrooperUnit;

import exam2jimenez.Location;
import java.util.ArrayList;

 
/**
 *
 * @author lillimj
 */
public abstract class StormtrooperUnit {

    public static void displayStormtroopers(ArrayList<StormtrooperUnit> StUnitList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String STUID;
    private String UnitCmd;
    private String UnitType;
    private int AssignedStrength;
    private int Location_X;
    private int Location_Y;
    private int HQ_LocationX;
    private int HQ_LocationY;

    public StormtrooperUnit(String STUID, String UnitCmd, String UnitType, int AssignedStrength, int Location_X, int Location_Y, int HQ_LocationX, int HQ_LocationY) {
        this.STUID = STUID;
        this.UnitCmd = UnitCmd;
        this.UnitType = UnitType;
        this.AssignedStrength = AssignedStrength;
        this.Location_X = Location_X;
        this.Location_Y = Location_Y;
        this.HQ_LocationX = HQ_LocationX;
        this.HQ_LocationY = HQ_LocationY;
    }
    
 

    public String getSTUID() {
        return STUID;
    }

    public void setSTUID(String STUID) {
        this.STUID = STUID;
    }

    public String getUnitCmd() {
        return UnitCmd;
    }

    public void setUnitCmd(String UnitCmd) {
        this.UnitCmd = UnitCmd;
    }

    public String getUnitType() {
        return UnitType;
    }

    public void setUnitType(String UnitType) {
        this.UnitType = UnitType;
    }

    public int getAssignedStrength() {
        return AssignedStrength;
    }

    public void setAssignedStrength(int AssignedStrength) {
        this.AssignedStrength = AssignedStrength;
    }

  

 //   public Location getCurrentPos() {
   //     return CurrentPos;
    //}

    public void setCurrentPos(Location CurrentPos) {
            Location CP = new Location(this.Location_X,this.Location_Y);
 
                     CP = CurrentPos;

    }
    
    //  public Location getHeadquarter() {
      //  return Headquarter;
    //}

    public void setHeadquarter(Location Headquarter) {
     
        
      Location HQ = new Location(this.HQ_LocationX,this.HQ_LocationY);
 
                     HQ = Headquarter;

                      
       
        
     }
    

        public void moves(){
            String moveU = "Stormtrooper unit is on the move";
        }
        
        public void communicateWithHQ(){
            String commU = "Stormtrooper unit to HQ";
        }
 
       

}
