package GUISupport;

import DBSupport.ImperialUnitFactory;
import ImperialUnits.ImperialBattleGroup;
import ImperialUnits.ImperialWalkerUnit;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImperialUnitDisplayApp {
    
    public static void ImperialUnitCreationApp(){
        JFrame jfrm = new JFrame("Imperial Unit Creator");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(400,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton jbtnBtl = new JButton("Battle Groups");
        JButton jbtnWlk = new JButton("Walker Units");
        jfrm.getContentPane().add(jbtnBtl);
        jfrm.getContentPane().add(jbtnWlk);
                
        jfrm.setVisible(true);
        
        jbtnBtl.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    ArrayList<String> midn = new ArrayList<>();
                    midn.add("ST11");
                    midn.add("ST110");
                    midn.add("ST114");
                    midn.add("ST121");
                    midn.add("ST123");
                    
                    ArrayList<ImperialBattleGroup> B = ImperialUnitFactory.createBattleGroup(midn);
                    ImperialUnitFactory.displayImperialBattleGroup(B);
                } catch (SQLException ex) {
                    Logger.getLogger(ImperialUnitDisplayApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ImperialUnitDisplayApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); //END ACTIONLISTENER CONNECT
        
        jbtnWlk.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    ArrayList<String> fidn = new ArrayList<>();
                    fidn.add("ST151");
                    fidn.add("ST152");
                    fidn.add("ST163");
                    fidn.add("ST168");
                    fidn.add("ST174");
                    
                    ArrayList<ImperialWalkerUnit> W = ImperialUnitFactory.createWalkerUnit(fidn);
                     ImperialUnitFactory.displayImperialWalkerUnit(W);
                } catch (SQLException ex) {
                    Logger.getLogger(ImperialUnitDisplayApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ImperialUnitDisplayApp.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }); //END ACTIONLISTENER CREATE        
    }//END METHOD    

  
    
}
