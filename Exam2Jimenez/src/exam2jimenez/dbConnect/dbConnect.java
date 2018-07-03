
package exam2jimenez.dbConnect;

import exam2jimenez.Stormtrooper.Stormtrooper;
import exam2jimenez.StormtrooperUnit.StormtrooperUnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author lillimj
 */
public class dbConnect {
       public Connection establishDBConnection() throws SQLException, ClassNotFoundException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection connect = null;
        Properties connectProp = new Properties();
        connectProp.put("dbms", "mysql");
        connectProp.put("user", "root");
        connectProp.put("password", "hello");
        connectProp.put("useSSL", "false");

        connect = DriverManager.getConnection(
                "jdbc:" + "mysql" + "://" + "localhost" + ":" + 3306 + "/", connectProp);
       
        
      //  System.out.println("Connected to database");
        return connect;
        
    }
    
 

     
   public static ArrayList<StormtrooperUnit> StormtrooperUnitFactory(int cnt1)
           throws SQLException, ClassNotFoundException {
        String queryUnit = "SELECT * FROM stormtrooper_unit LEFT OUTER JOIN imperial_battlegroup ON stormtrooper_unit.UnitCmd = imperial_battlegroup.BGID";
              // String queryUnit = "SELECT * FROM imperial_battlegroup";

 //String queryStorm = "SELECT * FROM stormtroopers_officer LEFT OUTER JOIN st_officer_assign ON stormtroopers_officer.STID = st_officer_assign.STID UNION SELECT * FROM stormtroopers_nco LEFT OUTER JOIN st_nco_assign ON stormtroopers_nco.STID = st_nco_assign.STID UNION SELECT * FROM stormtroopers_troop LEFT OUTER JOIN st_troop_assign ON stormtroopers_troop.STID = st_troop_assign.STID;";

        dbConnect db = new dbConnect();
        Connection conn = db.establishDBConnection();
        Statement useStatement = conn.createStatement();
        useStatement.executeQuery("USE stormtrooper_java");
        Statement qStatement1 = conn.createStatement();
        //Statement qStatement2 = conn.createStatement();
       
        ResultSet rs1 = qStatement1.executeQuery(queryUnit);
      //  ResultSet rs2 = qStatement2.executeQuery(queryStorm);
         
       // ArrayList<Stormtrooper> StList = new ArrayList<>();
        ArrayList<StormtrooperUnit> StUnitList = new ArrayList<>();
            while(rs1.next()){
            String A = rs1.getString("STUID");
            String B = rs1.getString("UnitCmd");
            String C = rs1.getString("UnitType");
            int D = rs1.getInt("AssignedStrength");         
            int E = rs1.getInt("Location_X");
            int F = rs1.getInt("Location_Y");
            int I = rs1.getInt("HQ_LocationX");
            int J = rs1.getInt("HQ_LocationY");            
            
            StormtrooperUnit StUnit = new StormtrooperUnit(A,B,C,D,E,F,I,J) {};
                StUnitList.add(StUnit);
                        
           // System.out.println(A+B+C+D+E+F+I+J);
       }
            return StUnitList;
   }
   
   public static ArrayList<Stormtrooper> StormtrooperFactory(int cnt2)
throws SQLException, ClassNotFoundException {
     String queryStorm = "SELECT * FROM stormtroopers_officer LEFT OUTER JOIN st_officer_assign ON stormtroopers_officer.STID = st_officer_assign.STID UNION SELECT * FROM stormtroopers_nco LEFT OUTER JOIN st_nco_assign ON stormtroopers_nco.STID = st_nco_assign.STID UNION SELECT * FROM stormtroopers_troop LEFT OUTER JOIN st_troop_assign ON stormtroopers_troop.STID = st_troop_assign.STID;";
 dbConnect db = new dbConnect();
        Connection conn = db.establishDBConnection();
        Statement useStatement = conn.createStatement();
        useStatement.executeQuery("USE stormtrooper_java");
       // Statement qStatement1 = conn.createStatement();
        Statement qStatement2 = conn.createStatement();
              
        ResultSet rs2 = qStatement2.executeQuery(queryStorm);
        ArrayList<Stormtrooper> StList = new ArrayList<>();

                

              while(rs2.next()){
            String A = rs2.getString("STID");
            String B = rs2.getString("Rank");
            String C = rs2.getString("Gender");
            int D = rs2.getInt("ServiceYears");         
            int E = rs2.getInt("Height");
            int F = rs2.getInt("Weight");
            String G = rs2.getString("DutyCategory");
            String H = rs2.getString("DutyStatus");
            String I = rs2.getString("STUID");
            String J = rs2.getString("Role");

                Stormtrooper St = new Stormtrooper(A,B,C,D,E,F,G,H, I,J) {};
                StList.add(St);

           // System.out.println(A+B+C+D+E+F+G+H+I+J);
        } 
              return StList;
}
   
}
    
    

