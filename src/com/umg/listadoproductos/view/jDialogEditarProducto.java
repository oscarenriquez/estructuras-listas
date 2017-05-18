/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.listadoproductos.view;

import com.umg.listadoproductos.controller.ListadoProductosController;
import com.umg.listadoproductos.model.Producto;
import java.awt.HeadlessException;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
//import java.text.DecimalFormat;

/**
 *
 * @author UMG - Progra 3 - Seccion A - Grupo 3
 */
public class jDialogEditarProducto extends javax.swing.JDialog {

    private ListadoProductosController ctrl;
    private Integer posicion;
    //private DecimalFormat df;

    public jDialogEditarProducto(java.awt.Frame parent, boolean modal, Producto producto, Integer posicion) {
        super(parent, modal);
        initComponents();
        ctrl = ListadoProductosController.getInstance();
        //df = new DecimalFormat("###,###,###.0#");

        this.posicion = posicion;
        
        textPosicion.setText(posicion.toString());
        textCodigo.setText(producto.getCodigo().toString());
        textNombre.setText(producto.getNombre());
        textMarca.setText(producto.getMarca());
        textPrecio.setText(producto.getPrecio().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textPosicion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        btnCmdGuardarProducto = new javax.swing.JButton();
        btnCmdLImpiarProducto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Producto");
        setModal(true);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Posición:");

        textPosicion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Código:");

        textCodigo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        textNombre.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Marca:");

        textMarca.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Precio:");

        textPrecio.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        textPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnCmdGuardarProducto.setBackground(new java.awt.Color(51, 255, 51));
        btnCmdGuardarProducto.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnCmdGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/listadoproductos/resources/Actualizar.png"))); // NOI18N
        btnCmdGuardarProducto.setText("Actualizar");
        btnCmdGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCmdGuardarProductoActionPerformed(evt);
            }
        });

        btnCmdLImpiarProducto.setBackground(new java.awt.Color(255, 51, 51));
        btnCmdLImpiarProducto.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnCmdLImpiarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/listadoproductos/resources/delete.png"))); // NOI18N
        btnCmdLImpiarProducto.setText("Eliminar");
        btnCmdLImpiarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCmdLImpiarProductoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel6.setText("Actualizar Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCmdGuardarProducto)
                                .addGap(18, 18, 18)
                                .addComponent(btnCmdLImpiarProducto)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textCodigo)
                                            .addComponent(textPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel5)
                                                .addGap(38, 38, 38)
                                                .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(42, 42, 42))))
                    .addComponent(jSeparator1)))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCmdGuardarProducto)
                    .addComponent(btnCmdLImpiarProducto))
                .addContainerGap())
        );

        textPrecio.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCmdGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCmdGuardarProductoActionPerformed
        try {
            Producto producto = new Producto();
            producto.setCodigo(Integer.parseInt(textCodigo.getText()));
            producto.setNombre(textNombre.getText());
            producto.setMarca(textMarca.getText());
            producto.setPrecio(new BigDecimal(textPrecio.getText()));

            Integer nuevaPosicion = Integer.parseInt(textPosicion.getText());
            
            if(!this.posicion.equals(nuevaPosicion))
                ctrl.EliminarProducto(this.posicion);
                        
            ctrl.AgregarProducto(nuevaPosicion, producto);
                        
            this.dispose();
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e + "\nValor ingresado es invalido", "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCmdGuardarProductoActionPerformed

    private void btnCmdLImpiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCmdLImpiarProductoActionPerformed
        ctrl.EliminarProducto(this.posicion);
        this.dispose();
    }//GEN-LAST:event_btnCmdLImpiarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCmdGuardarProducto;
    private javax.swing.JButton btnCmdLImpiarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPosicion;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}
