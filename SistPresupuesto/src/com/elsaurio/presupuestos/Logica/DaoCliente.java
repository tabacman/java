/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.Logica;

import com.elsaurio.presupuestos.Datos.DBdaoCliente;
import com.elsaurio.presupuestos.comun.Entidades.Cliente;
import com.elsaurio.presupuestos.comun.Interfaces.IdaoCliente;
import java.util.ArrayList;

/**
 *
 * @author SADRAC
 */
public class DaoCliente implements IdaoCliente, IColectable {

    private DBdaoCliente daoCliente = new DBdaoCliente();

    public DaoCliente() {
    }

    /**
     *
     * @param producto
     */
    @Override
    public void agregaCliente(Cliente unCliente) {
        daoCliente.agregaCliente(unCliente);
    }

    /**
     *
     * @param codigo
     */
    @Override
    public void eliminaCliente(Cliente unCliente) {
        daoCliente.eliminaCliente(unCliente);
    }

    @Override
    public void modificaCliente(Cliente unCliente) {
        daoCliente.modificaCliente(unCliente);
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList getList(String patron) {
        return daoCliente.listaClientes(patron);
    }

    @Override
    public Cliente nextCliente(Cliente unCliente) {
        return daoCliente.nextCliente(unCliente);
    }

    @Override
    public Cliente prevCliente(Cliente unCliente) {
        return daoCliente.prevCliente(unCliente);
    }

    @Override
    public ArrayList<Cliente> getList() {
        throw new UnsupportedOperationException(java.util.ResourceBundle.getBundle("Bundle").getString("NOT SUPPORTED YET."));
    }
}
