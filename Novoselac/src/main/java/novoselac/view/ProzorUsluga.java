/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package novoselac.view;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import novoselac.controller.ObradaUsluga;
import novoselac.model.Posjeta;
import novoselac.model.Usluga;
import novoselac.util.Aplikacija;
import novoselac.util.NovoselacException;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Administrator
 */
public class ProzorUsluga 
extends javax.swing.JFrame 
implements NovoselacViewSucelje{

    private ObradaUsluga obrada;
    private DecimalFormat df;
    
    
    
    /**
     * Creates new form ProzorUsluga
     */
    public ProzorUsluga() {
        initComponents();
        obrada = new ObradaUsluga();
        DecimalFormatSymbols dfs=
                new DecimalFormatSymbols(
                        new Locale("hr", "HR"));
        df= new DecimalFormat("###,##0.00", dfs);
        
              
 //naziv aplikacije
        setTitle(Aplikacija.NAZIV_NOVOSELAC+ ": "+
               Aplikacija.OPERATER.getImePrezime() +
                ": Usluge");
       ucitaj();
    
    }
    //iz baze se u jlist učitava preko modela
    @Override
     public void ucitaj(){
        DefaultListModel<Usluga> m= 
                new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPromjeni = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        txtKolicina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        txtJedinicaMjere = new javax.swing.JTextField();
        btnBrisi = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Popis usluga:");

        jLabel2.setText("Cijena");

        txtCijena.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        txtKolicina.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setText("Jedinica mjere");

        jLabel5.setText("Naziv");

        jLabel4.setText("Količina");

        txtNaziv.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNazivActionPerformed(evt);
            }
        });

        txtJedinicaMjere.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtJedinicaMjere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJedinicaMjereActionPerformed(evt);
            }
        });

        btnBrisi.setText("Briši");
        btnBrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisiActionPerformed(evt);
            }
        });

        btnExcel.setText("Ispiši u Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJedinicaMjere)
                    .addComponent(txtCijena)
                    .addComponent(txtNaziv)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrisi))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKolicina)
                    .addComponent(btnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJedinicaMjere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnBrisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcel)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            JOptionPane.showMessageDialog(getRootPane(),
                "Prvo odabertie uslugu");
            return;
        }

          obrada.setEntitet(lstPodaci.getSelectedValue());
        
        napuniModel();

        try {
            obrada.update();
            ucitaj();
        } catch (NovoselacException ex) {
            JOptionPane.showMessageDialog(getRootPane(),
                ex.getPoruka());
        }


  
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPodaci.getSelectedValue()==null){
            return;
        }

        obrada.setEntitet(lstPodaci.getSelectedValue());
        napuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Usluga());
        napuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (NovoselacException ex) {

            JOptionPane.showMessageDialog(
                getRootPane(),
                ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void txtNazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNazivActionPerformed

    private void txtJedinicaMjereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJedinicaMjereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJedinicaMjereActionPerformed

    private void btnBrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisiActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            JOptionPane.showMessageDialog(getRootPane(),
                "Prvo odaberite uslugu kojeu želite brisati");

            return;
        }

        if(JOptionPane.showConfirmDialog(
            getRootPane(),
            "Jeste li sigurni da želite brisati uslugu " +
            obrada.getEntitet().getNaziv()+"?",
            "Brisanje",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
        return;
        }

        try {
            obrada.delete();
            ucitaj();
        } catch (NovoselacException ex) {
            JOptionPane.showMessageDialog(getRootPane(),
                ex.getPoruka());
        }

    }//GEN-LAST:event_btnBrisiActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        jfc.setSelectedFile(new File(System.getProperty("user.home")
            + File.separator + "usluge.xlsx"));
    if (jfc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
        return;
        }

        try {

            Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

            /* CreationHelper helps us create instances of various things like DataFormat,
            Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
            CreationHelper createHelper = workbook.getCreationHelper();

            // Create a Sheet
            Sheet sheet = workbook.createSheet("Popis usluga");

            // Create a Font for styling header cells
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 14);
            headerFont.setColor(IndexedColors.RED.getIndex());

            // Create a CellStyle with the font
            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            // Create a Row
            Row headerRow = sheet.createRow(0);

            // Create cells
            Cell cell = headerRow.createCell(0);
            cell.setCellValue("Naziv usluge");
            cell.setCellStyle(headerCellStyle);

            cell = headerRow.createCell(1);
            cell.setCellValue("Cijena");
            cell.setCellStyle(headerCellStyle);

            cell = headerRow.createCell(2);
            cell.setCellValue("Jedinica mjere");
            cell.setCellStyle(headerCellStyle);

            cell = headerRow.createCell(3);
            cell.setCellValue("Količina");
            cell.setCellStyle(headerCellStyle);

           

            // Create Other rows and cells with employees data
            int rowNum = 1;
            Row row;
            for(Usluga u: obrada.read()){

                row = sheet.createRow(rowNum++);

                row.createCell(0)
                .setCellValue(u.getNaziv());

                row.createCell(1)
                .setCellValue(u.getCijena().toString());

                row.createCell(2)
                .setCellValue(u.getJedinicaMjere());

                row.createCell(3)
                .setCellValue(u.getKolicina().toString());

              

            }

            row = sheet.createRow(rowNum);
            cell = row.createCell(4);
            CellStyle style = workbook.createCellStyle();
            DataFormat format = workbook.createDataFormat();
            style.setDataFormat(format.getFormat("0.00"));
            cell.setCellStyle(style);
            //                      cell.setCellFormula("sum(A2:A" + (rowNum) + ")");

            // Resize all columns to fit the content size
            for (int i = 0; i < 4; i++) {
                sheet.autoSizeColumn(i);
            }

            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream(jfc.getSelectedFile());
            workbook.write(fileOut);
            fileOut.close();

            // Closing the workbook
            workbook.close();

            ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", jfc.getSelectedFile().getAbsolutePath());
            builder.redirectErrorStream(true);
            Process p = builder.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    @Override
    public void napuniModel(){
        var u= obrada.getEntitet();
        
        
        //naziv
       u.setNaziv(txtNaziv.getText());
       
       //cijena
            try {
            u.setCijena(
                    BigDecimal.valueOf(
                    df.parse(
                            txtCijena.getText())
                            .doubleValue()
                    )
            );
        } catch (Exception e) {
            u.setCijena(BigDecimal.ZERO);
        }
        
      //jedinica mjere     
    
       u.setJedinicaMjere(txtJedinicaMjere.getText());
    
    
       //količina
       
           try {
            u.setKolicina(
                    BigDecimal.valueOf(
                    df.parse(
                            txtKolicina.getText())
                            .doubleValue()
                    )
            );
        } catch (Exception e) {
            u.setKolicina(BigDecimal.ZERO);
        }
       
//     btnBrisi.setVisible(false);
//        if(u.getPosjete()==null || u.getPosjete().isEmpty()){
//            btnBrisi.setVisible(true);
//        }
    
    }
    
    
    
   @Override 
    public void napuniView(){
        var u= obrada.getEntitet();
        txtNaziv.setText(u.getNaziv());
        
        try {
          txtCijena.setText(df.format(u.getCijena()));  
        } catch (Exception e) {
            txtCijena.setText(" ");
        }
        
        txtJedinicaMjere.setText(u.getJedinicaMjere());
        
        try {
             txtKolicina.setText(df.format(u.getKolicina())); 
        } catch (Exception e) {
            txtKolicina.setText(" "); //ako je u bazi null ispisat će prazno polje
        }
      
          
        
         DefaultListModel<Posjeta> m = new DefaultListModel<>();
        int ukupno=0;
        if(u.getPosjete()!=null && !u.getPosjete().isEmpty()){
            for(Posjeta p : u.getPosjete()){
                ukupno+=p.getDjeca().size();
                m.addElement(p);
            }
        }

//        lblUkupnoDjecePoUsluzi.setText("Ukupno djece po posjetama: " + ukupno);
    
        
        
        
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisi;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Usluga> lstPodaci;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtJedinicaMjere;
    private javax.swing.JTextField txtKolicina;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
}
