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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class CariBuku extends javax.swing.JFrame {

    /**
     * Creates new form DsnCarubuku
     */
    public CariBuku() {
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

        Cari = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelcari = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Cari.setBackground(new java.awt.Color(204, 204, 204));
        Cari.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Cari.setText("Search");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });
        getContentPane().add(Cari);
        Cari.setBounds(360, 120, 69, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 50, 5, 53);
        getContentPane().add(textcari);
        textcari.setBounds(300, 60, 203, 30);

        tabelcari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelcari);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 152, 710, 260);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 50, 80, 53);

        Kembali.setBackground(new java.awt.Color(204, 204, 204));
        Kembali.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Kembali.setText("Back");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali);
        Kembali.setBounds(30, 420, 57, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/1222dd.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 850, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Judul");
            model.addColumn("Kategori");
            model.addColumn("Pengarang");
            model.addColumn("Penerbit");
            model.addColumn("tahun_terbit");
            String querycari = textcari.getText();
            
            try{
                String sql = "SELECT * FROM buku WHERE judul_buku like '%" +querycari+"'";
                java.sql.Connection kon = (Connection)dbConnection.dbConnection();
                java.sql.Statement stat = kon.createStatement();
                java.sql.ResultSet res = stat.executeQuery(sql);
                
                while (res.next()){
                    model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4), res.getString(5), res.getString(6)});
                }   
                
                tabelcari.setModel(model);
     
            }catch (SQLException e){
                System.out.println("error : " + e.getMessage());
            }
        
    }//GEN-LAST:event_CariActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        TampilanPengunjung a = new TampilanPengunjung();
        a.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_KembaliActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(CariBuku.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CariBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cari;
    private javax.swing.JButton Kembali;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelcari;
    private javax.swing.JTextField textcari;
    // End of variables declaration//GEN-END:variables
}
