/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.OyenteCliente;
import CONTROLLER.OyenteEditor;
import java.awt.event.ActionListener;

public class menuCU extends javax.swing.JFrame {
    OyenteEditor oe;
    OyenteCliente oc;
    public menuCU() {
        initComponents();
        //Registro reg = new Registro();
        //reg.setVisible(false);
        //boton serie
        oc =  new OyenteCliente(this, jButton1);
        jButton1.addActionListener(oc);
        //boton regresar
        oe =  new OyenteEditor(this,jButton4);
        jButton4.addActionListener(oe);
        
        setLocationRelativeTo(null); //ventana en medio de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        imagenMenu = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        colorBarraMenu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        proyecto = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        pagos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));

        jPanel3.setBackground(new java.awt.Color(245, 45, 57));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jButton2.setText("jButton2");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jButton3.setText("jButton3");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        imagenMenu.setBackground(new java.awt.Color(245, 45, 57));
        imagenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/menuCliente.png"))); // NOI18N
        imagenMenu.setText("jLabel1");
        jPanel3.add(imagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 530, 430));

        jButton4.setText("REGRESAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        colorBarraMenu.setBackground(new java.awt.Color(201, 45, 57));
        colorBarraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        colorBarraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        colorBarraMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 252, 40));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        colorBarraMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 56, 252, -1));

        proyecto.setText("PROYECTO");
        proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proyectoActionPerformed(evt);
            }
        });
        colorBarraMenu.add(proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 50));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        colorBarraMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 127, 252, 60));

        pagos.setText("INFORMAME DE PAGOS");
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        colorBarraMenu.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/USER.png"))); // NOI18N
        colorBarraMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 120));

        jLabel2.setText("ACCEDIO COMO CLIENTE UNIVERSITARIO");
        colorBarraMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTENIDO MULTIMEDIA");
        colorBarraMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 210, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(colorBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(colorBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proyectoActionPerformed

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel colorBarraMenu;
    private javax.swing.JLabel imagenMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton pagos;
    private javax.swing.JButton proyecto;
    // End of variables declaration//GEN-END:variables
}
