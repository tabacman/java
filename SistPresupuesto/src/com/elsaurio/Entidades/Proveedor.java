/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.comun.Entidades;

/**
 *
 * @author SADRAC
 */
public class Proveedor {

    private int id;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String celular;
    private String email;

    @Override
    public String toString() {
        return nombre + java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Bundle").getString(" - {0}"), new Object[] {domicilio}) ;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public void blanquea() {
        this.id = 0;
        this.nombre = java.util.ResourceBundle.getBundle("Bundle").getString("");
        this.domicilio = java.util.ResourceBundle.getBundle("Bundle").getString("");
        this.telefono = java.util.ResourceBundle.getBundle("Bundle").getString("");
        this.celular = java.util.ResourceBundle.getBundle("Bundle").getString("");
        this.email = java.util.ResourceBundle.getBundle("Bundle").getString("");
    }
        @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof Proveedor)) {
            return false;
        }
        Proveedor proveedor = (Proveedor) o;

        if (id != proveedor.id) {
            return false;
        }
        if (nombre != null ? !nombre.equals(proveedor.getNombre()) : proveedor.getNombre() != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 89 * hash + this.id;
        return hash;
    }

}
