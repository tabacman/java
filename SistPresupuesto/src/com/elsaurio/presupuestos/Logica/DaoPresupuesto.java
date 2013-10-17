/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.Logica;

import com.elsaurio.presupuestos.Datos.DBdaoPresupuesto;
import com.elsaurio.presupuestos.comun.Entidades.Presupuesto;
import com.elsaurio.presupuestos.comun.Interfaces.IdaoPresupuesto;
import java.util.ArrayList;

/**
 *
 * @author SADRAC
 */
public class DaoPresupuesto implements IdaoPresupuesto {

    private DBdaoPresupuesto daoPresupuesto = new DBdaoPresupuesto();

    public DaoPresupuesto() {
    }

    /**
     *
     * @param producto
     */
    @Override
    public void agregaPresupuesto(Presupuesto unPresupuesto) {
        daoPresupuesto.agregaPresupuesto(unPresupuesto);
    }

    /**
     *
     * @param codigo
     */
    @Override
    public void eliminaPresupuesto(Presupuesto unPresupuesto) {
        daoPresupuesto.eliminaPresupuesto(unPresupuesto);
    }

    @Override
    public void modificaPresupuesto(Presupuesto unPresupuesto) {
        daoPresupuesto.modificaPresupuesto(unPresupuesto);
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Presupuesto> listaPresupuestos() {
        return daoPresupuesto.listaPresupuestos();
    }

    @Override
    public Presupuesto nextPresupuesto(Presupuesto unPresupuesto) {
        return daoPresupuesto.nextPresupuesto(unPresupuesto);
    }

    @Override
    public Presupuesto prevPresupuesto(Presupuesto unPresupuesto) {
        return daoPresupuesto.prevPresupuesto(unPresupuesto);
    }
}
