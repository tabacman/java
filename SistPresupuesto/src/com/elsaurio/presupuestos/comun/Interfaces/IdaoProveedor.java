/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.comun.Interfaces;

import com.elsaurio.presupuestos.comun.Entidades.Proveedor;
import java.util.ArrayList;

/**
 *
 * @author SADRAC
 */
public interface IdaoProveedor {

    public void agregaProveedor(Proveedor unProveedor);

    public void eliminaProveedor(Proveedor unProveedor);

    public void modificaProveedor(Proveedor unProveedor);

    public Proveedor nextProveedor(Proveedor unProveedor);

    public Proveedor prevProveedor(Proveedor unProveedor);

    public ArrayList<Proveedor> listaProveedores();
}