/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ish;

import id.co.ish.dao.BarangDAO;
import id.co.ish.dao.TransaksiKeluarDAO;
import id.co.ish.dao.TransaksiMasukDAO;
import id.co.ish.daoimpl.BarangDAOImpl;
import id.co.ish.daoimpl.TransaksiKeluarDAOImpl;
import id.co.ish.daoimpl.TransaksiMasukDAOImpl;
import id.co.ish.entity.Barang;
import id.co.ish.entity.Pegawai;
import id.co.ish.entity.TransaksiKeluar;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Iqram
 */
public class FormTambahTransKlr extends javax.swing.JDialog {

    /**
     * Creates new form FormTambahTransKlr1
     */
    private Barang barang;
    private Pegawai pegawai;
    private String tglTransKlr;
    private String kodeATK;
    private String idPegawai;
    private int stokBrg;
    private TransaksiKeluar tk = new TransaksiKeluar();
    public TransaksiKeluarDAO dao = new TransaksiKeluarDAOImpl();

    public FormTambahTransKlr(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getKodeTransKlr();
    }
    
    private void getKodeTransKlr() {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyy");
        Date date = new Date();
        tk = dao.noUrut();
        Integer nomorUrut;
        dateTanggalTransKeluar.setDate(date);
        if (dateTanggalTransKeluar.getDate() != null) {
            if (tk.getIdTransKlr()!= null) {
                nomorUrut = Integer.parseInt(tk.getIdTransKlr());
                nomorUrut = nomorUrut + 1;
            } else {
                nomorUrut = 1;
            }
            String nomor = String.format("%04d", nomorUrut);
            tglTransKlr = format.format(dateTanggalTransKeluar.getDate());
            fieldKodeTransKlr.setText("KLR/" + tglTransKlr + "/" + nomor);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        fieldKodeTransKlr = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        fieldNamaBarang = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        fieldNamaPegawai = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        fieldJumlah = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        fieldDivisiPegawai = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnTambah = new java.awt.Button();
        btnReset = new java.awt.Button();
        fieldPilihPegawai = new java.awt.Button();
        btnPilihBarang = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        dateTanggalTransKeluar = new com.toedter.calendar.JDateChooser();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Tambah Transaksi Keluar");

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
        jLabel3.setText("Kode Transaksi Keluar");

        fieldKodeTransKlr.setBackground(new java.awt.Color(255, 255, 255));
        fieldKodeTransKlr.setForeground(new java.awt.Color(51, 51, 51));
        fieldKodeTransKlr.setBorder(null);
        fieldKodeTransKlr.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nama Barang");

        fieldNamaBarang.setBackground(new java.awt.Color(255, 255, 255));
        fieldNamaBarang.setForeground(new java.awt.Color(51, 51, 51));
        fieldNamaBarang.setBorder(null);
        fieldNamaBarang.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nama Pegawai");

        fieldNamaPegawai.setBackground(new java.awt.Color(255, 255, 255));
        fieldNamaPegawai.setForeground(new java.awt.Color(51, 51, 51));
        fieldNamaPegawai.setBorder(null);
        fieldNamaPegawai.setEnabled(false);

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

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Divisi Pegawai");

        fieldDivisiPegawai.setBackground(new java.awt.Color(255, 255, 255));
        fieldDivisiPegawai.setForeground(new java.awt.Color(51, 51, 51));
        fieldDivisiPegawai.setBorder(null);
        fieldDivisiPegawai.setEnabled(false);

        btnTambah.setBackground(new java.awt.Color(255, 0, 0));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setLabel("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setLabel("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        fieldPilihPegawai.setBackground(new java.awt.Color(255, 0, 0));
        fieldPilihPegawai.setForeground(new java.awt.Color(255, 255, 255));
        fieldPilihPegawai.setLabel("Pilih");
        fieldPilihPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPilihPegawaiActionPerformed(evt);
            }
        });

        btnPilihBarang.setBackground(new java.awt.Color(255, 0, 0));
        btnPilihBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnPilihBarang.setLabel("Pilih");
        btnPilihBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihBarangActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tanggal Transaksi Keluar");

        dateTanggalTransKeluar.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNamaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPilihPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(fieldKodeTransKlr))
                    .addComponent(jLabel7)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDivisiPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPilihBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateTanggalTransKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(fieldKodeTransKlr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateTanggalTransKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPilihBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fieldNamaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldPilihPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDivisiPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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

    private void fieldPilihPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPilihPegawaiActionPerformed
        FormPilihPegawai fpp = new FormPilihPegawai(null, rootPaneCheckingEnabled);
        fpp.setLocationRelativeTo(null);
        fpp.setResizable(false);
        fpp.setVisible(true);
        pegawai = fpp.getPegawai();
        if (pegawai !=null) {
            fieldNamaPegawai.setText(pegawai.getNamaPegawai());
            fieldDivisiPegawai.setText(pegawai.getDivisiPegawai());
            idPegawai = pegawai.getIdPegawai();
        }
    }//GEN-LAST:event_fieldPilihPegawaiActionPerformed

    private void btnPilihBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihBarangActionPerformed
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
    }//GEN-LAST:event_btnPilihBarangActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        String kodeTransKlr = fieldKodeTransKlr.getText();
        String kodeBarang = kodeATK;
        Date tglKlr = dateTanggalTransKeluar.getDate();
        String txtJumlah = fieldJumlah.getText();
        boolean sukses1 = false;
        boolean sukses2 = false;
        
        if ((kodeTransKlr != null && !kodeTransKlr.isEmpty())
                && (kodeBarang != null)
                && (txtJumlah != null && !txtJumlah.isEmpty())) {
            TransaksiKeluar transKlr = new TransaksiKeluar();
            Barang barang = new Barang();
            int jumlah = Integer.parseInt(txtJumlah);
             if (stokBrg < jumlah) {
                JOptionPane.showMessageDialog(this, "Stok ATK kurang!");
            } else {
            int stokBaru = stokBrg - jumlah;
            transKlr.setIdTransKlr(kodeTransKlr);
            transKlr.setKodeBrg(kodeBarang);
            transKlr.setTglKlr(tglKlr);
            transKlr.setIdPegawai(idPegawai);
            transKlr.setJumlah(jumlah);
            
            barang.setStokBrg(stokBaru);
            barang.setKodeBrg(kodeBarang);
            BarangDAO dao1 = new BarangDAOImpl();
            sukses1 = dao1.ubahStok(barang);
            TransaksiKeluarDAO dao2 = new TransaksiKeluarDAOImpl();
            sukses2 = dao2.tambahTransKeluar(transKlr);
             }
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

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        fieldDivisiPegawai.setText("");
        fieldNamaPegawai.setText("");
        fieldNamaBarang.setText("");
        fieldJumlah.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(FormTambahTransKlr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransKlr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransKlr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransKlr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormTambahTransKlr dialog = new FormTambahTransKlr(new javax.swing.JFrame(), true);
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
    private java.awt.Button btnPilihBarang;
    private java.awt.Button btnReset;
    private java.awt.Button btnTambah;
    private com.toedter.calendar.JDateChooser dateTanggalTransKeluar;
    private javax.swing.JTextField fieldDivisiPegawai;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JTextField fieldKodeTransKlr;
    private javax.swing.JTextField fieldNamaBarang;
    private javax.swing.JTextField fieldNamaPegawai;
    private java.awt.Button fieldPilihPegawai;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
