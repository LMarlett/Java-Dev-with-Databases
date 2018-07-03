/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2jimenez.StormtrooperUnit;

import exam2jimenez.Interfaces.Location;
import exam2jimenez.Interfaces.Movement;
import exam2jimenez.Interfaces.ReconnaissanceI;

/**
 *
 * @author lillimj
 */
public class Reconnaissance extends StormtrooperUnit implements Movement, ReconnaissanceI{

    public Reconnaissance(String STUID, String UnitCmd, String UnitType, int AssignedStrength, int Location_X, int Location_Y, int HQ_LocationX, int HQ_LocationY) {
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
     Location a;
        a = (int x, int y) -> {
            x=30; 
            y=45;
        };    }

    @Override
    public void ScoutArea(Location L) {
     Location a;
        a = (int x, int y) -> {
            x=70; 
            y=45;
        };    }

  
    
    
}
