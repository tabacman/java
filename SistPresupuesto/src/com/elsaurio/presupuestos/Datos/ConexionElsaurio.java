/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.Datos;

/**
 *
 * @author SADRAC
 */
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionElsaurio {

    private Connection conection = null;

    public Connection getConection() {
        if (conection == null) {
            try {
                Driver driver = new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(driver);
                conection = DriverManager.getConnection(java.util.ResourceBundle.getBundle("Bundle").getString("JDBC:MYSQL://LOCALHOST:3306"), java.util.ResourceBundle.getBundle("Bundle").getString("JUAN"), java.util.ResourceBundle.getBundle("Bundle").getString("JUAN"));
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionElsaurio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conection;
    }
}