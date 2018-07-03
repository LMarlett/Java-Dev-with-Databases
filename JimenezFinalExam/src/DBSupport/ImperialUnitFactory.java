
package DBSupport;

import ImperialUnits.ImperialBattleGroup;
import ImperialUnits.ImperialWalkerUnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class ImperialUnitFactory {
    
    public static Connection establishDBConnection() throws SQLException, ClassNotFoundException{
       Class.forName("com.mysql.jdbc.Driver");

       Connection connect = null;
       Properties connectProp = new Properties();
       connectProp.put("dbms","mysql");
       connectProp.put("user","root");
       connectProp.put("password","root");
       connectProp.put("useSSL","false");
       
       
       connect = DriverManager.getConnection(
                   "jdbc:" + "mysql" + "://" + "localhost" + ":" + 3306 + "/", connectProp);       
       System.out.println("Connected to database");
       return connect;
   }
   
   public static ArrayList<ImperialBattleGroup> createBattleGroup(ArrayList<String> IDNumbers) throws SQLException, ClassNotFoundException{
        Connection conn = establishDBConnection(); //connect to database       
        Statement useStatement = conn.createStatement(); //create a SQL statement
        useStatement.executeQuery("USE stormtrooper_java"); //use the statement to select the database
        Statement queryStatement = conn.createStatement(); //create a SQL statement
        String query = "SELECT STO.STID, STO.Rank, STO.Gender, STO.ServiceYears, STO.Height, STO.Weight, STO.DutyCategory, STO.DutyStatus, STOA.STUID, STOA.Role"
                + " FROM stormtroopers_officer STO"
                + " JOIN st_officer_assign STOA ON STO.STID = STOA.STID"
                + " WHERE STO.Gender = 'Male'" ; //query
        ResultSet rs = queryStatement.executeQuery(query); //create a Result Set from executing the query     
        
        String A = null; String B = null; String C = null; int D = 0; int E = 0; int F = 0; String G = null; String H = null; String J = null; String K = null;
        ArrayList<ImperialBattleGroup> mstoList = new ArrayList<>();
               
        while(rs.next()){            
            A = rs.getString("STID");
            B = rs.getString("Rank");
            C = rs.getString("Gender");
            D = rs.getInt("ServiceYears");
            E = rs.getInt("Height");
            F = rs.getInt("Weight");
            G = rs.getString("DutyCategory");
            H = rs.getString("DutyStatus");
            J = rs.getString("STUID");
            K = rs.getString("Role");
            
            if(IDNumbers.contains(A)){
              ImperialBattleGroup s1 = new ImperialBattleGroup(A,B,D,E,F,G,H,J,K);
              mstoList.add(s1);  
            }
            
        } 
        return mstoList;        
   }
    
   public static ArrayList<ImperialWalkerUnit> createWalkerUnit(ArrayList<String> IDNumbers) throws SQLException, ClassNotFoundException{
        Connection conn = establishDBConnection(); //connect to database       
        Statement useStatement = conn.createStatement(); //create a SQL statement
        useStatement.executeQuery("USE stormtrooper_java"); //use the statement to select the database
        Statement queryStatement = conn.createStatement(); //create a SQL statement
        String query = "SELECT STN.STID, STN.Rank, STN.Gender, STN.ServiceYears, STN.Height, STN.Weight, STN.DutyCategory, STN.DutyStatus, STNA.STUID, STNA.Role"
                + " FROM stormtroopers_nco STN"
                + " JOIN st_nco_assign STNA ON STN.STID = STNA.STID"
                + " WHERE STN.Gender = 'Female'" ; //query
        ResultSet rs = queryStatement.executeQuery(query); //create a Result Set from executing the query     
        
        String A = null; String B = null; String C = null; int D = 0; int E = 0; int F = 0; String G = null; String H = null; String J = null; String K = null;
        ArrayList<ImperialWalkerUnit> fstnList = new ArrayList<>();
               
        while(rs.next()){            
            A = rs.getString("STID");
            B = rs.getString("Rank");
            C = rs.getString("Gender");
            D = rs.getInt("ServiceYears");
            E = rs.getInt("Height");
            F = rs.getInt("Weight");
            G = rs.getString("DutyCategory");
            H = rs.getString("DutyStatus");
            J = rs.getString("STUID");
            K = rs.getString("Role");
            
            if(IDNumbers.contains(A)){
              ImperialWalkerUnit s1 = new ImperialWalkerUnit(A,B,D,E,F,G,H,J,K);
              fstnList.add(s1);  
            }
            
        } 
        return fstnList;        
   }
    public static void displayImperialBattleGroup(ArrayList<ImperialBattleGroup> mstol){
        for(ImperialBattleGroup s: mstol){
         //   s.reportsToCommander();
        }
    }
    
    public static void displayImperialWalkerUnit(ArrayList<ImperialWalkerUnit> fstnl){
        for(ImperialWalkerUnit s: fstnl){
           // s.reportsToCommander();
        }
    }
}
