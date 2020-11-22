
package GUIS;

import CONTROLLER.OyenteAutentificacion;
import java.awt.event.ActionListener;

public class Registro extends javax.swing.JFrame {
   OyenteAutentificacion oyenteAutentificacion;
    public Registro() {
        initComponents();
        //oyenteAutentificacion = new OyenteAutentificacion(jButton2);
        //jButton2.addActionListener(oyenteAutentificacion);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(201, 45, 57));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 440));

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 440));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        fondo.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 330, 40));

        jTextField1.setText("jTextField1");
        fondo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 320, 40));

        jTextField2.setText("jTextField1");
        fondo.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 320, 40));

        jTextField3.setText("jTextField1");
        fondo.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 320, 40));

        jLabel2.setText("CONTRASEÑA");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 90, 30));

        jLabel3.setText("      NOMBRE");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 90, 30));

        jLabel4.setText("CORREO");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 90, 30));

        jTextField4.setText("jTextField1");
        fondo.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 320, 40));

        jTextField5.setText("jTextField1");
        fondo.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 320, 40));

        jLabel5.setText("CORREO");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 90, 30));

        jLabel6.setText("CORREO");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 90, 30));

        jLabel7.setText("CORREO");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 90, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(201, 45, 57));
        jButton1.setText("DATOS BANCARIOS");
        fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        jButton2.setText("REGISTRARSE");
        fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
