package popups;

import POJO.KategoriData;
import POJO.Produk;
import POJO.SupplierData;
import customComponents.*;
import database.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Properties;
import javax.swing.JFrame;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import static database.Controller.*;
import java.awt.event.ItemEvent;
import java.sql.Date;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Xenon
 */
public class TambahProduk extends javax.swing.JDialog {

    /**
     * Creates new form TambahPelanggan
     */
    private JDatePickerImpl datePicker;
    private Hashtable kategori;
    private Hashtable supplier;

    public TambahProduk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initHashtable();
        initComponents();
        initDatePicker();
        this.setTitle("Tambah Produk");
    }

    public TambahProduk() {
        
        initHashtable();
        initComponents();
        initDatePicker();
        this.setTitle("Tambah Produk");
        
                //Combo box listener
        comboKarat.addItemListener((ItemEvent ie) -> {
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                if (ie.getItem().equals("-- Tambah Karat --")) {
                    try {
                        double karatBaru = Double.valueOf(JOptionPane.showInputDialog("Input karat :"));
                        if (karatBaru != 0) {
                            addKarat(karatBaru);
                            comboKarat.setModel(getKarat());
                            comboKarat.setSelectedItem(karatBaru);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this, "Silahkan input angka", "Perhatian", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        
    }

    private void initDatePicker() {
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.getModel().setSelected(true);
        dateContainer.setLayout(new BorderLayout());
        dateContainer.add(datePicker);
        this.setFocusable(true);
    }

    private void initHashtable() {
        supplier = new Hashtable();
        Vector supplierV = getAllSupplier();
        for (Object object : supplierV) {
            SupplierData temp = (SupplierData) object;
            supplier.put(temp.getNama(), temp.getId());
        }

        kategori = new Hashtable();
        Vector kategoriV = getKategori();
        for (Object object : kategoriV) {
            KategoriData temp = (KategoriData) object;
            kategori.put(temp.getNama(), temp.getId());
        }

    }

    private void tambahProduk() {
        int id = 1;
       
        int idKategori = (int) kategori.get(comboKategori.getSelectedItem());
        int idSupplier = (int) supplier.get(comboSupplier.getSelectedItem());
        Double karatD = (Double) comboKarat.getSelectedItem();
        int karat = karatD.intValue();
        int hargaBeli = Integer.parseInt(fieldHarga.getText());
        String nama = fieldNamaProduk.getText();
        String deskripsi = textAreaDeskripsiProduk.getText();
        String status = "INSTOCK";
        String tipeBarang = fieldJenis.getText();
        double berat = Double.parseDouble(spinnerBerat.getValue().toString());

        java.util.Date foundDateUtil = (java.util.Date) datePicker.getModel().getValue();
        Instant instant = foundDateUtil.toInstant();
        ZoneId zoneId = ZoneId.of("Asia/Ho_Chi_Minh");
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zoneId);
        LocalDate foundDate = zdt.toLocalDate();

        Date tanggalBeli = Date.valueOf(foundDate);

        Produk produk = new Produk(idKategori, idSupplier, karat, hargaBeli, nama, deskripsi, status, tipeBarang, berat, tanggalBeli);

        addProduk(produk);
        
        this.dispose();
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
        TitleText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fieldNamaProduk = new javax.swing.JTextField();
        fieldNamaProduk = new CorneredJTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDeskripsiProduk = new javax.swing.JTextArea();
        textAreaDeskripsiProduk = new CorneredJTextArea();
        tambahButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        spinnerBerat = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboSupplier = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboKategori = new javax.swing.JComboBox<>();
        dateContainer = new javax.swing.JPanel();
        comboKarat = new javax.swing.JComboBox<>();
        fieldHarga = new javax.swing.JTextField();
        fieldHarga = new CorneredJTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldJenis = new javax.swing.JTextField();
        fieldJenis = new CorneredJTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah Pelanggan");
        setSize(new java.awt.Dimension(400, 550));

        TambahPelangganPanel.setBackground(new java.awt.Color(255, 231, 192));
        TambahPelangganPanel.setPreferredSize(new java.awt.Dimension(400, 550));

        TitleText.setBackground(new java.awt.Color(102, 0, 0));
        TitleText.setFont(new java.awt.Font("Myriad Pro", 0, 36)); // NOI18N
        TitleText.setForeground(new java.awt.Color(102, 0, 0));
        TitleText.setText("Tambah Produk");

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Tanggal Beli");

        fieldNamaProduk.setForeground(java.awt.Color.gray);
        fieldNamaProduk.setText("Masukan nama produk.");
        fieldNamaProduk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldNamaProdukFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNamaProdukFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Nama Produk");

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Deskripsi Produk");

        textAreaDeskripsiProduk.setColumns(20);
        textAreaDeskripsiProduk.setForeground(java.awt.Color.gray);
        textAreaDeskripsiProduk.setRows(5);
        textAreaDeskripsiProduk.setText("Masukan deskripsi produk.");
        textAreaDeskripsiProduk.setBorder(null);
        textAreaDeskripsiProduk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textAreaDeskripsiProdukFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textAreaDeskripsiProdukFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(textAreaDeskripsiProduk);
        jScrollPane1.setBorder(null);

        tambahButton.setBackground(new java.awt.Color(89, 38, 1));
        tambahButton.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        tambahButton.setForeground(java.awt.Color.white);
        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Berat:");

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Karat:");

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("gram");

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Kategori:");

        comboSupplier.setModel(getSupplierComboBoxModel());

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("Supplier:");

        comboKategori.setModel(getKategoriComboBoxModel());

        javax.swing.GroupLayout dateContainerLayout = new javax.swing.GroupLayout(dateContainer);
        dateContainer.setLayout(dateContainerLayout);
        dateContainerLayout.setHorizontalGroup(
            dateContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dateContainerLayout.setVerticalGroup(
            dateContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        comboKarat.setModel(getKarat());

        fieldHarga.setForeground(java.awt.Color.gray);
        fieldHarga.setText("Masukan Harga.");
        fieldHarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldHargaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldHargaFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Harga");

        fieldJenis.setForeground(java.awt.Color.gray);
        fieldJenis.setText("Masukan jenis.");
        fieldJenis.setBorder(null);
        fieldJenis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldJenisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldJenisFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Jenis Emas");

        javax.swing.GroupLayout TambahPelangganPanelLayout = new javax.swing.GroupLayout(TambahPelangganPanel);
        TambahPelangganPanel.setLayout(TambahPelangganPanelLayout);
        TambahPelangganPanelLayout.setHorizontalGroup(
            TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahPelangganPanelLayout.createSequentialGroup()
                        .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(11, 11, 11)
                        .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboKarat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                                .addComponent(spinnerBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahPelangganPanelLayout.createSequentialGroup()
                        .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahPelangganPanelLayout.createSequentialGroup()
                                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(60, 60, 60)))
                                .addGap(67, 67, 67)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahPelangganPanelLayout.createSequentialGroup()
                                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                    .addComponent(fieldJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldNamaProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(TitleText)
                                        .addComponent(jLabel1)
                                        .addComponent(dateContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        TambahPelangganPanelLayout.setVerticalGroup(
            TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahPelangganPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TitleText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spinnerBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TambahPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboKarat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TambahPelangganPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TambahPelangganPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNamaProdukFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNamaProdukFocusGained
        if (fieldNamaProduk.getText().equals("Masukan nama produk.")) {
            fieldNamaProduk.setText("");
            fieldNamaProduk.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_fieldNamaProdukFocusGained

    private void fieldNamaProdukFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNamaProdukFocusLost
        if (fieldNamaProduk.getText().equals("")) {
            fieldNamaProduk.setText("Masukan nama produk.");
            fieldNamaProduk.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_fieldNamaProdukFocusLost

    private void textAreaDeskripsiProdukFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAreaDeskripsiProdukFocusGained
        if (textAreaDeskripsiProduk.getText().equals("Masukan deskripsi produk.")) {
            textAreaDeskripsiProduk.setText("");
            textAreaDeskripsiProduk.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textAreaDeskripsiProdukFocusGained

    private void textAreaDeskripsiProdukFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAreaDeskripsiProdukFocusLost
        if (textAreaDeskripsiProduk.getText().equals("")) {
            textAreaDeskripsiProduk.setText("Masukan deskripsi produk.");
            textAreaDeskripsiProduk.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_textAreaDeskripsiProdukFocusLost

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        tambahProduk();
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void fieldHargaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldHargaFocusGained
        if (fieldHarga.getText().equals("Masukan Harga.")) {
            fieldHarga.setText("");
            fieldHarga.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_fieldHargaFocusGained

    private void fieldHargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldHargaFocusLost
        if (fieldHarga.getText().equals("")) {
            fieldHarga.setText("Masukan Harga.");
            fieldHarga.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_fieldHargaFocusLost

    private void fieldJenisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldJenisFocusGained
        if (fieldJenis.getText().equals("Masukan jenis.")) {
            fieldJenis.setText("");
            fieldJenis.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_fieldJenisFocusGained

    private void fieldJenisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldJenisFocusLost
        if (fieldJenis.getText().equals("")) {
            fieldJenis.setText("Masukan jenis.");
            fieldJenis.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_fieldJenisFocusLost

    public static void main(String args[]) {
        Controller con = new Controller();
        JFrame a = new JFrame();
        TambahProduk dialog = new TambahProduk();
        
        //a.setPreferredSize(dialog.getPreferredSize());
        dialog.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TambahPelangganPanel;
    private javax.swing.JLabel TitleText;
    private javax.swing.JComboBox<String> comboKarat;
    private javax.swing.JComboBox<String> comboKategori;
    private javax.swing.JComboBox<String> comboSupplier;
    private javax.swing.JPanel dateContainer;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldJenis;
    private javax.swing.JTextField fieldNamaProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerBerat;
    private javax.swing.JButton tambahButton;
    private javax.swing.JTextArea textAreaDeskripsiProduk;
    // End of variables declaration//GEN-END:variables
}
