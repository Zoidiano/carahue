/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import interfaces.Main;
import interfaces.interfaz_usuarios2;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import metodos.ConsultasSQL;

/**
 *
 * @author Zoidiano
 */
public class JPanelModAbonos extends javax.swing.JPanel {

    ConsultasSQL sql = new ConsultasSQL();
    public int tipo = 1; //Solamente busqueda y detalle
    String fecha = "";
    int año = 0;
    int mes = 0;
    int dia = 0;

    public JPanelModAbonos() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelNuevoCredito = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRutCredito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCreditoDisponible = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAbonadoCredito = new javax.swing.JTextField();
        cbolimpiarrut = new javax.swing.JButton();
        lblCredito = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistadoclientescredito = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNumerodeVenta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtAbonado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNuevoAbono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDeuda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtFechaEntrega = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(88, 147, 191));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        JPanelNuevoCredito.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("DATOS CLIENTE:");

        jLabel6.setText("RUT:");

        txtRutCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutCreditoFocusLost(evt);
            }
        });

        jLabel7.setText("CREDITO DISPONIBLE:");

        txtCreditoDisponible.setEnabled(false);

        jLabel10.setText("ABONADO TOTAL:");

        txtAbonadoCredito.setEnabled(false);

        cbolimpiarrut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar32.png"))); // NOI18N
        cbolimpiarrut.setText("LIMPIAR");
        cbolimpiarrut.setEnabled(false);
        cbolimpiarrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbolimpiarrutActionPerformed(evt);
            }
        });

        lblCredito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCredito.setText("CREDITO DEL CLIENTE");

        tblistadoclientescredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Venta", "Abonado", "Total"
            }
        ));
        tblistadoclientescredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistadoclientescreditoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblistadoclientescredito);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));

        jLabel8.setText("NOMBRE CLIENTE:");

        txtNombreCliente.setEnabled(false);

        BtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar32.png"))); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setEnabled(false);
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir32.png"))); // NOI18N
        BtnCancelar.setText("CERRAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar32.png"))); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.setEnabled(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        jLabel9.setText("NUMERO VENTA:");

        txtNumerodeVenta.setEnabled(false);

        jLabel13.setText("ABONADO:");

        txtAbonado.setEnabled(false);

        jLabel14.setText("TOTAL A PAGAR:");

        txtTotal.setEnabled(false);

        jLabel15.setText("NUEVO ABONADO:");

        txtNuevoAbono.setEnabled(false);
        txtNuevoAbono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNuevoAbonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevoAbonoKeyTyped(evt);
            }
        });

        jLabel16.setText("DEUDA:");

        txtDeuda.setEnabled(false);

        jLabel17.setText("FECHA ENTREGA:");

        txtFechaEntrega.setDateFormatString("dd/MM/yyyy");
        txtFechaEntrega.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNuevoAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDeuda))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)
                                .addComponent(txtNumerodeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(211, 211, 211)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumerodeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNuevoAbono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCancelar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanelNuevoCreditoLayout = new javax.swing.GroupLayout(JPanelNuevoCredito);
        JPanelNuevoCredito.setLayout(JPanelNuevoCreditoLayout);
        JPanelNuevoCreditoLayout.setHorizontalGroup(
            JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRutCredito))
                            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCreditoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAbonadoCredito))
                            .addComponent(cbolimpiarrut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                .addComponent(lblCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        JPanelNuevoCreditoLayout.setVerticalGroup(
            JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRutCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCreditoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbonadoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbolimpiarrut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JPanelNuevoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelNuevoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutCreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutCreditoFocusLost
        try {
            if (sql.validarRut(txtRutCredito.getText())) {
                //cambiar formato rut 00.000.000-0
                String rut = txtRutCredito.getText();
                txtRutCredito.setText(sql.formatear(rut));
                //consulta existencia rut
                if (sql.ConsultarRutCliente(txtRutCredito.getText())) {
                    sql.CargarTablaCreditoCliente(txtRutCredito.getText(), 2);
                    int abonototal = 0;
                    int fila = tblistadoclientescredito.getRowCount();
                    for (int i = 0; i < fila; i++) {
                        abonototal = abonototal + Integer.parseInt(tblistadoclientescredito.getValueAt(i, 1).toString());
                    }
                    txtAbonadoCredito.setText(Integer.toString(abonototal));
                    sql.ConsultarCreditoDisponible(txtRutCredito.getText(), 2);

                    sql.ConsultarNombreCliente(txtRutCredito.getText());
                    //mostrar campos
                    // sql.SetearCamposModCliente(txtRutMod.getText());
                    //  habilitar();
                } else {
                    JOptionPane.showMessageDialog(null, "El rut del cliente no se encuentra registrado");
                    // desabilitar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Rut ingresado no es valido");
                txtRutCredito.setText("");
                //desabilitar();

            }
        } catch (Exception e) {
            txtRutCredito.setText("");
        }
    }//GEN-LAST:event_txtRutCreditoFocusLost

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Main.llama_interfaz_linea_credito.doClick();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void tblistadoclientescreditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistadoclientescreditoMouseClicked
        int fila = this.tblistadoclientescredito.getSelectedRow();
        //int numero = Integer.parseInt(tbproductosListado.getValueAt(fila, 3).toString());
        txtNumerodeVenta.setText(tblistadoclientescredito.getValueAt(fila, 0).toString());
        txtAbonado.setText(tblistadoclientescredito.getValueAt(fila, 1).toString());
        txtTotal.setText(tblistadoclientescredito.getValueAt(fila, 2).toString());
        txtNuevoAbono.setEnabled(true);
        cbolimpiarrut.setEnabled(true);
        sql.ConsultarFechaEntrega(tblistadoclientescredito.getValueAt(fila, 0).toString());
        BtnModificar.setEnabled(true);
        BtnLimpiar.setEnabled(true);
    }//GEN-LAST:event_tblistadoclientescreditoMouseClicked

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        try {
            año = txtFechaEntrega.getCalendar().get(Calendar.YEAR);
            mes = txtFechaEntrega.getCalendar().get(Calendar.MONTH) + 1;
            dia = txtFechaEntrega.getCalendar().get(Calendar.DAY_OF_MONTH);
            fecha = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(año);
            if (txtDeuda.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "La deuda se encuentra pagada");
            sql.ModCredito(Integer.parseInt(txtAbonado.getText()) + Integer.parseInt(txtNuevoAbono.getText()), Integer.parseInt(txtTotal.getText()), fecha, Integer.parseInt(txtNumerodeVenta.getText()));
            sql.eliminarcredito(Integer.parseInt(txtNumerodeVenta.getText()));
            sql.CargarTablaCreditoCliente(txtRutCredito.getText(), 2);
            Limpiar();
            BtnModificar.setEnabled(false);
            BtnLimpiar.setEnabled(false);
        } else if (txtFechaEntrega.isEnabled()) {
            sql.ModCredito(Integer.parseInt(txtAbonado.getText()) + Integer.parseInt(txtNuevoAbono.getText()), Integer.parseInt(txtTotal.getText()), fecha, Integer.parseInt(txtNumerodeVenta.getText()));
            sql.CargarTablaCreditoCliente(txtRutCredito.getText(), 2);
            BtnModificar.setEnabled(false);
            BtnLimpiar.setEnabled(false);
            Limpiar();
        } else {
            Object[] opciones = {"Si", "No"};
            int eleccion = JOptionPane.showOptionDialog(null, "¿Desea cambiar la fecha?", "Mensaje de Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Si");
            if (eleccion == JOptionPane.YES_OPTION) {
                txtFechaEntrega.setEnabled(true);
            } else {
                sql.ModCredito(Integer.parseInt(txtAbonado.getText()) + Integer.parseInt(txtNuevoAbono.getText()), Integer.parseInt(txtTotal.getText()), fecha, Integer.parseInt(txtNumerodeVenta.getText()));
                sql.CargarTablaCreditoCliente(txtRutCredito.getText(), 2);
                BtnModificar.setEnabled(false);
                BtnLimpiar.setEnabled(false);
                Limpiar();
            }
        }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        

    }//GEN-LAST:event_BtnModificarActionPerformed

    private void txtNuevoAbonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoAbonoKeyTyped


    }//GEN-LAST:event_txtNuevoAbonoKeyTyped

    private void txtNuevoAbonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoAbonoKeyReleased
        try {
            int total = Integer.parseInt(txtTotal.getText());
            int Abonado = Integer.parseInt(txtAbonado.getText());
            int Nuevo_Abono = Integer.parseInt(txtNuevoAbono.getText());
            int deuda = (total) - (Abonado + Nuevo_Abono);
            txtDeuda.setText(Integer.toString(deuda));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtNuevoAbonoKeyReleased

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void cbolimpiarrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbolimpiarrutActionPerformed
        txtCreditoDisponible.setText("");
        txtAbonadoCredito.setText("");
        txtNombreCliente.setText("");
        txtNumerodeVenta.setText("");
        txtAbonado.setText("");
        txtNumerodeVenta.setText("");
        Limpiar();
        BtnModificar.setEnabled(false);
        BtnLimpiar.setEnabled(false);
    }//GEN-LAST:event_cbolimpiarrutActionPerformed
    void Limpiar() {
        txtNuevoAbono.setText("");
        txtDeuda.setText("");

        txtFechaEntrega.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    public static javax.swing.JPanel JPanelNuevoCredito;
    private javax.swing.JButton cbolimpiarrut;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblCredito;
    public static javax.swing.JTable tblistadoclientescredito;
    private javax.swing.JTextField txtAbonado;
    private javax.swing.JTextField txtAbonadoCredito;
    public static javax.swing.JTextField txtCreditoDisponible;
    private javax.swing.JTextField txtDeuda;
    public static com.toedter.calendar.JDateChooser txtFechaEntrega;
    public static javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNuevoAbono;
    private javax.swing.JTextField txtNumerodeVenta;
    private javax.swing.JTextField txtRutCredito;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
