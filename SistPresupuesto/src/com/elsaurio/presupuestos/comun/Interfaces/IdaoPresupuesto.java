/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsaurio.presupuestos.comun.Interfaces;

import com.elsaurio.presupuestos.comun.Entidades.Presupuesto;
import java.util.ArrayList;

/**
 *
 * @author SADRAC
 */
public interface IdaoPresupuesto {

    public void agregaPresupuesto(Presupuesto unPresupuesto);

    public void eliminaPresupuesto(Presupuesto unPresupuesto);

    public void modificaPresupuesto(Presupuesto unPresupuesto);

    public Presupuesto nextPresupuesto(Presupuesto unPresupuesto);

    public Presupuesto prevPresupuesto(Presupuesto unPresupuesto);

    public ArrayList<Presupuesto> listaPresupuestos();
}