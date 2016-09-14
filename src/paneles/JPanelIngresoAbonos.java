/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import interfaces.Main;
import interfaces.interfaz_credito;
import interfaces.interfaz_usuarios2;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.NativeFunction;
import metodos.ConsultasSQL;

/**
 *
 * @author Zoidiano
 */
public class JPanelIngresoAbonos extends javax.swing.JPanel {

    ConsultasSQL sql = new ConsultasSQL();
    public int tipo = 1; //Solamente busqueda y detalle
    public ArrayList<String> numeros_venta = new ArrayList<String>();

    public JPanelIngresoAbonos() {
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
        txtMontoVenta = new javax.swing.JTextField();
        lblCredito = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistadoclientescredito = new javax.swing.JTable();
        txtNumeroVenta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnCerar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtCreditoRestante = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFechaPlazo = new javax.swing.JTextField();

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
        txtRutCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutCreditoActionPerformed(evt);
            }
        });
        txtRutCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutCreditoKeyTyped(evt);
            }
        });

        jLabel7.setText("CREDITO DISPONIBLE:");

        txtCreditoDisponible.setEnabled(false);

        jLabel10.setText("MONTO VENTA:");

        txtMontoVenta.setEnabled(false);

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
        jScrollPane1.setViewportView(tblistadoclientescredito);

        txtNumeroVenta.setEnabled(false);
        txtNumeroVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroVentaFocusLost(evt);
            }
        });
        txtNumeroVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroVentaActionPerformed(evt);
            }
        });

        jLabel12.setText("NUMERO VENTA:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar32.png"))); // NOI18N
        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnCerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir32.png"))); // NOI18N
        btnCerar.setText("CERRAR");
        btnCerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerarActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar32.png"))); // NOI18N
        jButton6.setText("INGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel17.setText("CREDITO RESTANTE");

        txtCreditoRestante.setEnabled(false);

        jLabel18.setText("FECHA PLAZO:");

        txtFechaPlazo.setEnabled(false);

        javax.swing.GroupLayout JPanelNuevoCreditoLayout = new javax.swing.GroupLayout(JPanelNuevoCredito);
        JPanelNuevoCredito.setLayout(JPanelNuevoCreditoLayout);
        JPanelNuevoCreditoLayout.setHorizontalGroup(
            JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(49, 49, 49)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btnCerar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroVenta))
                                    .addComponent(jLabel11)
                                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRutCredito))
                                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCreditoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMontoVenta))
                                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCreditoRestante)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelNuevoCreditoLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaPlazo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                                .addComponent(lblCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
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
                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelNuevoCreditoLayout.createSequentialGroup()
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRutCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumeroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCreditoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreditoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(JPanelNuevoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btnCerar)
                    .addComponent(jButton4))
                .addGap(20, 20, 20))
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
                .addComponent(JPanelNuevoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutCreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutCreditoFocusLost
        try {
            if (sql.validarRut(txtRutCredito.getText())) {
                //cambiar formato rut 00.000.000-0s
                String rut = txtRutCredito.getText();
                txtRutCredito.setText(sql.formatear(rut));
                //consulta existencia rut
                if (sql.ConsultarRutCliente(txtRutCredito.getText())) {

                    sql.CargarTablaCreditoCliente(txtRutCredito.getText(), 1);
                    int abonototal = 0;
                    int fila = tblistadoclientescredito.getRowCount();
                    for (int i = 0; i < fila; i++) {
                        abonototal = abonototal + Integer.parseInt(tblistadoclientescredito.getValueAt(i, 2).toString());
                        numeros_venta.add(tblistadoclientescredito.getValueAt(i, 0).toString());
                    }
                    txtNumeroVenta.setEnabled(true);
                    txtMontoVenta.setText("");
                    sql.ConsultarCreditoDisponible(txtRutCredito.getText(), 1);
                    int credito_disponible = Integer.parseInt(txtCreditoDisponible.getText()) - abonototal;
                    txtCreditoDisponible.setText(Integer.toString(credito_disponible));
                    //mostrar campos
                    // sql.SetearCamposModCliente(txtRutMod.getText());
                    //  habilitar();
                } else {
                    JOptionPane.showMessageDialog(null, "El rut del cliente no se encuentra registrado");
                    // desabilitar();
                }
            } else {
                
                txtRutCredito.setText("");
                //desabilitar();

            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_txtRutCreditoFocusLost

    private void txtRutCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutCreditoActionPerformed

    private void txtNumeroVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroVentaFocusLost
        try {
            if (numeros_venta.contains(txtNumeroVenta.getText())) {
                JOptionPane.showMessageDialog(null, "El numero de venta ya se encuentra registrado");
                txtNumeroVenta.setText("");
            } else {
                sql.Consultatotalconnum_venta(Integer.parseInt(txtNumeroVenta.getText()));
                int credito_restante = Integer.parseInt(txtCreditoDisponible.getText()) - Integer.parseInt(txtMontoVenta.getText());
                txtCreditoRestante.setText(Integer.toString(credito_restante));
                Calendar cal = Calendar.getInstance();
                String fechas = "";
                switch (cal.get(Calendar.MONTH) + 4) {
                    case 13:
                        fechas = cal.get(cal.DATE) + "/" + (cal.get(Calendar.MONTH) + 4 - 12) + "/" + (cal.get(cal.YEAR) + 1);
                        break;
                    case 14:
                        fechas = cal.get(cal.DATE) + "/" + (cal.get(Calendar.MONTH) + 4 - 12) + "/" + (cal.get(cal.YEAR) + 1);
                        break;
                    case 15:
                        fechas = cal.get(cal.DATE) + "/" + (cal.get(Calendar.MONTH) + 4 - 12) + "/" + (cal.get(cal.YEAR) + 1);
                        break;
                    case 16:
                        fechas = cal.get(cal.DATE) + "/" + (cal.get(Calendar.MONTH) + 4 - 12) + "/" + (cal.get(cal.YEAR) + 1);
                        break;
                    default:
                        fechas = cal.get(cal.DATE) + "/" + (cal.get(Calendar.MONTH) + 4) + "/" + cal.get(cal.YEAR);
                        break;
                }
                txtFechaPlazo.setText(fechas);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtNumeroVentaFocusLost

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (txtRutCredito.getText().equals("") || txtNumeroVenta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos necesarios");
        } else if(Integer.parseInt(txtMontoVenta.getText())>Integer.parseInt(txtCreditoDisponible.getText())) {
            JOptionPane.showMessageDialog(null, "Lo sentimos no cuenta con el credito suficiente");
        }else
        {
            sql.GuardarCredito(txtRutCredito.getText(), Integer.parseInt(txtNumeroVenta.getText()), 0, Integer.parseInt(txtMontoVenta.getText()), txtFechaPlazo.getText());
            sql.CargarTablaCreditoCliente(txtRutCredito.getText(), 1);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnCerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerarActionPerformed
        Main.llama_interfaz_linea_credito.doClick();
    }//GEN-LAST:event_btnCerarActionPerformed

    private void txtRutCreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutCreditoKeyTyped
        txtNumeroVenta.setEnabled(false);
    }//GEN-LAST:event_txtRutCreditoKeyTyped

    private void txtNumeroVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroVentaActionPerformed
    void Limpiar() {
        txtRutCredito.setText("");
        txtNumeroVenta.setText("");
        txtCreditoDisponible.setText("");
        txtMontoVenta.setText("");
        txtCreditoRestante.setText("");
        txtFechaPlazo.setText("");
        txtNumeroVenta.setEnabled(false);
        sql.CargarTablaCreditoCliente("", 1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel JPanelNuevoCredito;
    public static javax.swing.JButton btnCerar;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblCredito;
    public static javax.swing.JTable tblistadoclientescredito;
    public static javax.swing.JTextField txtCreditoDisponible;
    public static javax.swing.JTextField txtCreditoRestante;
    public static javax.swing.JTextField txtFechaPlazo;
    public static javax.swing.JTextField txtMontoVenta;
    public static javax.swing.JTextField txtNumeroVenta;
    public static javax.swing.JTextField txtRutCredito;
    // End of variables declaration//GEN-END:variables
}
