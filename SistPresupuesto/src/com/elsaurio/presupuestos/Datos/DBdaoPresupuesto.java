/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.Datos;

/**
 *
 * @author SADRAC
 */
import com.elsaurio.presupuestos.comun.Entidades.Presupuesto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBdaoPresupuesto {

    private Connection connection = new ConexionElsaurio().getConection();

    public void agregaPresupuesto(Presupuesto unPresupuesto) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("INSERT INTO  `PRESUPUESTOS`.`PRESUPUESTOS` (`ID` ,`CLIENTE` ,`PROVEEDOR` ,`FINICIO` ,`FENTREGA` ,`IMPORTE` ,`DESCRIPCION`) VALUES (NULL ,  ?,  ?,  ?,  ?,  ?, ?);"));
            statement.setInt(1, unPresupuesto.getCliente().getId());
            statement.setInt(2, unPresupuesto.getProveedor().getId());
            statement.setDate(3, new Date(unPresupuesto.getfInicio().getTime()));
            statement.setDate(4, new Date(unPresupuesto.getfEntrega().getTime()));
            statement.setFloat(5, unPresupuesto.getImporte());
            statement.setString(6, unPresupuesto.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(java.util.ResourceBundle.getBundle("Bundle").getString("SI"));
            ex.printStackTrace();
        }

    }

    public void eliminaPresupuesto(Presupuesto unPresupuesto) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("DELETE FROM `PRESUPUESTOS`.`PRESUPUESTOS` WHERE ID = ?"));
            statement.setInt(1, unPresupuesto.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificaPresupuesto(Presupuesto unPresupuesto) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("UPDATE`PRESUPUESTOS`.`PRESUPUESTOS`SET `CLIENTE`=?, `PROVEEDOR`=?, `FINICIO`=?, `FENTREGA`=?, `IMPORTE`=?, `DESCRIPCION`=? WHERE`PRESUPUESTOS`.`ID`=?;"));           
            statement.setInt(1, unPresupuesto.getCliente().getId());
            statement.setInt(2, unPresupuesto.getProveedor().getId());
            statement.setDate(3, new Date(unPresupuesto.getfInicio().getTime()));
            statement.setDate(4, new Date(unPresupuesto.getfEntrega().getTime()));
            statement.setFloat(5, unPresupuesto.getImporte());
            statement.setString(6, unPresupuesto.getDescripcion());
            statement.setInt(7, unPresupuesto.getId());
            //System.out.println(statement);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Presupuesto nextPresupuesto(Presupuesto unPresupuesto) {
        Presupuesto pre = new Presupuesto();
        try {
            String elSQL;
            if (null == unPresupuesto.getCliente()) {
                elSQL = java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PRESUPUESTOS` ORDER BY FENTREGA LIMIT 1");
            } else {
                elSQL = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PRESUPUESTOS` WHERE FENTREGA>'{0}' ORDER BY FENTREGA LIMIT 1"), new Object[] {unPresupuesto.getfEntrega()});
            }
            //System.out.println(elSQL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(elSQL);
            resultSet.next();
            pre.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
            pre.setCliente(new DBdaoCliente().getCliente(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("CLIENTE"))));
            pre.setProveedor(new DBdaoProveedor().getProveedor(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("PROVEEDOR"))));
            pre.setfInicio(resultSet.getDate(java.util.ResourceBundle.getBundle("Bundle").getString("FINICIO")));
            pre.setfEntrega(resultSet.getDate(java.util.ResourceBundle.getBundle("Bundle").getString("FENTREGA")));
            pre.setImporte(resultSet.getFloat(java.util.ResourceBundle.getBundle("Bundle").getString("IMPORTE")));
            pre.setDescripcion(resultSet.getString("Descripcion"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pre;
    }

    public Presupuesto prevPresupuesto(Presupuesto unPresupuesto) {
        Presupuesto pre = new Presupuesto();
        try {
            String elSQL;
            if (null == unPresupuesto.getCliente()) {
                elSQL = java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PRESUPUESTOS` ORDER BY FENTREGA DESC LIMIT 1");
            } else {
                elSQL = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`PRESUPUESTOS` WHERE FENTREGA <'{0}' ORDER BY FENTREGA DESC LIMIT 1"), new Object[] {unPresupuesto.getfEntrega()});
            }
            System.out.println(elSQL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(elSQL);
            resultSet.next();
            pre.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
            pre.setCliente(new DBdaoCliente().getCliente(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("CLIENTE"))));
            pre.setProveedor(new DBdaoProveedor().getProveedor(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("PROVEEDOR"))));
            pre.setfInicio(resultSet.getDate(java.util.ResourceBundle.getBundle("Bundle").getString("FINICIO")));
            pre.setfEntrega(resultSet.getDate(java.util.ResourceBundle.getBundle("Bundle").getString("FENTREGA")));
            pre.setImporte(resultSet.getFloat(java.util.ResourceBundle.getBundle("Bundle").getString("IMPORTE")));
            pre.setDescripcion(resultSet.getString("Descripcion"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pre;
    }

    public ArrayList<Presupuesto> listaPresupuestos() {
        ArrayList<Presupuesto> lPresu = new ArrayList<Presupuesto>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM `PRESUPUESTOS`.`PROVEEDORES` ORDER BY NOMBRE"));
            while (resultSet.next()) {
                Presupuesto pre = new Presupuesto();
                pre.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
                pre.setCliente(new DBdaoCliente().getCliente(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("CLIENTE"))));
                pre.setProveedor(new DBdaoProveedor().getProveedor(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("PROVEEDOR"))));
                pre.setfInicio(resultSet.getDate(java.util.ResourceBundle.getBundle("Bundle").getString("FINICIO")));
                pre.setfEntrega(resultSet.getDate(java.util.ResourceBundle.getBundle("Bundle").getString("FENTREGA")));
                pre.setImporte(resultSet.getFloat(java.util.ResourceBundle.getBundle("Bundle").getString("IMPORTE")));
                pre.setDescripcion(resultSet.getString("Descripcion"));
                lPresu.add(pre);
            }
            return lPresu;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}