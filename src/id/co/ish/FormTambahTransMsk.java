/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ish;

import id.co.ish.dao.BarangDAO;
import id.co.ish.dao.TransaksiMasukDAO;
import id.co.ish.daoimpl.BarangDAOImpl;
import id.co.ish.daoimpl.TransaksiMasukDAOImpl;
import id.co.ish.entity.Barang;
import id.co.ish.entity.Pegawai;
import id.co.ish.entity.TransaksiMasuk;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Iqram
 */
public class FormTambahTransMsk extends javax.swing.JDialog {

    /**
     * Creates new form FormTambahTransMsk
     */
    private Barang barang;
    private Pegawai pegawai;
    private String tglTransMsk;
    private String kodeATK;
    private String idPegawai;
    private int stokBrg;
    private TransaksiMasuk tm = new TransaksiMasuk();
    public TransaksiMasukDAO dao = new TransaksiMasukDAOImpl();
    private ArrayList<Barang> arrayBarang;

    public FormTambahTransMsk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getKodeTransMsk();
        getBarang();
    }

    private void getBarang() {
        BarangDAO dao = new BarangDAOImpl();
        arrayBarang = dao.getBarang();
    }

    private void getKodeTransMsk() {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyy");
        Date date = new Date();
        tm = dao.noUrut();
        Integer nomorUrut;
        dateTanggalTransMsk.setDate(date);
        if (dateTanggalTransMsk.getDate() != null) {
            if (tm.getIdTransMsk() != null) {
                nomorUrut = Integer.parseInt(tm.getIdTransMsk());
                nomorUrut = nomorUrut + 1;
            } else {
                nomorUrut = 1;
            }
            String nomor = String.format("%04d", nomorUrut);
            tglTransMsk = format.format(dateTanggalTransMsk.getDate());
            fieldKodeTransMasuk.setText("MSK/" + tglTransMsk + "/" + nomor);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        fieldKodeTransMasuk = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        fieldNamaBarang = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        fieldJumlah = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnTambah = new java.awt.Button();
        btnReset = new java.awt.Button();
        btnPilih = new java.awt.Button();
        jLabel9 = new javax.swing.JLabel();
        dateTanggalTransMsk = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tanggal Transaksi Keluar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Tambah Transaksi Masuk");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Kode Transaksi Masuk");

        fieldKodeTransMasuk.setBackground(new java.awt.Color(255, 255, 255));
        fieldKodeTransMasuk.setForeground(new java.awt.Color(51, 51, 51));
        fieldKodeTransMasuk.setBorder(null);
        fieldKodeTransMasuk.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nama Barang");

        fieldNamaBarang.setBackground(new java.awt.Color(255, 255, 255));
        fieldNamaBarang.setForeground(new java.awt.Color(51, 51, 51));
        fieldNamaBarang.setBorder(null);
        fieldNamaBarang.setEnabled(false);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Jumlah");

        fieldJumlah.setBackground(new java.awt.Color(255, 255, 255));
        fieldJumlah.setForeground(new java.awt.Color(51, 51, 51));
        fieldJumlah.setBorder(null);
        fieldJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldJumlahKeyPressed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(255, 0, 0));
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setLabel("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setLabel("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPilih.setBackground(new java.awt.Color(255, 0, 0));
        btnPilih.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPilih.setForeground(new java.awt.Color(255, 255, 255));
        btnPilih.setLabel("Pilih");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Tanggal Transaksi Masuk");

        dateTanggalTransMsk.setBackground(new java.awt.Color(255, 255, 255));
        dateTanggalTransMsk.setForeground(new java.awt.Color(0, 0, 0));
        dateTanggalTransMsk.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jSeparator1)
                        .addComponent(fieldKodeTransMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateTanggalTransMsk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(fieldKodeTransMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateTanggalTransMsk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        FormPilihBarang fpb = new FormPilihBarang(null, rootPaneCheckingEnabled);
        fpb.setLocationRelativeTo(null);
        fpb.setResizable(false);
        fpb.setVisible(true);
        barang = fpb.getBarang();
        if (barang != null) {
            fieldNamaBarang.setText(barang.getNama());
            kodeATK = barang.getKodeBrg();
            stokBrg = barang.getStokBrg();
        }
    }//GEN-LAST:event_btnPilihActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String kodeTransMsk = fieldKodeTransMasuk.getText();
        String kodeBarang = kodeATK;
        Date tglMsk = dateTanggalTransMsk.getDate();
        String txtJumlah = fieldJumlah.getText();
        boolean sukses1 = false;
        boolean sukses2 = false;
        if ((kodeTransMsk != null && !kodeTransMsk.isEmpty())
                && (kodeBarang != null)
                && (txtJumlah != null && !txtJumlah.isEmpty())) {
            TransaksiMasuk transMsk = new TransaksiMasuk();
            Barang barang = new Barang();
            int jumlah = Integer.parseInt(txtJumlah);

            int stokBaru = stokBrg + jumlah;
            transMsk.setIdTransMsk(kodeTransMsk);
            transMsk.setKodeBrg(kodeBarang);
            transMsk.setTglMsk(tglMsk);
            transMsk.setJumlah(jumlah);

            barang.setStokBrg(stokBaru);
            barang.setKodeBrg(kodeBarang);
            BarangDAO dao1 = new BarangDAOImpl();
            sukses1 = dao1.ubahStok(barang);
            TransaksiMasukDAO dao2 = new TransaksiMasukDAOImpl();
            sukses2 = dao2.tambahTransMasuk(transMsk);

            if (sukses1 && sukses2) {
                JOptionPane.showMessageDialog(this, "Data transaksi berhasil ditambahkan");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Data transaksi gagal ditambahkan");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan isi data pada form transaksi!");
        }

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        fieldJumlah.setText("");
        fieldNamaBarang.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void fieldJumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldJumlahKeyPressed
        int key = evt.getKeyCode();
        if ((key >= evt.VK_0 && key <= evt.VK_9) 
                || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9)
                || (key == KeyEvent.VK_BACK_SPACE))  {
            fieldJumlah.setEditable(true);
            fieldJumlah.setBackground(Color.white);
        } else {
            fieldJumlah.setEditable(false);
            fieldJumlah.setBackground(Color.red);
        }
    }//GEN-LAST:event_fieldJumlahKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransMsk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransMsk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransMsk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransMsk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormTambahTransMsk dialog = new FormTambahTransMsk(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setResizable(false);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnPilih;
    private java.awt.Button btnReset;
    private java.awt.Button btnTambah;
    private com.toedter.calendar.JDateChooser dateTanggalTransMsk;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JTextField fieldKodeTransMasuk;
    private javax.swing.JTextField fieldNamaBarang;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}