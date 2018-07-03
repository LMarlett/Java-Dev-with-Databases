/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2jimenez;

import exam2jimenez.Stormtrooper.Stormtrooper;
import exam2jimenez.StormtrooperUnit.StormtrooperUnit;
import exam2jimenez.dbConnect.dbConnect;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lillimj
 */
public class Jimenez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        try {
            ArrayList<StormtrooperUnit> StUnitList = dbConnect.StormtrooperUnitFactory(25);
                      
            /* for(Stormtrooper stormtrooper : StList )   { 
            System.out.println(StUnitList);
            }*/ 
        } catch (SQLException ex) {
            Logger.getLogger(Jimenez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jimenez.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        try {
            ArrayList<Stormtrooper> StList = dbConnect.StormtrooperFactory(1000);
           /* for(Stormtrooper stormtrooper : StList )   { 
            System.out.println(StList);
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(Jimenez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jimenez.class.getName()).log(Level.SEVERE, null, ex);
        }
 

        
        
    }
    
}
