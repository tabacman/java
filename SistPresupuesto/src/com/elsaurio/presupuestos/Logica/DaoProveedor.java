/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.Logica;

import com.elsaurio.presupuestos.Datos.DBdaoProveedor;
import com.elsaurio.presupuestos.comun.Entidades.Proveedor;
import com.elsaurio.presupuestos.comun.Interfaces.IdaoProveedor;
import java.util.ArrayList;

/**
 *
 * @author SADRAC
 */
public class DaoProveedor implements IdaoProveedor {

    private DBdaoProveedor daoProveedor = new DBdaoProveedor();

    public DaoProveedor() {
    }

    /**
     *
     * @param producto
     */
    @Override
    public void agregaProveedor(Proveedor unProveedor) {
        daoProveedor.agregaProveedor(unProveedor);
    }

    /**
     *
     * @param codigo
     */
    @Override
    public void eliminaProveedor(Proveedor unProveedor) {
        daoProveedor.eliminaProveedor(unProveedor);
    }

    @Override
    public void modificaProveedor(Proveedor unProveedor) {
        daoProveedor.modificaProveedor(unProveedor);
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Proveedor> listaProveedores() {
        return daoProveedor.listaProveedores();
    }

    @Override
    public Proveedor nextProveedor(Proveedor unProveedor) {
        return daoProveedor.nextProveedor(unProveedor);
    }

    @Override
    public Proveedor prevProveedor(Proveedor unProveedor) {
        return daoProveedor.prevProveedor(unProveedor);
    }
}
