package popups;

import customComponents.*;
import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author Xenon
 */
public class TambahStaff extends javax.swing.JDialog {

    /**
     * Creates new form TambahPelanggan
     */
    public TambahStaff(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public TambahStaff(){
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

        TambahPelangganPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailField = new CorneredJTextField();
        jLabel2 = new javax.swing.JLabel();
        noTelpField = new javax.swing.JTextField();
        noTelpField = new CorneredJTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatArea = new javax.swing.JTextArea();
        alamatArea = new CorneredJTextArea();
        btnOK = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        posisiField = new javax.swing.JTextField();
        noTelpField = new CorneredJTextField();
        gajiField = new javax.swing.JTextField();
        noTelpField = new CorneredJTextField();
        jLabel6 = new javax.swing.JLabel();
        TitleText1 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        fieldNama = new javax.swing.JTextField();
        fieldNama = new CorneredJTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah Pelanggan");
        setSize(new java.awt.Dimension(400, 550));

        TambahPelangganPanel.setBackground(new java.awt.Color(255, 231, 192));
        TambahPelangganPanel.setPreferredSize(new java.awt.Dimension(400, 550));

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Nama");

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Email");

        noTelpField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noTelpFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                noTelpFieldFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("No Telepon");

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Alamat");

        alamatArea.setColumns(20);
        alamatArea.setRows(5);
        alamatArea.setBorder(null);
        jScrollPane1.setViewportView(alamatArea);
        jScrollPane1.setBorder(null);

        btnOK.setBackground(new java.awt.Color(89, 38, 1));
        btnOK.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btnOK.setForeground(java.awt.Color.white);
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Posisi");

        posisiField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                posisiFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                posisiFieldFocusLost(evt);
            }
        });

        gajiField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gajiFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gajiFieldFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Gaji");

        TitleText1.setBackground(new java.awt.Color(102, 0, 0));
        TitleText1.setFont(new java.awt.Font("Myriad Pro", 0, 36)); // NOI18N
        TitleText1.setForeground(new java.awt.Color(102, 0, 0));
        TitleText1.setText("Tambah Staf");

        btnBatal.setBackground(new java.awt.Color(89, 38, 1));
        btnBatal.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btnBatal.setForeground(java.awt.Color.white);
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        fieldNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNamaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout TambahPelangganPanelLayout = new javax.swing.GroupLayout(TambahPelangganPanel);
        TambahPelangganPanel.setLayout(TambahPelangganPanelLayout);
        TambahPelangganPanelLayout.setHorizontalGroup(
            TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(posisiField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(gajiField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TambahPelangganPanelLayout.createSequentialGroup()
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(noTelpField)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(fieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
                    .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(TitleText1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        TambahPelangganPanelLayout.setVerticalGroup(
            TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TitleText1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(posisiField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gajiField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTelpField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TambahPelangganPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TambahPelangganPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldFocusLost

    private void posisiFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_posisiFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_posisiFieldFocusGained

    private void posisiFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_posisiFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_posisiFieldFocusLost

    private void gajiFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gajiFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_gajiFieldFocusGained

    private void gajiFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gajiFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_gajiFieldFocusLost

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

    private void noTelpFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noTelpFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpFieldFocusLost

    private void noTelpFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noTelpFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpFieldFocusGained

    private void fieldNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNamaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaFocusGained

    private void fieldNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNamaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaFocusLost
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
            java.util.logging.Logger.getLogger(TambahStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahStaff dialog = new TambahStaff(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TambahPelangganPanel;
    private javax.swing.JLabel TitleText1;
    private javax.swing.JTextArea alamatArea;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnOK;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField gajiField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField noTelpField;
    private javax.swing.JTextField posisiField;
    // End of variables declaration//GEN-END:variables
}
