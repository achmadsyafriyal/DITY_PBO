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
public class adminPinjamBuku extends javax.swing.JFrame {

    /**
     * Creates new form adminbuku
     */
    public adminPinjamBuku() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textnama = new javax.swing.JTextField();
        textalamat = new javax.swing.JTextField();
        textkontak = new javax.swing.JTextField();
        textkatagori = new javax.swing.JTextField();
        textjudul = new javax.swing.JTextField();
        texttanggal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(772, 440));
        jPanel1.setLayout(null);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Contact", "Category", "Title", "Date"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 120, 452, 190);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Borrow Form");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 20, 326, 57);

        simpan.setText("Save");
        jPanel1.add(simpan);
        simpan.setBounds(390, 330, 57, 23);

        batal.setText("Cencel");
        jPanel1.add(batal);
        batal.setBounds(640, 330, 70, 23);

        hapus.setText("Delete");
        jPanel1.add(hapus);
        hapus.setBounds(550, 330, 63, 23);

        tambah.setText("Add");
        jPanel1.add(tambah);
        tambah.setBounds(320, 330, 51, 23);

        edit.setText("Edit");
        jPanel1.add(edit);
        edit.setBounds(470, 330, 51, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 120, 35, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 160, 50, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 200, 50, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 240, 60, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 320, 40, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Title");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 280, 28, 17);
        jPanel1.add(textnama);
        textnama.setBounds(100, 120, 180, 20);
        jPanel1.add(textalamat);
        textalamat.setBounds(100, 160, 180, 20);
        jPanel1.add(textkontak);
        textkontak.setBounds(100, 200, 180, 20);
        jPanel1.add(textkatagori);
        textkatagori.setBounds(100, 240, 180, 20);
        jPanel1.add(textjudul);
        textjudul.setBounds(100, 280, 180, 20);
        jPanel1.add(texttanggal);
        texttanggal.setBounds(100, 320, 180, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(":");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 120, 5, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(":");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 165, 5, 10);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(":");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(80, 320, 5, 25);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(80, 200, 5, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(":");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(80, 240, 5, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(":");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(80, 280, 5, 25);

        kembali.setText("Back");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(kembali);
        kembali.setBounds(40, 420, 55, 23);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\1222dd.jpg")); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 850, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(adminPinjamBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPinjamBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPinjamBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPinjamBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPinjamBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton batal;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField textalamat;
    private javax.swing.JTextField textjudul;
    private javax.swing.JTextField textkatagori;
    private javax.swing.JTextField textkontak;
    private javax.swing.JTextField textnama;
    private javax.swing.JTextField texttanggal;
    // End of variables declaration//GEN-END:variables
}
