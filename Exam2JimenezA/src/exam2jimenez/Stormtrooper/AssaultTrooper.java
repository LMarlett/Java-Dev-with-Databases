/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2jimenez.Stormtrooper;

import exam2jimenez.Interfaces.Assault;
import exam2jimenez.Interfaces.Movement;
import exam2jimenez.Interfaces.Tactical;
  import exam2jimenez.Interfaces.Location;

/**
 *
 * @author lillimj
 */
public class AssaultTrooper extends Stormtrooper implements Movement, Assault, Tactical {

    public AssaultTrooper(String STID, String Rank, String Gender, int ServiceYears, int Height, int weight, String DutyCategory, String DutyStatus, String UnitAssigned, String Role) {
        super(STID, Rank, Gender, ServiceYears, Height, weight, DutyCategory, DutyStatus, UnitAssigned, Role);
    }

     

    

   
 

    @Override
    public void usesFlameWeapon(String tgt) {
        String tgtI = "I am using the Flame Thrower";
        //delete this and write the code - Ex"im moving left"
     }

    @Override
    public void setsDemolitionCharge(String chg) {
        String charge = "This trooper has set Demolition charge";
    }

    @Override
    public void firesWeapon(String tgt) {
        String fire = "this trooper is firing his weapon";
                }

    @Override
    public void reconsPosition(Location L) {
   Location a;
        a = (int x, int y) -> {
            x=80; 
            y=45;
        };     }

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
            x=80; 
            y=45;
        }; 
                      }
}