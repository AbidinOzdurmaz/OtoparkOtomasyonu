
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tablo_Ekrani extends javax.swing.JFrame {

   
    DefaultTableModel tablo=new DefaultTableModel();
            
    
    public Tablo_Ekrani() {
        initComponents();
        gostergeTablosu.setModel(tablo);      //  oluşturduğumuz tabloyu ekranımıza ekledik
        tablo.setColumnIdentifiers(new String[]{"AD","SOYAD","NUMARA","PLAKA","SAAT"});         //tabloya başlıklarımız ekledik
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sysAd = new javax.swing.JTextField();
        sysSoyad = new javax.swing.JTextField();
        sysNumara = new javax.swing.JTextField();
        sysPlaka = new javax.swing.JTextField();
        sysGirisSaati = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gostergeTablosu = new javax.swing.JTable();
        btnGiris = new javax.swing.JButton();
        btnIptal = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        btnSonlandir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Müşteri Giriş");
        setLocation(new java.awt.Point(200, 100));

        jLabel1.setText("Müşteri Adı : ");

        jLabel2.setText("Müşteri Soyadı :");

        jLabel3.setText("Telefon No:");

        jLabel4.setText("Araç Plakası");

        jLabel5.setText("Giriş Saati :");

        sysNumara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysNumaraActionPerformed(evt);
            }
        });

        gostergeTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gostergeTablosu);

        btnGiris.setBackground(new java.awt.Color(51, 255, 51));
        btnGiris.setText("Kaydet");
        btnGiris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        btnIptal.setBackground(new java.awt.Color(255, 0, 0));
        btnIptal.setText("Temizle");
        btnIptal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIptalActionPerformed(evt);
            }
        });

        btnCikis.setBackground(new java.awt.Color(153, 255, 153));
        btnCikis.setText("Çıkış Yap");
        btnCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        btnSonlandir.setBackground(new java.awt.Color(153, 0, 0));
        btnSonlandir.setText("Sistemi Sonlandır");
        btnSonlandir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSonlandir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonlandirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sysAd)
                            .addComponent(sysSoyad)
                            .addComponent(sysNumara)
                            .addComponent(sysPlaka)
                            .addComponent(sysGirisSaati, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSonlandir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(btnCikis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIptal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGiris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sysAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sysSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sysNumara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sysPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sysGirisSaati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnGiris)
                        .addGap(18, 18, 18)
                        .addComponent(btnIptal)
                        .addGap(18, 18, 18)
                        .addComponent(btnCikis)
                        .addGap(18, 18, 18)
                        .addComponent(btnSonlandir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sysNumaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysNumaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sysNumaraActionPerformed

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
           
        
      
           String ad=sysAd.getText();       //ad değişkenine Edittexte ki değeri atıyoruz
           String soyad=sysSoyad.getText();
           String no=sysNumara.getText();
           String plaka=sysPlaka.getText();
           String saat=sysGirisSaati.getText();
           
           sysAd.setText(null); 
           sysSoyad.setText(null);
           sysNumara.setText(null);
           sysPlaka.setText(null);
           sysGirisSaati.setText(null);
           
           String saveMessage="Kayıt Eklendi";
           JOptionPane.showMessageDialog(rootPane,saveMessage);    //kullanıcıya mesajı gösteriyoruz

           tablo.addRow(new String[] {ad,soyad,no,plaka,saat});



    }//GEN-LAST:event_btnGirisActionPerformed

    private void btnIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIptalActionPerformed

         sysAd.setText(null); 
         sysSoyad.setText(null);
         sysNumara.setText(null);
         sysPlaka.setText(null);
         sysGirisSaati.setText(null);


    }//GEN-LAST:event_btnIptalActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed

         double hesap;
         String girisSaati=JOptionPane.showInputDialog("Giriş Saati : ");
         String cikisSaati=JOptionPane.showInputDialog("Çıkış Saati : ");
         
         double grsSaati=Double.parseDouble(girisSaati);
         double cksSaati=Double.parseDouble(cikisSaati);
         
         hesap=(cksSaati-grsSaati)*15;
         
         JOptionPane.showConfirmDialog(rootPane,"Tutar : "+String.valueOf(hesap));
         tablo.removeRow(gostergeTablosu.getSelectedRow());     //seçili satırı tablodan siliyoruz
         
                 


    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnSonlandirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonlandirActionPerformed

            JOptionPane.showInputDialog(rootPane,"Güle Güle");
            dispose();
    }//GEN-LAST:event_btnSonlandirActionPerformed

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
            java.util.logging.Logger.getLogger(Tablo_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablo_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablo_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablo_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablo_Ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnIptal;
    private javax.swing.JButton btnSonlandir;
    private javax.swing.JTable gostergeTablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sysAd;
    private javax.swing.JTextField sysGirisSaati;
    private javax.swing.JTextField sysNumara;
    private javax.swing.JTextField sysPlaka;
    private javax.swing.JTextField sysSoyad;
    // End of variables declaration//GEN-END:variables
}
