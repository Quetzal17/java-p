
package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBconnection {
    Connection con;
    
     public Connection getconnection(){
        
         try {
             //jdbc:mysql://localhost:3306/university?zeroDateTimeBehavior=convertToNull
              String url="jdbc:mysql://localhost/university";
             con=DriverManager.getConnection(url,"root"," ");
          
             
             
             
             
             
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null,new String(" Error.." +e));
         }
         
         
         
         
         
         
         
         
         
         return con;
     
     
     
     
     
     
     
     
     }
    
    
    
    
    
}
