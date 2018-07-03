/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2jimenez.StormtrooperUnit;

import exam2jimenez.Location;
import exam2jimenez.Interfaces.Movement;
import exam2jimenez.Interfaces.Report;

/**
 *
 * @author lillimj
 */
public class AsItInfantry extends StormtrooperUnit implements Movement, Report {

    public AsItInfantry(String STUID, String UnitCmd, String UnitType, int AssignedStrength, int Location_X, int Location_Y, int HQ_LocationX, int HQ_LocationY) {
        super(STUID, UnitCmd, UnitType, AssignedStrength, Location_X, Location_Y, HQ_LocationX, HQ_LocationY);
    }

 
   

       @Override
    public void MoveLeft() {
            String ml = "This unit moving left";
    }

    @Override
    public void MoveRight() {
            String mr = "This unit moving right";
    }

    @Override
    public void MoveFoward() {
            String mf = "This unit moving foward";
    }

    @Override
    public void MoveBackward() {
            String mb = "This unit moving backward";
    }

    @Override
    public void MoveTo(Location L) {
    Location L1 = new Location(4,5);
               System.out.println("Unit is at location" + L1.toString());

    }

    @Override
    public void ReportToHQ(String msg) {
            String message = "this unit reporting to Head Quarters";
    }

  
    
}
