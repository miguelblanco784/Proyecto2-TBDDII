/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager;

import java.sql.*;

/**
 *
 * @author migue
 */
public class Conexion2 {

    public static void main(String args[]) {
        try {
            String connectionUrl = "jdbc:sqlserver://database.chipjryqc5hl.us-east-1.rds.amazonaws.com:1433;"
                    + "databaseName=mydb;user=admin;password=admin12345;";
            Connection con = DriverManager.getConnection(connectionUrl);
            System.out.println("Coneccion a la Base de Datos SQL Server SUCCESFULL!");
        } catch (SQLException e) {
            System.out.println("Error en le coneccion a la base de datos SQL Server " + e.getMessage());
        }
    }

    void Conexion() {

    }

}
