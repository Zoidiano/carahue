package pruebaempresa;

import interfaces.Main;
import interfaces.interfaz_principal;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class PruebaEmpresa {

    public static void main(String[] args) {
     try{
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//agradable a la vista
        //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); //estilo metalico
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//estilo Windows
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); // estilo Windows viejo
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
     
//       interfaz_principal ip =new interfaz_principal();
//        ip.setLocationRelativeTo(null);
//        ip.setVisible(true);
//        interfaz_login il = new interfaz_login();
//        il.setLocationRelativeTo(null);
//        il.setVisible(true);
        Main mn = new Main();
        mn.setVisible(true);
    } 
    
}
    
