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
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DsnDaftar extends javax.swing.JFrame {

    /**
     * Creates new form DsnDaftar
     */
    public DsnDaftar() {
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

        Kembali = new javax.swing.JToggleButton();
        Daftar = new javax.swing.JToggleButton();
        JUdul = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        NamaDosen = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        nipdosen = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        alamatDosen = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        teleponDosen = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Kembali.setText("Back");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali);
        Kembali.setBounds(30, 420, 90, 23);

        Daftar.setText("Register");
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });
        getContentPane().add(Daftar);
        Daftar.setBounds(680, 420, 105, 23);

        JUdul.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        JUdul.setForeground(new java.awt.Color(255, 255, 255));
        JUdul.setText("Account Register Form");
        getContentPane().add(JUdul);
        JUdul.setBounds(280, 30, 360, 42);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 200, 5, 17);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Alamat");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(250, 200, 62, 17);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(":");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(340, 170, 5, 17);

        NamaDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaDosenActionPerformed(evt);
            }
        });
        getContentPane().add(NamaDosen);
        NamaDosen.setBounds(380, 170, 180, 20);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nama");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(250, 170, 62, 17);
        getContentPane().add(nipdosen);
        nipdosen.setBounds(380, 140, 180, 20);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("NIP");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(250, 140, 62, 17);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(":");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(340, 140, 5, 17);
        getContentPane().add(alamatDosen);
        alamatDosen.setBounds(380, 200, 180, 20);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("No Telepon");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(250, 230, 80, 17);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(":");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(340, 230, 5, 17);
        getContentPane().add(teleponDosen);
        teleponDosen.setBounds(380, 230, 180, 20);
        getContentPane().add(background);
        background.setBounds(0, 0, 860, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarActionPerformed
        // TODO add your handling code here:
        int NIP = Integer.parseInt(nipdosen.getText());
        String Nama = NamaDosen.getText();
        String Alamat = alamatDosen.getText();
        int NoTelepon = Integer.parseInt(teleponDosen.getText());
        
        try{
            java.sql.Connection con = (Connection) dbConnection.dbConnection();
            Statement statement= con.createStatement();
            String insert = "INSERT INTO `dosen` VALUES ('"+NIP+"','"+Nama+"','" + Alamat +"', '"+NoTelepon+"')"; 
            statement.executeUpdate(insert);
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
    } 
       
        
    }//GEN-LAST:event_DaftarActionPerformed

    private void NamaDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaDosenActionPerformed

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
            java.util.logging.Logger.getLogger(DsnDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DsnDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DsnDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DsnDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DsnDaftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Daftar;
    private javax.swing.JLabel JUdul;
    private javax.swing.JToggleButton Kembali;
    private javax.swing.JTextField NamaDosen;
    private javax.swing.JTextField alamatDosen;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nipdosen;
    private javax.swing.JTextField teleponDosen;
    // End of variables declaration//GEN-END:variables
}