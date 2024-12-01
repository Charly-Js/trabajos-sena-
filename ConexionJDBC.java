
package conexionjdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionJDBC {

    public static void main(String[] args) {
        String usuario="root";//Por defecto 
        String password="";
        String url="jdbc:mysql://localhost:3307/ecosoft_db";
        Connection conexion; 
        Statement statement; 
        ResultSet rs;
        
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
            statement = conexion.createStatement();
            rs= statement.executeQuery("SELECT * FROM usuarios"); 
            while(rs.next()){
                System.out.println(rs.getString("nombre")); 
          
            }
           
            //Inserción de datos 
            statement.execute("INSERT INTO `usuarios` (`id`, `nombre`) VALUES (NULL, 'jrojas');");
            System.out.println("");
            rs= statement.executeQuery("SELECT * FROM usuarios"); 
            while(rs.next()){
                System.out.println(rs.getString("nombre")); 
          
            }
            
            //Actualización de datos 
            
            statement.execute("UPDATE `usuarios` SET `nombre` = 'cpinzon' WHERE `usuarios`.`id` = 3;");
            System.out.println("");
            rs= statement.executeQuery("SELECT * FROM usuarios"); 
            while(rs.next()){
                System.out.println(rs.getString("nombre")); 
          
            }
                 
            //Eliminación de datos 
            
            statement.execute("DELETE FROM `usuarios` WHERE `usuarios`.`id` = 5");
            System.out.println("");
            rs= statement.executeQuery("SELECT * FROM usuarios"); 
            while(rs.next()){
                System.out.println(rs.getString("nombre")); 
          
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
