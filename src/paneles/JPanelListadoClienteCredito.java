/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import interfaces.Main;
import interfaces.interfaz_usuarios2;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import metodos.ConsultasSQL;

/**
 *
 * @author Zoidiano
 */
public class JPanelListadoClienteCredito extends javax.swing.JPanel {

    ConsultasSQL sql = new ConsultasSQL();

    public JPanelListadoClienteCredito() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblistadoclientescredito = new javax.swing.JTable();
        lblNombreTablaClientes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 147, 191));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblistadoclientescredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Rut", "Disponibilidad Credito", "Abonado"
            }
        ));
        jScrollPane1.setViewportView(tblistadoclientescredito);

        lblNombreTablaClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombreTablaClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreTablaClientes.setText("                     LISTADO CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(lblNombreTablaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(120, 120, 120)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblNombreTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(403, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblNombreTablaClientes;
    private javax.swing.JTable tblistadoclientescredito;
    // End of variables declaration//GEN-END:variables
}
