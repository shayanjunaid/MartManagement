package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class EstablishConnection {
    Connection con = null;
    public Connection EstablishConnection(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Project.accdb");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
}
