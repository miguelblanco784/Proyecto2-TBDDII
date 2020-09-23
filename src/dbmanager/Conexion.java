package dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con = null;
    String url = "jdbc:mysql://databaseloca.chipjryqc5hl.us-east-1.rds.amazonaws.com:3306/";
    String driver;
    String username;
    String password;
    String hostname;
    String port;
    String nombrebd;

    public Conexion(String driver, String hostname, String port, String username, String password, String nombrebd) {
        this.driver = driver; //origen: mysql
        this.hostname = hostname;// origen: databaseloca.chipjryqc5hl.us-east-1.rds.amazonaws.com
        this.port = port;//origen: 3306
        this.username = username;//origen: masteruser
        this.password = password;//origen: admin12345
        this.nombrebd = nombrebd;//mydb
        this.url = "jdbc:" + this.driver + "://" + this.hostname + ":" + this.port + "/" + nombrebd;
    }

    public Connection getCon() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se logro conexion" + ex.getMessage());
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
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
