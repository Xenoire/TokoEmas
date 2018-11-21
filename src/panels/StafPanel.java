package panels;

/**
 *
 * @author Xenon
 */
import CustomJTables.CustomTableCellRenderer;
import POJO.Staf;
import customComponents.*;
import database.Controller;
import static database.Controller.getAllStaf;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import popups.EditStaf;
import popups.TambahStaff;

public class StafPanel extends javax.swing.JPanel {

    /**
     * Creates new form Staff
     */
    private TableModel stafModel;
    private TableRowSorter<TableModel> rowFilter;

    public StafPanel() {
        initComponents();

        buttonUbah.setEnabled(false);
        stafModel = tableStaf.getModel();

        ListSelectionModel lsm = tableStaf.getSelectionModel();
        lsm.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    buttonUbah.setEnabled(true);
                }
            }
        });

        setUpRowFilter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        TitleText = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStaf = new javax.swing.JTable();
        fieldCari = new javax.swing.JTextField();
        fieldCari = new CorneredJTextField();
        jlabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        timeText = new javax.swing.JLabel();
        buttonUbah = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBackground(new java.awt.Color(255, 231, 192));
        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(980, 720));

        TitleText.setBackground(new java.awt.Color(102, 0, 0));
        TitleText.setFont(new java.awt.Font("Myriad Pro", 0, 36)); // NOI18N
        TitleText.setForeground(new java.awt.Color(102, 0, 0));
        TitleText.setText("Staf");

        buttonTambah.setBackground(new java.awt.Color(89, 38, 1));
        buttonTambah.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        buttonTambah.setForeground(java.awt.Color.white);
        buttonTambah.setText("Tambah Staf");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        tableStaf.setDefaultRenderer(Object.class, new CustomTableCellRenderer());
        jScrollPane1.setViewportView(tableStaf);
        tableStaf.setModel(getAllStaf());
        tableStaf.setCellSelectionEnabled(false);
        tableStaf.setRowSelectionAllowed(true);
        tableStaf.setColumnSelectionAllowed(false);
        jScrollPane1.setViewportView(tableStaf);

        fieldCari.setForeground(java.awt.Color.gray);
        fieldCari.setText("Ketik pencarian");
        fieldCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCariFocusLost(evt);
            }
        });
        fieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCariActionPerformed(evt);
            }
        });

        jlabel.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jlabel.setForeground(new java.awt.Color(102, 0, 0));
        jlabel.setText("Cari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dateText.setBackground(new java.awt.Color(102, 0, 0));
        dateText.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        dateText.setForeground(new java.awt.Color(102, 0, 0));
        dateText.setText("<DD-MM-YYYY>");

        timeText.setBackground(new java.awt.Color(102, 0, 0));
        timeText.setFont(new java.awt.Font("Myriad Pro", 0, 36)); // NOI18N
        timeText.setForeground(new java.awt.Color(102, 0, 0));
        timeText.setText("<TIME>");

        buttonUbah.setBackground(new java.awt.Color(89, 38, 1));
        buttonUbah.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        buttonUbah.setForeground(java.awt.Color.white);
        buttonUbah.setText("Ubah Staff");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitleText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dateText)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(timeText)
                                .addGap(26, 26, 26))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(buttonTambah)
                                .addGap(18, 18, 18)
                                .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlabel)
                                .addGap(14, 14, 14)
                                .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(TitleText)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateText)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setUpRowFilter() {
        rowFilter = new TableRowSorter<>(tableStaf.getModel());
        tableStaf.setRowSorter(rowFilter);
        fieldCari.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String text = fieldCari.getText();
                if (!text.equalsIgnoreCase("Ketik pencarian")) {
                    if (text.trim().length() == 0) {
                        rowFilter.setRowFilter(null);
                    } else {
                        rowFilter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                    }
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String text = fieldCari.getText();
                if (!text.equalsIgnoreCase("Ketik pencarian")) {
                    if (text.trim().length() == 0) {
                        rowFilter.setRowFilter(null);
                    } else {
                        rowFilter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                    }
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

    private void fieldCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCariFocusGained
        if (fieldCari.getText().equals("Ketik pencarian")) {
            fieldCari.setText("");
            fieldCari.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_fieldCariFocusGained

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        JDialog tambahStaf = new TambahStaff();
        tambahStaf.setLocationRelativeTo(this);
        tambahStaf.setVisible(true);
        tambahStaf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                tableStaf.setModel(getAllStaf());
                setUpRowFilter();
            }
        });
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void fieldCariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCariFocusLost
        if (fieldCari.getText().equals("")) {
            fieldCari.setText("Ketik pencarian");
            fieldCari.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_fieldCariFocusLost

    private void fieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCariActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
       if (tableStaf.getSelectedRow() > -1) {

            int selectedRow = tableStaf.getSelectedRow();
            int modelRow = tableStaf.convertRowIndexToModel(selectedRow);

            int id = Integer.valueOf(String.valueOf(stafModel.getValueAt(modelRow, 0)));
            System.out.println("Id :" + id);

            String nama = (String) stafModel.getValueAt(modelRow, 1);
            String email = (String) stafModel.getValueAt(modelRow, 2);
            String alamat = (String) stafModel.getValueAt(modelRow, 3);
            String no_telp = (String) stafModel.getValueAt(modelRow, 4);
            int gaji = Integer.valueOf(String.valueOf(stafModel.getValueAt(modelRow, 5)));
            String posisi = (String) stafModel.getValueAt(modelRow, 6);
            int reward = Integer.valueOf(String.valueOf(stafModel.getValueAt(modelRow, 7)));
            String deskripsi_reward = (String) stafModel.getValueAt(modelRow, 8);

            Staf staf = new Staf(id, gaji, reward, nama, email, alamat, no_telp, posisi, deskripsi_reward);

            JDialog editStaf = new EditStaf(staf);
            editStaf.setLocationRelativeTo(this);
            editStaf.setVisible(true);

            editStaf.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent we) {
                    tableStaf.setModel(getAllStaf());
                    setUpRowFilter();
                }
            });
        }
    }//GEN-LAST:event_buttonUbahActionPerformed

    public static void main(String args[]) {
        JFrame a = new JFrame();
        Controller con = new Controller();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StafPanel panel = new StafPanel();
        //a.setPreferredSize(dialog.getPreferredSize());
        a.setSize(panel.getPreferredSize());
        a.setContentPane(panel);
        a.setVisible(true);
        System.out.println("Width : " + a.getWidth());
        System.out.println("Height : " + a.getHeight());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleText;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JLabel dateText;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTable tableStaf;
    private javax.swing.JLabel timeText;
    // End of variables declaration//GEN-END:variables
}
