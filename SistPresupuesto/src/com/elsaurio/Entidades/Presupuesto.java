/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.comun.Entidades;

import java.util.Date;

/**
 *
 * @author SADRAC
 */
public class Presupuesto {

    private int id;
    private Cliente cliente;
    private Proveedor proveedor;
    private Date fInicio;
    private Date fEntrega;
    private Float Importe;
    private String Descripcion;

    @Override
    public String toString() {
        return getProveedor().getNombre() + java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString(" - {0}"), new Object[] {getfEntrega()}) ;
    }


    public void blanquea() {
        this.setId(0);
        this.setCliente(new Cliente());
        this.setProveedor(new Proveedor());
        this.setfInicio(new Date());
        this.setfEntrega(new Date());
        this.setImporte(0.0f);
        this.setDescripcion(java.util.ResourceBundle.getBundle("Bundle").getString(""));
   }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the fInicio
     */
    public Date getfInicio() {
        return fInicio;
    }

    /**
     * @param fInicio the fInicio to set
     */
    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    /**
     * @return the fEntrega
     */
    public Date getfEntrega() {
        return fEntrega;
    }

    /**
     * @param fEntrega the fEntrega to set
     */
    public void setfEntrega(Date fEntrega) {
        this.fEntrega = fEntrega;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Importe
     */
    public Float getImporte() {
        return Importe;
    }

    /**
     * @param Importe the Importe to set
     */
    public void setImporte(Float Importe) {
        this.Importe = Importe;
    }
}
