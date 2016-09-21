/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import static interfaces.interfaz_ventab.cboCategoria;
import static interfaces.interfaz_ventab.tbventa;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.ConsultasSQL;
import paneles.JPanelBusquedaCliente;
import paneles.JPanelIngresoAbonos;
import paneles.JPanelListadoClienteCredito;
import paneles.JPanelModAbonos;
import paneles.JPanelModClienteCredito;
import paneles.JPanelNuevoClienteCredito;

/**
 *
 * @author Zoidiano
 */
public class interfaz_administracion extends javax.swing.JInternalFrame {

    ConsultasSQL sql = new ConsultasSQL();

    public interfaz_administracion() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        btnEmitir = new javax.swing.JButton();
        txtTOTAL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 147, 191));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(88, 147, 191));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir32.png"))); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_user32.png"))); // NOI18N
        BtnCancelar.setText("CANCELAR VENTA");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        btnEmitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boleta32.png"))); // NOI18N
        btnEmitir.setText("EMITIR BOLETA");
        btnEmitir.setEnabled(false);
        btnEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirActionPerformed(evt);
            }
        });

        txtTOTAL.setEnabled(false);
        txtTOTAL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTOTALFocusLost(evt);
            }
        });
        txtTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTOTALActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL:");

        txtNumVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumVentaFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUMERO DE VENTA:");

        tblistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblistado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmitir)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addComponent(btnEmitir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SISTEMA DE VENTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(440, 440, 440))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumVentaFocusLost
        sql.CargarTablaCompra(2, txtNumVenta.getText());
       int filas = tblistado.getRowCount();
       int total=0;
        for (int i = 0; i < filas; i++) {
          total=total+Integer.parseInt(tblistado.getValueAt(i,4).toString());

        }
       txtTOTAL.setText(Integer.toString(total));
       btnEmitir.setEnabled(true);
       BtnCancelar.setEnabled(true);
    }//GEN-LAST:event_txtNumVentaFocusLost

    private void txtTOTALFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTOTALFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTOTALFocusLost

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        volver();
        tblistado.removeAll();
        BtnCancelar.setEnabled(false);
        btnEmitir.setEnabled(false);
        txtTOTAL.setText("0");
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void btnEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirActionPerformed
        imprimirFactura();
        tblistado.removeAll();
        BtnCancelar.setEnabled(false);
        btnEmitir.setEnabled(false);
        txtTOTAL.setText("0");
    }//GEN-LAST:event_btnEmitirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTOTALActionPerformed
   private void volver() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblistado.getModel();
            int filas = tblistado.getRowCount();
            for (int i = 0; filas > i; i++) {
                sql.DevolverStock(Integer.parseInt(tblistado.getValueAt(0, 2).toString()), tblistado.getValueAt(0, 0).toString());
                modelo.removeRow(0);
            }
            sql.Eliminarventas(txtNumVenta.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    void imprimirFactura() {

        PrinterMatrix printer = new PrinterMatrix();
        String nombrevendedor = sql.ConsultarNombreConUser(Main.lb_user.getText());
        Extenso e = new Extenso();
        e.setNumber(101.85);
        printer.setOutSize(60, 80);
        printer.printCharAtCol(1, 1, 80, "=");  //COMIENZO LINEA COMPLETA CON ======
        printer.printTextWrap(1, 2, 30, 80, "BOLETA DE VENTA");
        printer.printTextWrap(2, 3, 1, 22, "Num. Boleta : " + "");
        printer.printTextWrap(2, 3, 25, 55, "Fecha de Emision: " + Main.fecha.getText());
        printer.printTextWrap(2, 3, 60, 80, "Hora: " + "Hoy");
        printer.printTextWrap(3, 4, 1, 80, "Vendedor.  : " + nombrevendedor);
        printer.printCharAtCol(5, 1, 80, "=");
        printer.printTextWrap(6, 1, 1, 80, "Nombre            Descripcion                   Cant.      P.Unit.      P.Total");
        printer.printCharAtCol(8, 1, 80, "-");
        int filas = tblistado.getRowCount();
        for (int i = 0; i < filas; i++) {
            printer.printTextWrap(9 + i, 10, 1, 80, tblistado.getValueAt(i, 0).toString() + "|" + tblistado.getValueAt(i, 1).toString() + "| " + tblistado.getValueAt(i, 2).toString() + "| " + tblistado.getValueAt(i, 3).toString() + "|" + tblistado.getValueAt(i, 4).toString());

        }
        printer.printCharAtCol(filas + 10, 1, 80, "=");
        printer.printTextWrap(filas + 10, filas + 2, 1, 80, "TOTAL A PAGAR " + "");

        printer.toFile("impresion2.txt");

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("impresion2.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);

        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();

        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            try {
                printJob.print(document, attributeSet);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existen impresoras instaladas");
        }
        //inputStream.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton btnEmitir;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblistado;
    private javax.swing.JTextField txtNumVenta;
    private javax.swing.JTextField txtTOTAL;
    // End of variables declaration//GEN-END:variables
}
