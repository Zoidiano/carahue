/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Zoidiano
 */
public class Main extends javax.swing.JFrame {


    public Main() {
        this.setExtendedState(MAXIMIZED_BOTH);
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

        Contenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Slider1 = new javax.swing.JMenu();
        llama_interfaz_principal = new javax.swing.JMenuItem();
        llama_interfaz_informes = new javax.swing.JMenuItem();
        Slider2 = new javax.swing.JMenu();
        llamaProducto = new javax.swing.JMenuItem();
        llamaEmpleado = new javax.swing.JMenuItem();
        llamaCliente = new javax.swing.JMenuItem();
        Slider3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Slider1.setText("Ventas");
        Slider1.setEnabled(false);

        llama_interfaz_principal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        llama_interfaz_principal.setText("Generar Venta");
        llama_interfaz_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llama_interfaz_principalActionPerformed(evt);
            }
        });
        Slider1.add(llama_interfaz_principal);

        llama_interfaz_informes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        llama_interfaz_informes.setText("Reportes Venta");
        llama_interfaz_informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llama_interfaz_informesActionPerformed(evt);
            }
        });
        Slider1.add(llama_interfaz_informes);

        jMenuBar1.add(Slider1);

        Slider2.setText("Inventario");
        Slider2.setEnabled(false);

        llamaProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        llamaProducto.setText("Inventario 1");
        llamaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaProductoActionPerformed(evt);
            }
        });
        Slider2.add(llamaProducto);

        llamaEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        llamaEmpleado.setText("Inventario 2");
        llamaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaEmpleadoActionPerformed(evt);
            }
        });
        Slider2.add(llamaEmpleado);

        llamaCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        llamaCliente.setText("Inventario 3");
        llamaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamaClienteActionPerformed(evt);
            }
        });
        Slider2.add(llamaCliente);

        jMenuBar1.add(Slider2);

        Slider3.setText("Usuarios");
        Slider3.setEnabled(false);
        Slider3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slider3ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Slider3.add(jMenuItem1);

        jMenuBar1.add(Slider3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llamaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaProductoActionPerformed

    }//GEN-LAST:event_llamaProductoActionPerformed

    private void llamaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaEmpleadoActionPerformed

    }//GEN-LAST:event_llamaEmpleadoActionPerformed

    private void llamaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamaClienteActionPerformed

    }//GEN-LAST:event_llamaClienteActionPerformed

    private void llama_interfaz_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llama_interfaz_principalActionPerformed
        interfaz_principal Form = new interfaz_principal();
        Form.setVisible(true);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llama_interfaz_principalActionPerformed

    private void llama_interfaz_informesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llama_interfaz_informesActionPerformed
        interfaz_informes Form = new interfaz_informes();
        Form.setVisible(true);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_llama_interfaz_informesActionPerformed

    private void Slider3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slider3ActionPerformed
    interfaz_usuarios Form = new interfaz_usuarios();
        Form.setVisible(true);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }//GEN-LAST:event_Slider3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    interfaz_login il = new interfaz_login();
        il.setVisible(true);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(il);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    usuarios();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void usuarios()
    {
        interfaz_usuarios2 Form = new interfaz_usuarios2();
        Form.setVisible(true);
        Contenedor.removeAll();
        Contenedor.updateUI();
        Contenedor.add(Form);
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Contenedor;
    public static javax.swing.JMenu Slider1;
    public static javax.swing.JMenu Slider2;
    public static javax.swing.JMenu Slider3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem llamaCliente;
    private javax.swing.JMenuItem llamaEmpleado;
    private javax.swing.JMenuItem llamaProducto;
    private javax.swing.JMenuItem llama_interfaz_informes;
    private javax.swing.JMenuItem llama_interfaz_principal;
    // End of variables declaration//GEN-END:variables
}
