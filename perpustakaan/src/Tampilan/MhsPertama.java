/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

/**
 *
 * @author ASUS
 */
public class MhsPertama extends javax.swing.JFrame {

    /**
     * Creates new form MhsPertama
     */
    public MhsPertama() {
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
        loginmhs = new javax.swing.JButton();
        daftarakunMhs = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Kembali = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        loginmhs.setBackground(new java.awt.Color(44, 62, 80));
        loginmhs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        loginmhs.setText("Login");
        loginmhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginmhsActionPerformed(evt);
            }
        });
        jPanel1.add(loginmhs);
        loginmhs.setBounds(360, 270, 126, 29);

        daftarakunMhs.setBackground(new java.awt.Color(44, 62, 80));
        daftarakunMhs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        daftarakunMhs.setText("Register");
        daftarakunMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarakunMhsActionPerformed(evt);
            }
        });
        jPanel1.add(daftarakunMhs);
        daftarakunMhs.setBounds(360, 230, 126, 29);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("College Student");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 40, 280, 50);

        Kembali.setText("Back");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Kembali);
        Kembali.setBounds(40, 420, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/1222dd.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 860, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginmhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginmhsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginmhsActionPerformed

    private void daftarakunMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarakunMhsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarakunMhsActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

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
            java.util.logging.Logger.getLogger(MhsPertama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MhsPertama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MhsPertama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MhsPertama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MhsPertama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Kembali;
    private javax.swing.JButton daftarakunMhs;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginmhs;
    // End of variables declaration//GEN-END:variables
}
