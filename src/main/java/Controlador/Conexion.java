/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author josea
 */
public class Conexion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/Human Soft";
        String usuario="postgres";
        String password="123789";
        Connection objConnection = null;
        
        try{
            objConnection=DriverManager.getConnection(url, usuario, password);
            if(objConnection!=null){
                System.out.println("Si se pudo conectar");
            }
        }catch(SQLException e){
            System.err.println("No se pudo conectar");
            System.err.println(e.toString());
            }
        }
}
