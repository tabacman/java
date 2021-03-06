package com.elsaurio.presupuestos.Formularios;


import com.elsaurio.presupuestos.Logica.DaoCliente;
import com.elsaurio.presupuestos.Logica.DaoPresupuesto;
import com.elsaurio.presupuestos.Logica.DaoProveedor;
import com.elsaurio.presupuestos.comun.Entidades.Cliente;
import com.elsaurio.presupuestos.comun.Entidades.Presupuesto;
import com.elsaurio.presupuestos.comun.Entidades.Proveedor;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SADRAC
 */
public class FrmIntPresupuesto extends javax.swing.JInternalFrame {

    DaoCliente daoCliente = new DaoCliente();
    DaoProveedor daoProveedor = new DaoProveedor();
    DaoPresupuesto daoPresupuesto = new DaoPresupuesto();
    private Presupuesto unPresupuesto = new Presupuesto();
    
    /**
     * Creates new form FrmIntPresupuesto
     */
    public FrmIntPresupuesto() {
        initComponents();
        jComboClientes.removeAllItems();
        ArrayList <Cliente> resultCli = daoCliente.getList();
        for(int i=0; i<resultCli.size();i++) {
            jComboClientes.addItem((Cliente) resultCli.get(i));
        }
       jComboProveedores.removeAllItems();
        ArrayList <Proveedor> resultPro = daoProveedor.listaProveedores();
        for(int i=0; i<resultPro.size();i++) {
            jComboProveedores.addItem(resultPro.get(i));
        }
//        this.jButtonSigActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboClientes = new javax.swing.JComboBox();
        jComboProveedores = new javax.swing.JComboBox();
        jDateChooserFInicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooserFEntrega = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldImporte = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButtonBorra = new javax.swing.JButton();
        jButtonGraba = new javax.swing.JButton();
        jButtonSig = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonAnt = new javax.swing.JButton();

        setClosable(true);

        jComboClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboProveedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("CLIENTE")); // NOI18N

        jLabel2.setText(bundle.getString("PROVEEDOR")); // NOI18N

        jLabel3.setText(bundle.getString("FECHA PEDIDO")); // NOI18N

        jLabel4.setText(bundle.getString("DESCRIPCION")); // NOI18N

        jLabel5.setText(bundle.getString("IMPORTE")); // NOI18N

        jLabel6.setText(bundle.getString("FECHA ENTREGA")); // NOI18N

        jFormattedTextFieldImporte.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextFieldImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldImporteActionPerformed(evt);
            }
        });

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText(bundle.getString("PRESUPUESTOS")); // NOI18N

        jButtonBorra.setText(bundle.getString("BORRA")); // NOI18N
        jButtonBorra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorraActionPerformed(evt);
            }
        });

        jButtonGraba.setText(bundle.getString("GRABA")); // NOI18N
        jButtonGraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabaActionPerformed(evt);
            }
        });

        jButtonSig.setText(bundle.getString("SIGUIENTE")); // NOI18N
        jButtonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigActionPerformed(evt);
            }
        });

        jButtonNuevo.setText(bundle.getString("NUEVO")); // NOI18N
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonAnt.setText(bundle.getString("ANTERIOR")); // NOI18N
        jButtonAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserFInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, 269, Short.MAX_VALUE)
                                .addComponent(jComboProveedores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(jButtonGraba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBorra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserFInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGraba)
                    .addComponent(jButtonSig)
                    .addComponent(jButtonAnt)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonBorra))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBorraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorraActionPerformed
        // TODO add your handling code here:
        daoPresupuesto.eliminaPresupuesto(unPresupuesto);
        jButtonSigActionPerformed(evt);
    }//GEN-LAST:event_jButtonBorraActionPerformed

    private void jButtonGrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabaActionPerformed
        // TODO add your handling code here:
        unPresupuesto.setCliente( (Cliente) this.jComboClientes.getSelectedItem());
        unPresupuesto.setProveedor( (Proveedor) this.jComboProveedores.getSelectedItem());
        unPresupuesto.setfInicio(this.jDateChooserFInicio.getDate());
        unPresupuesto.setfEntrega(this.jDateChooserFEntrega.getDate());
        unPresupuesto.setImporte((Float) this.jFormattedTextFieldImporte.getValue());
        unPresupuesto.setDescripcion(this.jTextAreaDescripcion.getText());
        if (0 == unPresupuesto.getId()) {
            daoPresupuesto.agregaPresupuesto(unPresupuesto);
        } else {
            daoPresupuesto.modificaPresupuesto(unPresupuesto);
        }
    }//GEN-LAST:event_jButtonGrabaActionPerformed

    private void jButtonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigActionPerformed
        // TODO add your handling code here:
        unPresupuesto = daoPresupuesto.nextPresupuesto(unPresupuesto);
        muestraPresupuesto();
    }//GEN-LAST:event_jButtonSigActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        unPresupuesto.blanquea();
        muestraPresupuesto();
        //jButtonGrabaActionPerformed(evt);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAntActionPerformed
        // TODO add your handling code here:
        unPresupuesto = daoPresupuesto.prevPresupuesto(unPresupuesto);
        muestraPresupuesto();
    }//GEN-LAST:event_jButtonAntActionPerformed

    private void jFormattedTextFieldImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldImporteActionPerformed

    private void muestraPresupuesto() {
        this.jComboClientes.setSelectedItem(unPresupuesto.getCliente());
        this.jComboProveedores.setSelectedItem(unPresupuesto.getProveedor());
        this.jDateChooserFInicio.setDate(unPresupuesto.getfInicio());
        this.jDateChooserFEntrega.setDate(unPresupuesto.getfEntrega());
        this.jFormattedTextFieldImporte.setValue(unPresupuesto.getImporte());
        this.jTextAreaDescripcion.setText(unPresupuesto.getDescripcion());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnt;
    private javax.swing.JButton jButtonBorra;
    private javax.swing.JButton jButtonGraba;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSig;
    private javax.swing.JComboBox jComboClientes;
    private javax.swing.JComboBox jComboProveedores;
    private com.toedter.calendar.JDateChooser jDateChooserFEntrega;
    private com.toedter.calendar.JDateChooser jDateChooserFInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldImporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    // End of variables declaration//GEN-END:variables
}
