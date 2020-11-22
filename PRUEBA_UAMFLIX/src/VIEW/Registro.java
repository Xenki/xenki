
package VIEW;
import MODEL.GestorPago.*;
import CONTROLLER.OyenteAutentificacion;
import MODEL.GestorAutentificacion.gestorAutentificacion;
import MODEL.GestorPersonalCliente.Cliente;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
    OyenteAutentificacion oyenteAutentificacion;
    //para la gui inicio sesion, que decide registrarse
   public Registro() {
        initComponents(); //crea y registra
        setLocationRelativeTo(null); //ventana en medio de la pantalla
        //boton registrarse
       // oyenteAutentificacion = new OyenteAutentificacion(this,jButton3,jButton2);  
        //jButton2.addActionListener(oyenteAutentificacion);
        //regresar
        oyenteAutentificacion =  new OyenteAutentificacion(this,jButton3);
        jButton3.addActionListener(oyenteAutentificacion);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        nombre = new javax.swing.JTextField();
        tarjeta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nickname = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        matricula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Telefono1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(201, 45, 57));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(201, 45, 57));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 280, 410));

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 280, 390));

        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        fondo.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 320, 40));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        fondo.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 320, 40));

        tarjeta.setText("568896666");
        fondo.add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 320, 40));

        jLabel2.setText("NUMERO TARJETA");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 90, 30));

        jLabel4.setText("NOMBRE");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 90, 30));
        fondo.add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 320, 40));

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        fondo.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 320, 40));

        jLabel5.setText("NICKNAME");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 90, 30));

        jLabel6.setText("CORREO");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 90, 30));

        jLabel7.setText("TELEFONO");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 90, 30));

        jButton2.setText("REGISTRARSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jButton3.setText("REGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        fondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));
        fondo.add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 320, 40));

        jLabel8.setText("MATRICULA");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 90, 30));
        fondo.add(Telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 320, 40));

        jLabel3.setText("CONTRASEÑA");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

  //boton registrarse
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       Cliente cliente =  new Cliente();
        TarjetaCredito tj = new TarjetaCredito();
        gestorAutentificacion ga =  new gestorAutentificacion();
        String contraseña =  new String(contrasena.getPassword());//para convertirlo en string
        if(tarjeta.getText().equals("")||contrasena.getText().equals("")||correo.getText().equals("")||nickname.getText().equals("")||nombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor rellene todos los campos");
        }
        else{
            //duda: como hacer un set para cliente, que sea numTarjeta
            //JOptionPane.showMessageDialog(null,"campos llenados");
            
           //TarjetaCredito tar = null;
           //ga.registrar(cliente);
            cliente.setNombre(nombre.getText());
            cliente.setIdCliente(matricula.getText());
            cliente.setContraseña(contrasena.getText());
            cliente.setCorreo(nombre.getText());
            cliente.setNickname(nickname.getText());
            cliente.setEstatusCliente(true);
            cliente.setEstatusBeca(true);
            //tar.setNumeroTarjeta(tarjeta.getText());
            // no entra 
            if(ga.registrar(cliente)){
                JOptionPane.showMessageDialog(null,"Cliente registrado");    
            }
            //unico cambio
            else{
                JOptionPane.showMessageDialog(null,"No se registro");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Telefono1;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JTextField correo;
    private javax.swing.JPanel fondo;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField nickname;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tarjeta;
    // End of variables declaration//GEN-END:variables
}
