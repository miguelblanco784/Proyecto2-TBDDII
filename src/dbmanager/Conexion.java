package dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    Connection con = null;
    String databaseName = "mydb";
    String url = "jdbc:mysql://databaseloca.chipjryqc5hl.us-east-1.rds.amazonaws.com:3306/" + databaseName;

    String username = "masteruser";
    String password = "admin12345";

    public Conexion() {

    }

    public Connection getCon() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (con != null) {
            System.out.println("Connection to database succesfull");
        } else {
            System.out.println("FATAL ERROR CONNECTION NOT SET!");
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

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
