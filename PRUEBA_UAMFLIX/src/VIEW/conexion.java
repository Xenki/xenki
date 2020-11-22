
package VIEW;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class conexion extends javax.swing.JFrame {

    //public static final String url = "jdbc:mysql://localhost:3306/adoo?autoReconnect=true&useSSL=false";
    //public static final String url = "jdbc:mysql://localhost:3308/adoouamflix?useTimezone=true&serverTimezone=UTC";
    public static final String user = "root";
    public static final String password = "Chicharito1000";
    private static final String url = "jdbc:mysql://localhost:3306/proyectouamflix"
            + "?useUnicode=true&useJDBCCompliant"
            + "TimezoneShift=true&useLegacyDatetime"
            + "Code=false&serverTimezone=UTC";
    public conexion() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnConectar)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(btnConectar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
       //Connection conexion = getConnection();
       Connection conexion=null;
        try { 
            
            conexion = getConnection();
            PreparedStatement ps;
            ResultSet res;
//            ps = conexion.prepareStatement("SELECT * FROM cliente_cu");
//            res = ps.executeQuery();
//            
//            //imprimir los resultados
//            if(res.next()){
//                JOptionPane.showMessageDialog(null, res.getString("idCliente")+" "+res.getString("Nombre"));
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "No existen datos");
//            }
//            conexion.close();
        }catch (Exception ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_btnConectarActionPerformed
    public static Connection getConnection(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(url, user, password);
            if(conexion!=null)
                  JOptionPane.showMessageDialog(null,"Conexion exitosa");
             //System.out.println("Conexion exitosa");
        }catch(Exception ex){
            System.out.println("HAY UN Error, "+ex);
        }
        return conexion;
    }
    public void close() {
        Connection conn = null;
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
       
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    // End of variables declaration//GEN-END:variables

 
}
