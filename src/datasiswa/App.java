/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datasiswa;

import com.sun.jdi.VMOutOfMemoryException;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        reset();
    }
    void reset(){
        tNIS.setText(null);
        tNAMA.setText(null);
        tTEMPATLAHIR.setText(null);
        tALAMAT.setText(null);
        vNIS.setText(null);
        
        vFOTO.setText(null);
        vTtl.setText(null);
        vNAMA.setText(null);
        vJURUSAN.setText(null);
        vKelamin.setText(null);
       
       vTtl.setText(null);
         vALAMAT.setText(null);
        
              KELAMIN.clearSelection();
               tTANGGALLAHIR.setCalendar(null);
               tJURUSAN.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        KELAMIN = new javax.swing.ButtonGroup();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tNIS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tNAMA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rL = new javax.swing.JRadioButton();
        rP = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tTEMPATLAHIR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tTANGGALLAHIR = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tJURUSAN = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tALAMAT = new javax.swing.JTextArea();
        pFOTO = new javax.swing.JLabel();
        tFOTO = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bRESET = new javax.swing.JButton();
        bSIMPAN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        vNIS = new javax.swing.JLabel();
        vNAMA = new javax.swing.JLabel();
        vKelamin = new javax.swing.JLabel();
        vTtl = new javax.swing.JLabel();
        vJURUSAN = new javax.swing.JLabel();
        vFOTO = new javax.swing.JLabel();
        vALAMAT = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA SISWA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("NIS");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        tNIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tNISMouseClicked(evt);
            }
        });

        jLabel3.setText("NAMA");

        tNAMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tNAMAMouseClicked(evt);
            }
        });

        jLabel4.setText("JENIS K");

        KELAMIN.add(rL);
        rL.setText("LAKI LAKI");
        rL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rLMouseClicked(evt);
            }
        });

        KELAMIN.add(rP);
        rP.setText("PEREMPUAN");
        rP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rPMouseClicked(evt);
            }
        });

        jLabel5.setText("TEMPAT LAHIR");

        tTEMPATLAHIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTEMPATLAHIRMouseClicked(evt);
            }
        });

        jLabel6.setText("TANGGAL LAHIR");

        tTANGGALLAHIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTANGGALLAHIRMouseClicked(evt);
            }
        });

        jLabel7.setText("JURUSAN");

        tJURUSAN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPA", "IPS", "BAHASA" }));
        tJURUSAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tJURUSANMouseClicked(evt);
            }
        });

        tALAMAT.setColumns(20);
        tALAMAT.setRows(5);
        tALAMAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tALAMATMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tALAMAT);

        pFOTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pFOTO.setText("jLabel8");
        pFOTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pFOTO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pFOTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFOTOMouseClicked(evt);
            }
        });

        tFOTO.setText("jLabel8");
        tFOTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tFOTOMouseClicked(evt);
            }
        });

        jLabel8.setText("ALAMAT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rP))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTEMPATLAHIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tTANGGALLAHIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tJURUSAN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(pFOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tFOTO)
                        .addGap(116, 116, 116))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rL)
                            .addComponent(rP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tTEMPATLAHIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tTANGGALLAHIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tJURUSAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pFOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(tFOTO)))
                .addGap(42, 42, 42))
        );

        bRESET.setBackground(new java.awt.Color(255, 0, 0));
        bRESET.setForeground(new java.awt.Color(255, 255, 255));
        bRESET.setText("RESET");
        bRESET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRESETMouseClicked(evt);
            }
        });

        bSIMPAN.setBackground(new java.awt.Color(0, 0, 255));
        bSIMPAN.setForeground(new java.awt.Color(255, 255, 255));
        bSIMPAN.setText("SIMPAN");
        bSIMPAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSIMPANMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRESET)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSIMPAN)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRESET)
                    .addComponent(bSIMPAN)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        vNIS.setText("jLabel9");
        vNIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vNISMouseClicked(evt);
            }
        });

        vNAMA.setText("jLabel10");
        vNAMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vNAMAMouseClicked(evt);
            }
        });

        vKelamin.setText("jLabel11");
        vKelamin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vKelaminMouseClicked(evt);
            }
        });

        vTtl.setText("jLabel12");
        vTtl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vTtlMouseClicked(evt);
            }
        });

        vJURUSAN.setText("jLabel13");
        vJURUSAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vJURUSANMouseClicked(evt);
            }
        });

        vFOTO.setText("jLabel15");
        vFOTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vFOTOMouseClicked(evt);
            }
        });

        vALAMAT.setText("jLabel9");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vNIS)
                    .addComponent(vTtl)
                    .addComponent(vJURUSAN)
                    .addComponent(vNAMA)
                    .addComponent(vKelamin)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vFOTO)
                            .addComponent(vALAMAT))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vNIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vNAMA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vKelamin)
                .addGap(14, 14, 14)
                .addComponent(vTtl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vJURUSAN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vALAMAT)
                .addGap(18, 18, 18)
                .addComponent(vFOTO)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pFOTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFOTOMouseClicked
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.toString());
            Image image = icon.getImage().getScaledInstance(pFOTO.getWidth(), pFOTO.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(image);
            pFOTO.setText(null);
            pFOTO.setIcon(ic);
            String filename = file.getAbsolutePath();
            tFOTO.setText(filename);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Upload Error"+e);
        }
 
            
        
    }//GEN-LAST:event_pFOTOMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tNAMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNAMAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tNAMAMouseClicked

    private void tNISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNISMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tNISMouseClicked

    private void rLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rLMouseClicked

    private void rPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rPMouseClicked

    private void tTEMPATLAHIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTEMPATLAHIRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tTEMPATLAHIRMouseClicked

    private void tTANGGALLAHIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTANGGALLAHIRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tTANGGALLAHIRMouseClicked

    private void tJURUSANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tJURUSANMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tJURUSANMouseClicked

    private void tALAMATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tALAMATMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tALAMATMouseClicked

    private void tFOTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tFOTOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tFOTOMouseClicked

    private void bRESETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRESETMouseClicked
        // TODO add your handling code here:
        reset();
        pFOTO.setText(null); 
    pFOTO.setIcon(null); 

    }//GEN-LAST:event_bRESETMouseClicked

    private void bSIMPANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSIMPANMouseClicked
        vNIS.setText("NIS: " +tNIS.getText());
        vNAMA.setText("NAMA: " +tNAMA.getText());
        vJURUSAN.setText("JURUSAN: " +tJURUSAN.getSelectedItem().toString());
       vALAMAT.setText("ALAMAT: " +tALAMAT.getText());
        if (rL.isSelected()) {
            vTtl.setText("JENIS KELAMIN : LAKI LAKI");
        }else if(rP.isSelected()){
            vTtl.setText("JENIS KELAMIN : PEREMPUAN");
        }else {
            vTtl.setText("JENIS KELAMIN : TIDAK TERDEFINSI");
        }
        SimpleDateFormat sd = new SimpleDateFormat("yyy-MM-dd");
        String tgllahir = String.valueOf(sd.format(tTANGGALLAHIR.getDate()));
         vKelamin.setText("TTL: " + tTEMPATLAHIR.getText()+","+tgllahir);
         
         String filname;
         try {
             filname = tFOTO.getText();
             String filepath = "src/foto/";
             File folder = new File(filepath);
             if (!folder.exists()) {
                folder.mkdir();
         }
             File soursFile = null;
             File destFile = null;
             String ekstensi = filname.substring(filname.lastIndexOf(".")+1);
             soursFile = new File(filname);
             Date tglUpload = new Date();
             SimpleDateFormat fr = new SimpleDateFormat("yyyMMddhhss");
             String tglBaru = String.valueOf(fr.format(tglUpload));
             destFile = new File(filepath + tglBaru.toString());
         }catch (Exception e) {
         JOptionPane.showMessageDialog(null,"upload error"+e);
         }
    }//GEN-LAST:event_bSIMPANMouseClicked

    private void vNISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vNISMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vNISMouseClicked

    private void vNAMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vNAMAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vNAMAMouseClicked

    private void vKelaminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vKelaminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vKelaminMouseClicked

    private void vTtlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vTtlMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vTtlMouseClicked

    private void vJURUSANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vJURUSANMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vJURUSANMouseClicked

    private void vFOTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vFOTOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vFOTOMouseClicked

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup KELAMIN;
    private javax.swing.JButton bRESET;
    private javax.swing.JButton bSIMPAN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pFOTO;
    private javax.swing.JRadioButton rL;
    private javax.swing.JRadioButton rP;
    private javax.swing.JTextArea tALAMAT;
    private javax.swing.JLabel tFOTO;
    private javax.swing.JComboBox<String> tJURUSAN;
    private javax.swing.JTextField tNAMA;
    private javax.swing.JTextField tNIS;
    private com.toedter.calendar.JDateChooser tTANGGALLAHIR;
    private javax.swing.JTextField tTEMPATLAHIR;
    private javax.swing.JLabel vALAMAT;
    private javax.swing.JLabel vFOTO;
    private javax.swing.JLabel vJURUSAN;
    private javax.swing.JLabel vKelamin;
    private javax.swing.JLabel vNAMA;
    private javax.swing.JLabel vNIS;
    private javax.swing.JLabel vTtl;
    // End of variables declaration//GEN-END:variables
}
