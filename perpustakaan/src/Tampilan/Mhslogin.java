/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import java.sql.Connection;
import java.sql.Statement;
import mainclass.dbConnection;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Mhslogin extends javax.swing.JFrame {

    /**
     * Creates new form Mhslogin
     */
    public Mhslogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        nim = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Kembali = new javax.swing.JToggleButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(626, 395));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 140, 5, 53);
        jPanel1.add(nama);
        nama.setBounds(320, 160, 203, 20);

        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });
        jPanel1.add(nim);
        nim.setBounds(320, 210, 204, 20);

        login.setBackground(new java.awt.Color(44, 62, 80));
        login.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(360, 270, 110, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(":");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 190, 5, 53);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 140, 87, 53);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("College Student Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 20, 350, 69);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIM");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 190, 87, 53);

        Kembali.setText("Back");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Kembali);
        Kembali.setBounds(30, 430, 80, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/1222dd.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(-30, 0, 852, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
            try {
            String Nama = nama.getText();
            int NIM = Integer.parseInt(nim.getText());
            Connection con = (Connection) dbConnection.dbConnection();
            Statement stm = con.createStatement();
            String sql = "Select * from mahasiswa WHERE nama_mhs = '"+Nama+"' And nim = '"+NIM+"'";
            ResultSet res = stm.executeQuery(sql);
        if (res.next()){
            if (nim.getText().equals(res.getString("nim"))){

            }else{
                
                nim.setText("");
                nim.requestFocus();
            }
        DsnCaribuku a = new DsnCaribuku();
        a.setVisible(true);
        this.dispose();
        }else{
              System.out.println("login gagal");
              JOptionPane.showMessageDialog(rootPane, "Password salah, silahkan coba lagi");
        }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Mhslogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mhslogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mhslogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mhslogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mhslogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Kembali;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField nim;
    // End of variables declaration//GEN-END:variables
}
