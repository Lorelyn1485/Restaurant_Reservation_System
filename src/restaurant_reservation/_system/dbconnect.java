
package restaurant_reservation._system;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
    private static java.sql.Connection connect;
         public static java.sql.Connection getConnected() {
        if(connect==null){
            try{
                String url="jdbc:mysql://192.168.183.63:3306/tonton32?zeroDateTimeBehavior=CONVERT_TO_NULL";
                 String user ="tonton32";
                  String password ="";
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    connect=DriverManager.getConnection(url,user,password);   
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }return connect;
}
    public static void main(String[] args) {
        getConnected();
    }
    
    
}

        
        
        
        
        
        
        
        
////      String Url, User, Pass;
////        Url = "jdbc:mysql://localhost:3306/Restaurant_Reservation_System?zeroDateTimeBehavior=CONVERT_TO_NULL";
////        User = "root";
////        Pass = "";
//        
//       try {
//           Class.forName("com.mysql.cj.jdbc.Driver");
//           
//           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Restaurant_Reservation_System?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
//           JOptionPane.showMessageDialog(null, "Connection Succes");
//           return con;
//       }  catch (Exception e) {
//           JOptionPane.showMessageDialog(null,e);
//       }
//       
//       return null;
//    }
//
//    
//}
