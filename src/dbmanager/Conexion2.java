/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class Conexion2 {

    Connection con = null;
    String nombreInstancia;
    String nombreDB;
    String puerto;
    String nombreUsuario;
    String password;

    public Conexion2(String nombreInstancia, String nombreDB, String puerto, String nombreUsuario, String password) {
        this.nombreInstancia = nombreInstancia;
        this.nombreDB = nombreDB;
        this.puerto = puerto;
        this.nombreUsuario = nombreUsuario;
        this.password = password;

    }

    public Connection getCon() {
        try {
            String connectionUrl = "jdbc:sqlserver://" + nombreInstancia + ":" + puerto + ";"
                    + "databaseName=" + nombreDB + ";user=" + nombreUsuario + ";password=" + password + ";";
            con = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se logro conexion" + e.getMessage());
        }
        return con;
    }

    void desconexion() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("No se puedo efectuar la desconexion!");
        }
    }

}
