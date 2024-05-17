package config;
import java.sql.*;
/**
 * Clase encargada de conectar y desconectar la base de datos
 * @author estela
 */

public class Conexion{
    /* Declaramos 5 variables con el driver, la bbdd, usuario y contraseña
    y una para almacenar el error en caso de suceder*/
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String bbdd="jdbc:mysql://192.168.24.53:3306/calculeso";
    private static final String usuario ="root";
    private static final String clave="12345";
    private static Connection conex = null;
    private static String error="";
     
    /**
     * 
     * @return Devuelve la conexión a una base de datos
     */
    
    public static Connection getConexion(){
         
        //Controlamos la excepciones que puedan surgir al conectarnos a la BBDD
        try {
            //Registrar el driver
            Class.forName(driver);
            //Creamos una conexión a la Base de Datos
            conex = DriverManager.getConnection(bbdd, usuario, clave);
        // Si hay errores informamos al usuario. 
        } catch (Exception e) {
            error = e.getMessage();
            return null;
        }
        // Devolvemos la conexión.
        return conex;
    }
     
    /**
     * 
     * @param conex Parámetro que contiene la conexión que deseamos cerrar
     */
    public static void getCerrarConexion(Connection conex){
        try{
            conex.close(); // Cerramos la conexión    
        }catch(SQLException e){
            error = e.getMessage();
        }
    }
    
    /**
     * 
     * @return Devuelve el error en caso de no poder conectar o desconectar
     * de la base de datos.
     */
    public String getError(){
        return error;
    }
}
