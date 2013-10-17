/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.comun.Interfaces;

import com.elsaurio.presupuestos.comun.Entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author SADRAC
 */
public interface IdaoCliente {

    public void agregaCliente(Cliente unCliente);

    public void eliminaCliente(Cliente unCliente);

    public void modificaCliente(Cliente unCliente);

    public Cliente nextCliente(Cliente unCliente);

    public Cliente prevCliente(Cliente unCliente);

    public ArrayList<Cliente> getList();
}