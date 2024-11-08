/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lima;

import javax.swing.JOptionPane;

/**
 *
 * @author daffa
 */
public class PesanMakanMinum extends javax.swing.JFrame {

    /**
     * Creates new form PesanMakanMinum
     */
    public PesanMakanMinum() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbNasiRames = new javax.swing.JCheckBox();
        cbNasiGoreng = new javax.swing.JCheckBox();
        cbEsTehManis = new javax.swing.JCheckBox();
        cbKopi = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfPorsiNasiRames = new javax.swing.JTextField();
        tfPorsiKopi = new javax.swing.JTextField();
        tfPorsiEsTehManis = new javax.swing.JTextField();
        tfPorsiNasiGoreng = new javax.swing.JTextField();
        tfBiayaNasiRames = new javax.swing.JTextField();
        tfBiayaKopi = new javax.swing.JTextField();
        tfBiayaEsTehManis = new javax.swing.JTextField();
        tfBiayaNasiGoreng = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tfTotalBiaya = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDaftarPesanan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pesan Makan Minum");

        jLabel2.setText("Menu");

        jLabel3.setText("Harga");

        jLabel4.setText("Porsi");

        jLabel5.setText("Jumlah");

        cbNasiRames.setText("Nasi Rames");

        cbNasiGoreng.setText("Nasi Goreng");

        cbEsTehManis.setText("Es Teh Manis");

        cbKopi.setText("Kopi");

        jLabel6.setText("Rp. 12.000");

        jLabel7.setText("Rp. 5.000");

        jLabel8.setText("Rp. 5.000");

        jLabel9.setText("Rp. 13.000");

        jButton1.setText("Pesan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesan(evt);
            }
        });

        jLabel10.setText("Total");

        jButton2.setText("Bayar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayar(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear(evt);
            }
        });

        jLabel11.setText("Daftar Pesanan");

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit(evt);
            }
        });

        taDaftarPesanan.setColumns(20);
        taDaftarPesanan.setRows(5);
        jScrollPane1.setViewportView(taDaftarPesanan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNasiRames)
                            .addComponent(cbKopi)
                            .addComponent(cbEsTehManis)
                            .addComponent(cbNasiGoreng))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(67, 67, 67))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfPorsiNasiRames, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfPorsiKopi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfPorsiEsTehManis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfPorsiNasiGoreng, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 29, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel10)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton4))
                                            .addComponent(tfBiayaNasiGoreng, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfBiayaEsTehManis)
                                            .addComponent(tfBiayaKopi)
                                            .addComponent(tfBiayaNasiRames)
                                            .addComponent(tfTotalBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2))))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane1))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNasiRames)
                    .addComponent(jLabel6)
                    .addComponent(tfPorsiNasiRames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBiayaNasiRames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKopi)
                    .addComponent(jLabel7)
                    .addComponent(tfPorsiKopi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBiayaKopi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEsTehManis)
                    .addComponent(tfPorsiEsTehManis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBiayaEsTehManis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbNasiGoreng)
                        .addComponent(tfBiayaNasiGoreng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(tfPorsiNasiGoreng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTotalBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(80, 80, 80)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int totalBiaya = 0;
    int hargaNasiRames = 12000, hargaKopi = 5000, hargaEsTehManis = 5000, hargaNasiGoreng = 13000;
    
    String format = "";
    
    private void btnBayar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayar
        // TODO add your handling code here: 
        format += "================================================== \n";
        taDaftarPesanan.setText(format);
    }//GEN-LAST:event_btnBayar

    private void btnPesan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesan
        // TODO add your handling code here:
        if(cbNasiRames.isSelected()) {
            int porsiNasiRames = Integer.parseInt(tfPorsiNasiRames.getText());
            int biayaNasiRames = porsiNasiRames * hargaNasiRames;
            totalBiaya += biayaNasiRames;
            format += cbNasiRames.getText() + ": " + Integer.toString(hargaNasiRames) + " x " + Integer.toString(porsiNasiRames) + " = " + Integer.toString(biayaNasiRames) + "\n";
            
            tfBiayaNasiRames.setText(Integer.toString(biayaNasiRames)); 
        }
        
        if(cbKopi.isSelected()) {
            int porsiKopi = Integer.parseInt(tfPorsiKopi.getText());
            int biayaKopi = porsiKopi * hargaKopi;
            totalBiaya += biayaKopi;
            format += cbKopi.getText() + ": " + Integer.toString(hargaKopi) + " x " + Integer.toString(porsiKopi) + " = " + Integer.toString(biayaKopi) + "\n";
            
            tfBiayaKopi.setText(Integer.toString(biayaKopi));
        }
        
        if(cbEsTehManis.isSelected()) {
            int porsiEsTehManis = Integer.parseInt(tfPorsiEsTehManis.getText());
            int biayaEsTehManis = porsiEsTehManis * hargaEsTehManis;
            totalBiaya += biayaEsTehManis;
            format += cbEsTehManis.getText() + ": " + Integer.toString(hargaEsTehManis) + " x " + Integer.toString(porsiEsTehManis) + " = " + Integer.toString(biayaEsTehManis) + "\n";
            
            tfBiayaEsTehManis.setText(Integer.toString(biayaEsTehManis));
        }
        
        if(cbNasiGoreng.isSelected()) {
            int porsiNasiGoreng = Integer.parseInt(tfPorsiNasiGoreng.getText());
            int biayaNasiGoreng = porsiNasiGoreng * hargaNasiGoreng;
            totalBiaya += biayaNasiGoreng;
            format += cbNasiGoreng.getText() + ": " + Integer.toString(hargaNasiGoreng) + " x " + Integer.toString(porsiNasiGoreng) + " = " + Integer.toString(biayaNasiGoreng) + "\n";
            
            tfBiayaNasiGoreng.setText(Integer.toString(biayaNasiGoreng));
        }
        
        tfTotalBiaya.setText(Integer.toString(totalBiaya));
        format += "================================================== \nTotal: " + totalBiaya + "\n";                
    }//GEN-LAST:event_btnPesan

    private void btnClear(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear
        // TODO add your handling code here:
        cbEsTehManis.setSelected(false);
        cbNasiGoreng.setSelected(false);
        cbNasiRames.setSelected(false);
        cbKopi.setSelected(false);
        
        tfPorsiEsTehManis.setText("");
        tfPorsiNasiRames.setText("");
        tfPorsiNasiGoreng.setText("");
        tfPorsiKopi.setText("");
        
        tfBiayaEsTehManis.setText("");
        tfBiayaNasiRames.setText("");
        tfBiayaNasiGoreng.setText("");
        tfBiayaKopi.setText("");
        
        tfTotalBiaya.setText("");
        taDaftarPesanan.setText("");
        
        totalBiaya = 0;
        format = "";
    }//GEN-LAST:event_btnClear

    private void btnExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit
        // TODO add your handling code here:
        int jawab = JOptionPane.showOptionDialog(this, "Ingin Keluar?", "Exit", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, null, null);
        
        if(jawab == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExit

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
            java.util.logging.Logger.getLogger(PesanMakanMinum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesanMakanMinum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesanMakanMinum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesanMakanMinum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesanMakanMinum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbEsTehManis;
    private javax.swing.JCheckBox cbKopi;
    private javax.swing.JCheckBox cbNasiGoreng;
    private javax.swing.JCheckBox cbNasiRames;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDaftarPesanan;
    private javax.swing.JTextField tfBiayaEsTehManis;
    private javax.swing.JTextField tfBiayaKopi;
    private javax.swing.JTextField tfBiayaNasiGoreng;
    private javax.swing.JTextField tfBiayaNasiRames;
    private javax.swing.JTextField tfPorsiEsTehManis;
    private javax.swing.JTextField tfPorsiKopi;
    private javax.swing.JTextField tfPorsiNasiGoreng;
    private javax.swing.JTextField tfPorsiNasiRames;
    private javax.swing.JTextField tfTotalBiaya;
    // End of variables declaration//GEN-END:variables
}
