package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

     private Connection con;

    public Connection getConnection() {
        if (con == null) {  // Solo intenta conectar si no hay conexión activa
            try {
                String myBD = "jdbc:mysql://bbb5fcdsbx0byyq7yjg1-mysql.services.clever-cloud.com:3306/bbb5fcdsbx0byyq7yjg1";
                con = DriverManager.getConnection(myBD, "utve1z2keoh2gcxn", "VJb8uYJ83V4wBF1nSCBm");
            } catch (SQLException e) {
                System.out.println("Error al conectar: " + e.toString());
            }
        }
        return con;
    }

    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
                con = null;  // Asegúrate de que la conexión esté marcada como null
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.toString());
            }
        }
    }
}