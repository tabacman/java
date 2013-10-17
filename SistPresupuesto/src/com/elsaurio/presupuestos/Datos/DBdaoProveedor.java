/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.Datos;

/**
 *
 * @author SADRAC
 */
import com.elsaurio.presupuestos.comun.Entidades.Proveedor;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBdaoProveedor {

    private Connection connection = new ConexionElsaurio().getConection();

    public void agregaProveedor(Proveedor unProveedor) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("INSERT INTO  `PRESUPUESTOS`.`PROVEEDORES` (`ID` ,`NOMBRE` ,`DOMICILIO` ,`TELEFONO` ,`CELULAR` ,`EMAIL`) VALUES (NULL ,  ?,  ?,  ?,  ?,  ?);"));
            statement.setString(1, unProveedor.getNombre());
            statement.setString(2, unProveedor.getDomicilio());
            statement.setString(3, unProveedor.getTelefono());
            statement.setString(4, unProveedor.getCelular());
            statement.setString(5, unProveedor.getEmail());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void eliminaProveedor(Proveedor unProveedor) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("DELETE FROM `PRESUPUESTOS`.`PROVEEDORES` WHERE ID = ?"));
            statement.setInt(1, unProveedor.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public Proveedor getProveedor(int unId) {
        Proveedor pro = new Proveedor();
        try {
            String elSQL = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PROVEEDORES` WHERE ID = {0}"), new Object[] {unId});
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(elSQL);
            resultSet.next();
            pro.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
            pro.setNombre(resultSet.getString("nombre"));
            pro.setDomicilio(resultSet.getString("domicilio"));
            pro.setTelefono(resultSet.getString("telefono"));
            pro.setCelular(resultSet.getString("celular"));
            pro.setEmail(resultSet.getString("email"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pro;
    }

    public void modificaProveedor(Proveedor unProveedor) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("UPDATE  `PRESUPUESTOS`.`PROVEEDORES` SET  `NOMBRE` = ?, `DOMICILIO` = ?, `TELEFONO` = ?, `CELULAR` = ?, `EMAIL` = ? WHERE  `PROVEEDORES`.`ID` = ?;"));
            statement.setString(1, unProveedor.getNombre());
            statement.setString(2, unProveedor.getDomicilio());
            statement.setString(3, unProveedor.getTelefono());
            statement.setString(4, unProveedor.getCelular());
            statement.setString(5, unProveedor.getEmail());
            statement.setInt(6, unProveedor.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Proveedor nextProveedor(Proveedor unProveedor) {
        Proveedor pro = new Proveedor();
        try {
            String elSQL;
            if (null == unProveedor.getNombre()) {
                elSQL = java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PROVEEDORES` ORDER BY NOMBRE LIMIT 1");
            } else {
                elSQL = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PROVEEDORES` WHERE STRCMP( NOMBRE,  '{0}' ) = 1 ORDER BY NOMBRE LIMIT 1"), new Object[] {unProveedor.getNombre()});
            };
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(elSQL);
            resultSet.next();
            pro.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
            pro.setNombre(resultSet.getString("nombre"));
            pro.setDomicilio(resultSet.getString("domicilio"));
            pro.setTelefono(resultSet.getString("telefono"));
            pro.setCelular(resultSet.getString("celular"));
            pro.setEmail(resultSet.getString("email"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pro;
    }

    public Proveedor prevProveedor(Proveedor unProveedor) {
        Proveedor pro = new Proveedor();
        try {
            String elSQL;
            if (null == unProveedor.getNombre()) {
                elSQL = java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PROVEEDORES` ORDER BY NOMBRE DESC LIMIT 1");
            } else {
                elSQL = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PROVEEDORES` WHERE STRCMP( NOMBRE,  '{0}' ) = -1 ORDER BY NOMBRE DESC LIMIT 1"), new Object[] {unProveedor.getNombre()});
            };
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(elSQL);
            resultSet.next();
            pro.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
            pro.setNombre(resultSet.getString("nombre"));
            pro.setDomicilio(resultSet.getString("domicilio"));
            pro.setTelefono(resultSet.getString("telefono"));
            pro.setCelular(resultSet.getString("celular"));
            pro.setEmail(resultSet.getString("email"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pro;
    }

    public ArrayList<Proveedor> listaProveedores() {
        ArrayList<Proveedor> lProve = new ArrayList<Proveedor>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM `PRESUPUESTOS`.`PROVEEDORES` ORDER BY NOMBRE"));
            while (resultSet.next()) {
                Proveedor pro = new Proveedor();
                pro.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
                pro.setNombre(resultSet.getString("nombre"));
                pro.setDomicilio(resultSet.getString("domicilio"));
                pro.setTelefono(resultSet.getString("telefono"));
                pro.setCelular(resultSet.getString("celular"));
                pro.setEmail(resultSet.getString("email"));
                lProve.add(pro);
            }
            return lProve;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}