/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.Datos;

/**
 *
 * @author SADRAC
 */
import com.elsaurio.presupuestos.comun.Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBdaoCliente {

    private Connection connection = new ConexionElsaurio().getConection();

    public DBdaoCliente() {
    }

    public void agregaCliente(Cliente unCliente) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("INSERT INTO  `PRESUPUESTOS`.`CLIENTES` (`ID` ,`NOMBRE` ,`DOMICILIO` ,`TELEFONO` ,`CELULAR` ,`EMAIL`) VALUES (NULL ,  ?,  ?,  ?,  ?,  ?);"));
            statement.setString(1, unCliente.getNombre());
            statement.setString(2, unCliente.getDomicilio());
            statement.setString(3, unCliente.getTelefono());
            statement.setString(4, unCliente.getCelular());
            statement.setString(5, unCliente.getEmail());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void eliminaCliente(Cliente unCliente) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("DELETE FROM `PRESUPUESTOS`.`CLIENTES` WHERE ID = ?"));
            statement.setInt(1, unCliente.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void modificaCliente(Cliente unCliente) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    java.util.ResourceBundle.getBundle("Bundle").getString("UPDATE  `PRESUPUESTOS`.`CLIENTES` SET  `NOMBRE` = ?, `DOMICILIO` = ?, `TELEFONO` = ?, `CELULAR` = ?, `EMAIL` = ? WHERE  `CLIENTES`.`ID` = ?;"));
            statement.setString(1, unCliente.getNombre());
            statement.setString(2, unCliente.getDomicilio());
            statement.setString(3, unCliente.getTelefono());
            statement.setString(4, unCliente.getCelular());
            statement.setString(5, unCliente.getEmail());
            statement.setInt(6, unCliente.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Cliente nextCliente(Cliente unCliente) {
        Cliente cli = new Cliente();
        try {
            String elSQL;
            if (null == unCliente.getNombre()) {
                elSQL = java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`CLIENTES` ORDER BY NOMBRE LIMIT 1");
            } else {
                elSQL = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`CLIENTES` WHERE STRCMP( NOMBRE,  '{0}' ) = 1 ORDER BY NOMBRE LIMIT 1"), new Object[] {unCliente.getNombre()});
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(elSQL);
            resultSet.next();
            cli.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
            cli.setNombre(resultSet.getString("nombre"));
            cli.setDomicilio(resultSet.getString("domicilio"));
            cli.setTelefono(resultSet.getString("telefono"));
            cli.setCelular(resultSet.getString("celular"));
            cli.setEmail(resultSet.getString("email"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cli;
    }

    public Cliente prevCliente(Cliente unCliente) {
        Cliente cli = new Cliente();
        try {
            String elSQL;
            if (null == unCliente.getNombre()) {
                elSQL = java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`CLIENTES` ORDER BY NOMBRE DESC LIMIT 1");
            } else {
                elSQL = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`CLIENTES` WHERE STRCMP( NOMBRE,  '{0}' ) = -1 ORDER BY NOMBRE DESC LIMIT 1"), new Object[] {unCliente.getNombre()});
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(elSQL);
            resultSet.next();
            cli.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
            cli.setNombre(resultSet.getString("nombre"));
            cli.setDomicilio(resultSet.getString("domicilio"));
            cli.setTelefono(resultSet.getString("telefono"));
            cli.setCelular(resultSet.getString("celular"));
            cli.setEmail(resultSet.getString("email"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cli;
    }
    
    public Cliente getCliente(int unId) {
        Cliente cli = new Cliente();
        try {
            String elSQL = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM  `PRESUPUESTOS`.`CLIENTES` WHERE ID = {0}"), new Object[] {unId});
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(elSQL);
            resultSet.next();
            cli.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
            cli.setNombre(resultSet.getString("nombre"));
            cli.setDomicilio(resultSet.getString("domicilio"));
            cli.setTelefono(resultSet.getString("telefono"));
            cli.setCelular(resultSet.getString("celular"));
            cli.setEmail(resultSet.getString("email"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cli;
    }

    public ArrayList<Cliente> listaClientes(String patron) {
        ArrayList<Cliente> lClien = new ArrayList<Cliente>();
        try {
            Statement statement = connection.createStatement();
            String queTex = java.util.ResourceBundle.getBundle("Bundle").getString("SELECT * FROM `PRESUPUESTOS`.`CLIENTES`WHERE  `NOMBRE` LIKE  '%")+patron+java.util.ResourceBundle.getBundle("Bundle").getString("%' ORDER BY NOMBRE");
            System.out.println(queTex);
            ResultSet resultSet = statement.executeQuery(queTex);
            while (resultSet.next()) {
                Cliente cli = new Cliente();
                cli.setId(resultSet.getInt(java.util.ResourceBundle.getBundle("Bundle").getString("ID")));
                cli.setNombre(resultSet.getString("nombre"));
                cli.setDomicilio(resultSet.getString("domicilio"));
                cli.setTelefono(resultSet.getString("telefono"));
                cli.setCelular(resultSet.getString("celular"));
                cli.setEmail(resultSet.getString("email"));
                lClien.add(cli);
            }
            return lClien;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}