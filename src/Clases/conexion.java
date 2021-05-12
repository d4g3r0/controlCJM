package Clases;

import java.sql.*;

public class conexion {
    Connection puente=null;
    public Connection conectar() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            puente = DriverManager.getConnection("jdbc:mysql://31.170.167.153/u377565885_cjm", "u377565885_admin", "m1bd3st4s3gur@");
            System.out.println("Conexion al servidor realizada exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al conectar al servidor:\n"+e);
        }
        return puente;
    }
    public void cerrarConexion(){
        try {
            puente.close();
        } catch (Exception e) {
            System.out.println("Error:\n"+e);
        }
    }
}
