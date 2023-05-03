/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package novoselac.view;

import com.github.javafaker.DateAndTime;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import novoselac.controller.ObradaDijete;
import novoselac.controller.ObradaDjelatnik;
import novoselac.controller.ObradaPosjeta;
import novoselac.controller.ObradaUsluga;
import novoselac.model.Dijete;
import novoselac.model.Djelatnik;
import novoselac.model.Posjeta;
import novoselac.model.Usluga;
import novoselac.util.Aplikacija;
import novoselac.util.NovoselacException;

/**
 *
 * @author Administrator
 */
public class ProzorPosjeta 
        extends javax.swing.JFrame
implements NovoselacViewSucelje{

    private ObradaPosjeta obrada; //dtp
    private ObradaDijete obradaDijete;//lst
    private ObradaUsluga obradaUsluga;//lst
   
//    private ObradaDjelatnik obradaDjelatnik;
    /**
     * Creates new form ProzorPosjeta
     */
    public ProzorPosjeta() {
        initComponents();
        obrada= new ObradaPosjeta();
        obradaDijete= new ObradaDijete();
    obradaUsluga = new ObradaUsluga();
     
//         lstDijete.setCellRenderer(new DijeteRenderer());
               setTitle(Aplikacija.NAZIV_NOVOSELAC+ ": "+
               Aplikacija.OPERATER.getImePrezime() +
                ": Posjete");
        
        ucitajDjecu();
        odaberiDatumIVrijemeDolaska();
        odaberiDatumIVrijemeOdlaska();
       ucitajUsluge();
        ucitaj();//usluge
    }
    
    private void odaberiDatumIVrijemeDolaska() {
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYYY. ");
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
         dtpDatumIVrijemeDolaska.datePicker.setSettings(dps);
         
        TimePickerSettings tps = new TimePickerSettings(new Locale("hr", "HR"));
         tps.setFormatForDisplayTime("HH:mm");
         dtpDatumIVrijemeDolaska.timePicker.getSettings().use24HourClockFormat();
         
         ArrayList<LocalTime>lista= new ArrayList<>();
         
           for(int j=0;j<24;j++){
        for(int i=0;i<60;i+=15){
            lista.add(LocalTime.of(j, i));
        }
        }
         
           dtpDatumIVrijemeDolaska.timePicker.getSettings()
                   .generatePotentialMenuTimes(lista);
       
               
    }
    
      private void odaberiDatumIVrijemeOdlaska() {
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYYY. ");
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
         dtpDatumIVrijemeOdlaska.datePicker.setSettings(dps);
         
        TimePickerSettings tps = new TimePickerSettings(new Locale("hr", "HR"));
         tps.setFormatForDisplayTime("HH:mm");
         dtpDatumIVrijemeOdlaska.timePicker.getSettings().use24HourClockFormat();
         
         ArrayList<LocalTime>lista= new ArrayList<>();
         
           for(int j=0;j<24;j++){
        for(int i=0;i<60;i+=15){
            lista.add(LocalTime.of(j, i));
        }
        }
         
           dtpDatumIVrijemeOdlaska.timePicker.getSettings()
                   .generatePotentialMenuTimes(lista);
       
               
    
    }
      
      
      
   
    
    
   @Override
  
       public void ucitaj(){

    }

        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dtpDatumIVrijemeOdlaska = new com.github.lgooddatepicker.components.DateTimePicker();
        dtpDatumIVrijemeDolaska = new com.github.lgooddatepicker.components.DateTimePicker();
        btnPotvrdiTermin = new javax.swing.JButton();
        btnNoviUnos = new javax.swing.JButton();
        txtNapomena = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDijeteUBazi = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        btnIspisDogovorenihPosjeta = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPotvrdaUsluge = new javax.swing.JList<>();
        txtUvjet1 = new javax.swing.JTextField();
        btnTrazi1 = new javax.swing.JButton();
        btnDodajUslugu = new javax.swing.JButton();
        btnObrisiUsugu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUslugaUBazi = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstPotvrdaDijeteta = new javax.swing.JList<>();
        btnObrisiDijete = new javax.swing.JButton();
        btnDodajDijete = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Odaberi uslugu");

        jLabel1.setText("Rezerviraj svoj termin");

        jLabel4.setText("Odaberi datum i vrijeme odlaska");

        jLabel5.setText("Odaberi datum i vijeme dolaska");

        btnPotvrdiTermin.setText("Potvrdi termin");
        btnPotvrdiTermin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotvrdiTerminActionPerformed(evt);
            }
        });
        btnPotvrdiTermin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPotvrdiTerminKeyPressed(evt);
            }
        });

        btnNoviUnos.setText("Novi unos dijeteta");
        btnNoviUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoviUnosActionPerformed(evt);
            }
        });

        jLabel6.setText("Napomena");

        jLabel12.setText("Unos dijeteta");

        jLabel13.setText("Odabir termina");

        jScrollPane1.setViewportView(lstDijeteUBazi);

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });
        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("🔍");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        btnIspisDogovorenihPosjeta.setText("Ispis dogovorenih termina");
        btnIspisDogovorenihPosjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIspisDogovorenihPosjetaActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstPotvrdaUsluge);

        txtUvjet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjet1ActionPerformed(evt);
            }
        });
        txtUvjet1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjet1KeyPressed(evt);
            }
        });

        btnTrazi1.setText("🔍");
        btnTrazi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrazi1ActionPerformed(evt);
            }
        });

        btnDodajUslugu.setText("<<");
        btnDodajUslugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajUsluguActionPerformed(evt);
            }
        });

        btnObrisiUsugu.setText(">>");
        btnObrisiUsugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiUsuguActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstUslugaUBazi);

        jScrollPane5.setViewportView(lstPotvrdaDijeteta);

        btnObrisiDijete.setText(">>");
        btnObrisiDijete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiDijeteActionPerformed(evt);
            }
        });

        btnDodajDijete.setText("<<");
        btnDodajDijete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajDijeteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(537, 537, 537)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(dtpDatumIVrijemeDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(dtpDatumIVrijemeOdlaska, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(144, 144, 144)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(200, 200, 200)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNoviUnos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnDodajDijete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnObrisiDijete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(318, 318, 318))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDodajUslugu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnObrisiUsugu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUvjet1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnTrazi1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(85, 85, 85))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPotvrdiTermin, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnIspisDogovorenihPosjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(411, 411, 411))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(512, 512, 512))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUvjet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTrazi1))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(btnDodajUslugu)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisiUsugu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPotvrdiTermin)
                    .addComponent(btnIspisDogovorenihPosjeta))
                .addGap(28, 28, 28)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnDodajDijete)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisiDijete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTrazi))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNoviUnos))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtpDatumIVrijemeDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpDatumIVrijemeOdlaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPotvrdiTerminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotvrdiTerminActionPerformed
       obrada.setEntitet(new Posjeta());
        napuniModel();
        try {
            obrada.create();
            ucitajDjecu();
            ucitajUsluge();
            odaberiDatumIVrijemeDolaska();
            odaberiDatumIVrijemeOdlaska();
            
        } catch (NovoselacException ex) {

            JOptionPane.showMessageDialog(
                getRootPane(),
                ex.getPoruka());
            
            
        }
        
        
    }//GEN-LAST:event_btnPotvrdiTerminActionPerformed

    private void btnNoviUnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoviUnosActionPerformed
        new ProzorDijete().setVisible(true);
    }//GEN-LAST:event_btnNoviUnosActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitajDjecu();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajDjecu();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnIspisDogovorenihPosjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIspisDogovorenihPosjetaActionPerformed
     new ProzorDijetePosjeta().setVisible(true);
    }//GEN-LAST:event_btnIspisDogovorenihPosjetaActionPerformed

    private void txtUvjet1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjet1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitajUsluge();
        }
    }//GEN-LAST:event_txtUvjet1KeyPressed

    private void btnTrazi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrazi1ActionPerformed
    ucitajUsluge();
    }//GEN-LAST:event_btnTrazi1ActionPerformed

    private void btnDodajUsluguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajUsluguActionPerformed

        if(lstUslugaUBazi.getSelectedValuesList()==null
            || lstUslugaUBazi.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(),
                "Prvo pronađite uslugu");
            return;
        }

        if(lstPotvrdaUsluge.getModel()==null ||
            !(lstPotvrdaUsluge.getModel() instanceof DefaultListModel<Usluga>)){
            lstPotvrdaUsluge.setModel(new DefaultListModel<Usluga>());
        }

        DefaultListModel<Usluga> m =
        (DefaultListModel<Usluga>) lstPotvrdaUsluge.getModel();

        DefaultListModel<Usluga> usluge =
        (DefaultListModel<Usluga>) lstPotvrdaUsluge.getModel();
        boolean postoji;
        for(Usluga pub : lstUslugaUBazi.getSelectedValuesList()){
            postoji=false;
            for(int i=0;i<usluge.getSize();i++){
                if(pub.getSifra()==usluge.get(i).getSifra()){
                    postoji=true;
                    break;
                }
            }
            if(!postoji){
                usluge.addElement(pub);
            }
        }
        lstPotvrdaUsluge.repaint();
    }//GEN-LAST:event_btnDodajUsluguActionPerformed

    private void btnObrisiUsuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiUsuguActionPerformed
        if(lstPotvrdaUsluge.getSelectedValuesList()==null
            || lstPotvrdaUsluge.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(),
                "Prvo odaberite uslugu za uklanjanje sa posjete");
            return;
        }

        DefaultListModel<Usluga> m =
        (DefaultListModel<Usluga>) lstPotvrdaUsluge.getModel();

        for(Usluga u : lstPotvrdaUsluge.getSelectedValuesList()){
            m.removeElement(u);
        }
        lstPotvrdaUsluge.repaint();
    }//GEN-LAST:event_btnObrisiUsuguActionPerformed

    private void txtUvjet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjet1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjet1ActionPerformed

    private void btnObrisiDijeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiDijeteActionPerformed
         if(lstPotvrdaDijeteta.getSelectedValuesList()==null
                || lstPotvrdaDijeteta.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(),
                    "Prvo odaberite dijete na posjeti");
            return;
        }
        
        DefaultListModel<Dijete> m = 
                (DefaultListModel<Dijete>) lstPotvrdaDijeteta.getModel();
        
        for(Dijete p : lstPotvrdaDijeteta.getSelectedValuesList()){
            m.removeElement(p);
        }
        lstPotvrdaDijeteta.repaint();
    }//GEN-LAST:event_btnObrisiDijeteActionPerformed

    private void btnDodajDijeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajDijeteActionPerformed
      if(lstDijeteUBazi.getSelectedValuesList()==null
                || lstDijeteUBazi.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(),
                    "Prvo pronađite dijete/djecu");
            return;
        }
        
          if(lstPotvrdaDijeteta.getModel()==null || 
                  !(lstPotvrdaDijeteta.getModel() instanceof DefaultListModel<Dijete>)){
            lstPotvrdaDijeteta.setModel(new DefaultListModel<Dijete>());
        }
        
        DefaultListModel<Dijete> m = 
                (DefaultListModel<Dijete>) lstPotvrdaDijeteta.getModel();
        
        DefaultListModel<Dijete> polaznici = 
                (DefaultListModel<Dijete>) lstPotvrdaDijeteta.getModel();
        boolean postoji;
        for(Dijete pub : lstDijeteUBazi.getSelectedValuesList()){
            postoji=false;
            for(int i=0;i<polaznici.getSize();i++){
                if(pub.getSifra()==polaznici.get(i).getSifra()){
                    postoji=true;
                    break;
                }
            }
            if(!postoji){
                 polaznici.addElement(pub);
            }
        }
        lstPotvrdaDijeteta.repaint();
        
        
        
       
      
        
      
        
    }//GEN-LAST:event_btnDodajDijeteActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void btnPotvrdiTerminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPotvrdiTerminKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
                        lblPoruka.setText("Posjeta je uspješno zabilježena");
          }
          
         
           
      
    }//GEN-LAST:event_btnPotvrdiTerminKeyPressed

    private void ucitajDjecu(){
        DefaultListModel<Dijete> m= new DefaultListModel<>();
        m.addAll(obradaDijete.read(txtUvjet.getText().trim()));
        lstDijeteUBazi.setModel(m);
        lstDijeteUBazi.repaint();
    }

       private void ucitajUsluge(){
        DefaultListModel<Usluga> n= new DefaultListModel<>();
        n.addAll(obradaUsluga.read(txtUvjet1.getText().trim()));
        lstUslugaUBazi.setModel(n);
        lstDijeteUBazi.repaint();
    }
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajDijete;
    private javax.swing.JButton btnDodajUslugu;
    private javax.swing.JButton btnIspisDogovorenihPosjeta;
    private javax.swing.JButton btnNoviUnos;
    private javax.swing.JButton btnObrisiDijete;
    private javax.swing.JButton btnObrisiUsugu;
    private javax.swing.JButton btnPotvrdiTermin;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JButton btnTrazi1;
    private com.github.lgooddatepicker.components.DateTimePicker dtpDatumIVrijemeDolaska;
    private com.github.lgooddatepicker.components.DateTimePicker dtpDatumIVrijemeOdlaska;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JList<Dijete> lstDijeteUBazi;
    private javax.swing.JList<Dijete> lstPotvrdaDijeteta;
    private javax.swing.JList<Usluga> lstPotvrdaUsluge;
    private javax.swing.JList<Usluga> lstUslugaUBazi;
    private javax.swing.JTextField txtNapomena;
    private javax.swing.JTextField txtUvjet;
    private javax.swing.JTextField txtUvjet1;
    // End of variables declaration//GEN-END:variables



    @Override
    public void napuniView() {
        var e= obrada.getEntitet();
        //napomena
        
        txtNapomena.setText(e.getNapomena());
        
        //usluga
//        cmbOdaberiUslugu.setSelectedItem(e.getUsluge());
        
         // vrijeme i datum - convert
        LocalDate ld = e.getDatumVrijemeDolaska().
                toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        dtpDatumIVrijemeDolaska.datePicker.setDate(ld);
        LocalTime lt = e.getDatumVrijemeOdlaska()
                .toInstant().
                atZone(ZoneId.systemDefault())
                .toLocalTime();
        dtpDatumIVrijemeDolaska.timePicker.setTime(lt);
        
        LocalDate ldd = e.getDatumVrijemeOdlaska()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        dtpDatumIVrijemeOdlaska.datePicker.setDate(ldd);
        LocalTime ltt = e.getDatumVrijemeOdlaska()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalTime();
        dtpDatumIVrijemeOdlaska.timePicker.setTime(ltt);
        
        //djeca na posjeti
        DefaultListModel<Dijete> m= new DefaultListModel<>();
        
        if(e.getDjeca()!=null && !e.getDjeca().isEmpty()){
         m.addAll(e.getDjeca());
            
        lstDijeteUBazi.setModel(m);
        lstDijeteUBazi.repaint();
            }
        
        
        
        }
    
   
    @Override
    public void napuniModel() {
       var e= obrada.getEntitet();
       
      //termin
       
      LocalDate ld = dtpDatumIVrijemeDolaska.datePicker.getDate();
 
        LocalTime lt = dtpDatumIVrijemeDolaska.timePicker.getTime();
 
         LocalDateTime fromDateAndTime = LocalDateTime.of(ld,
                                                           lt);
        
        Date datum = Date.from(fromDateAndTime.atZone(ZoneId.systemDefault()).toInstant());
        
        
        e.setDatumVrijemeDolaska(datum);
        
        
        
        
        LocalDate ldd = dtpDatumIVrijemeOdlaska.datePicker.getDate();
 
        LocalTime ltt = dtpDatumIVrijemeOdlaska.timePicker.getTime();
 
         LocalDateTime fromDateAndTime1 
                 = LocalDateTime.of(ldd,ltt);
        
        Date datum1 = Date.from(fromDateAndTime1.atZone(ZoneId.systemDefault()).toInstant());
        
        
       e.setDatumVrijemeOdlaska(datum1);        
        
       //napomena
       
        e.setNapomena(txtNapomena.getText());
        
        //dijete
     
        List<Dijete> djeca = new ArrayList<>();
        try {
            DefaultListModel<Dijete> m = (DefaultListModel<Dijete>) lstPotvrdaDijeteta.getModel();
            for(int i=0;i<m.getSize();i++){
                djeca.add(m.getElementAt(i));
            }
        } catch (Exception ex) {
            
        }
        e.setDjeca(djeca);
        
        //usluga
     
         List<Usluga> usluge = new ArrayList<>();
        try {
            DefaultListModel<Usluga> m = (DefaultListModel<Usluga>) lstPotvrdaUsluge.getModel();
            for(int i=0;i<m.getSize();i++){
                usluge.add(m.getElementAt(i));
            }
        } catch (Exception ex) {
            
        }
        e.setUsluge(usluge);
        
       
      

   }

   

    
}
/* upit za ispis potvđenog termina
select a.ime,a.prezime, a.imeRoditelja, a.telefonRoditelja,c.datumVrijemeDolaska, c.datumVrijemeOdlaska, c.napomena  
from dijete a
inner join dijeteposjeta  b on a.sifra= b.dijete
inner join posjeta c on b.posjeta=c.sifra
order by datumVrijemeDolaska desc

select * from posjeta
order by sifra desc

*/