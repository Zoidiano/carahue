package metodos;

import conexion.conectar;
import interfaces.interfaz_principal;
//import interfaces.mostrar_busqueda;
//import interfaces.muestra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * @author Lucas Jara Espinoza
 * Estudiante Ingenieria en Informatica
 */
public class ConsultasSQL 
{
    private String CadSql=""; 
    private int verificador=0;
    
    public boolean ConsultaUsuario(String usuario,String contraseña)
    {
    {
        boolean Consulta=false;
        try{
            CadSql="select user, password from usuarios where user='"+usuario+"' && password='"+contraseña+"';";
            JOptionPane.showMessageDialog(null, CadSql);
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);

            while (rs.next())
            {
            Consulta=true;
            }
        }
        catch(Exception ex)
        {
        JOptionPane.showMessageDialog(null, ex);
        }
        return Consulta;
    }
    }
//    
//    public boolean ConsultarRut(String rut, int numero)
//    {
//        boolean Consulta=false;
//        try{
//        CadSql="Select * from clientes where rut="+rut+";";
//        Statement st = this.cn.createStatement();
//        ResultSet rs = st.executeQuery(CadSql);
//        while (rs.next())
//        {
//        Consulta=true;
//        if(numero==2)
//            break;
//        interfaz_principal.txtNombreCliente.setText(rs.getString(2));
//        interfaz_principal.txtTelefonoCliente.setText(rs.getString(3));
//        }
//        }
//        catch(Exception ex){}
//        return Consulta;
//    }
//    public void GuardarCliente()
//    {
//       try
//        {
//          PreparedStatement pst = this.cn.prepareStatement("INSERT INTO clientes(rut,nombre_cliente,telefono) VALUES (?,?,?)");
//          pst.setString(1, interfaz_principal.txtRutCliente.getText());
//          pst.setString(2, interfaz_principal.txtNombreCliente.getText());
//          pst.setString(3, interfaz_principal.txtTelefonoCliente.getText());
//          pst.executeUpdate();
//        }
//        catch (Exception e){}
//    }
//    public void GuardarPedido()
//    {
//       try
//        {
//          PreparedStatement pst = this.cn.prepareStatement("INSERT INTO pedidos(rut_cliente,estado,progreso,fecha_de_termino,descripcion) VALUES (?,?,?,?,?)"); 
//          pst.setString(1, interfaz_principal.txtRutCliente.getText());
//          pst.setString(2, interfaz_principal.txtEstadoCliente.getText());
//          pst.setString(3, interfaz_principal.txtProgresoCliente.getText());
//          pst.setString(4, interfaz_principal.txtFechaTerminoCliente.getText());
//          pst.setString(5, interfaz_principal.txtDescripcionCliente.getText());
//          pst.executeUpdate();
//        }
//        catch (Exception e){
//        JOptionPane.showMessageDialog(null, e);}    
//    }
//    public void GuardarFactura()
//    {
//       try
//        {
//          PreparedStatement pst = this.cn.prepareStatement("INSERT INTO factura(rut,nombre_factura,giro,telefono,ciudad,region,direccion) VALUES (?,?,?,?,?,?,?)");
//          pst.setString(1, interfaz_principal.txtRutFactura.getText());
//          pst.setString(2, interfaz_principal.txtNombre_Factura.getText());
//          pst.setString(3, interfaz_principal.txtGiroFactura.getText());
//          pst.setString(4, interfaz_principal.txtTelefonoFactura.getText());
//          pst.setString(5, interfaz_principal.cboCiudadFactura.getSelectedItem().toString());
//          pst.setString(6, interfaz_principal.cboRegionFactura.getSelectedItem().toString());
//          pst.setString(7, interfaz_principal.txtDireccion.getText());
//          pst.executeUpdate();
//        }
//        catch (Exception e){}    
//    }
//    public void CargarRegiones()
//    {   
//        try
//        {
//           CadSql="Select des_region from regiones;";
//           Statement st = this.cn.createStatement();
//           ResultSet rs = st.executeQuery(CadSql);
//           while (rs.next())
//            {
//                interfaz_principal.cboRegionFactura.addItem(rs.getString(1));
//            }
//        }
//        catch(Exception ex)
//        {
//            JOptionPane.showMessageDialog(null, ex);
//        }   
//    }
//    public void CargarCiudad(int campo)
//    {   
//        try
//        {
//           CadSql="SELECT des_ciudad FROM ciudad WHERE cod_provincia ="+campo+";";
//           Statement st = this.cn.createStatement();
//           ResultSet rs = st.executeQuery(CadSql);
//           while (rs.next())
//            {
//                interfaz_principal.cboCiudadFactura.addItem(rs.getString(1));
//            }
//        }
//        catch(Exception ex)
//        {
//            JOptionPane.showMessageDialog(null, ex);
//        }   
//    }
    
//    public void CargarTablaClientes(int numero,String campo)
//    {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("Rut");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Telefono");
//            switch(numero){
//            case 1:CadSql="SELECT * FROM clientes;";
//            break;
//            case 2:CadSql="SELECT * FROM clientes where rut="+campo+";";
//            break;
//            case 3:CadSql="SELECT * FROM clientes where nombre_cliente like'%"+campo+"%';";
//            break;
//                }
//        try
//        {
//            String[] datos = new String[3];
//            Statement st = this.cn.createStatement();
//            ResultSet rs = st.executeQuery(CadSql);
//             while (rs.next())
//          {
//            datos[0] = rs.getString(1);
//            datos[1] = rs.getString(2);
//            datos[2] = rs.getString(3);
//            modelo.addRow(datos);
//          }
//             mostrar_busqueda.tbclientes.setModel(modelo);
//        }
//        catch(Exception ex)
//        {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }
    public void CargarTablaProductos(int numero,String campo)
    {
        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("CodigoProducto");
//        modelo.addColumn("Cantidad");
//        modelo.addColumn("Categoria");
//        modelo.addColumn("Valor Producto");
//        modelo.addColumn("Fecha LLegada");
            switch(numero){
            case 1:CadSql="SELECT * FROM productos;";
            break;
            case 2:CadSql="SELECT * FROM productos where categoria="+campo+";";
            break;
            case 3:CadSql="SELECT * FROM clientes where nombre_cliente like'%"+campo+"%';";
            break;
                }
        try
        {
            String[] datos = new String[5];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
             while (rs.next())
          {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            modelo.addRow(datos);
          }
             interfaces.interfaz_inventario.tbproductos.setModel(modelo);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
//
//    public void CargarTablaFactura(int numero, String campo)
//    {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("Codigo");
//        modelo.addColumn("Rut");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Giro");
//        modelo.addColumn("Telefono");
//        modelo.addColumn("Region");
//        modelo.addColumn("Ciudad");
//        modelo.addColumn("Direccion");
//        switch(numero){
//            case 1:CadSql="SELECT * FROM factura";
//                break;
//            case 2:CadSql="SELECT * FROM factura where rut="+campo+";";
//                break;
//            case 3:CadSql="SELECT * FROM factura where nombre_factura like '%"+campo+"%';";
//                break;    
//        }
//        try
//        {
//            String[] datos = new String[8];
//            Statement st = this.cn.createStatement();
//            ResultSet rs = st.executeQuery(CadSql);
//             while (rs.next())
//          {
//            datos[0] = rs.getString(1);
//            datos[1] = rs.getString(2);
//            datos[2] = rs.getString(3);
//            datos[3] = rs.getString(4);
//            datos[4] = rs.getString(5);
//            datos[5] = rs.getString(6);
//            datos[6] = rs.getString(7);
//            datos[7] = rs.getString(8);
//            modelo.addRow(datos);
//          }
//            mostrar_busqueda.tbfactura.setModel(modelo);
//            int[] anchos = {50, 100, 130, 150, 100, 140, 100, 124};
//            for(int i = 0; i < mostrar_busqueda.tbfactura.getColumnCount(); i++) {
//                mostrar_busqueda.tbfactura.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//            }
//        }
//        catch(Exception ex)
//        {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }
//    public void CargarTablaDePedidos(int numero,String campo)
//    {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("Codigo");
//        modelo.addColumn("Rut");
//        modelo.addColumn("Estado");
//        modelo.addColumn("Progreso");
//        modelo.addColumn("Fecha de Termino");
//        modelo.addColumn("Descripcion");
//        switch(numero){
//            case 1:CadSql="SELECT * FROM pedidos";
//                break;
//            case 2:CadSql="SELECT * FROM pedidos where rut_cliente="+campo+";";
//                break;
//        }
//        try
//        {
//            String[] datos = new String[6];
//            Statement st = this.cn.createStatement();
//            ResultSet rs = st.executeQuery(CadSql);
//             while (rs.next())
//          {
//            datos[0] = rs.getString(1);
//            datos[1] = rs.getString(2);
//            datos[2] = rs.getString(3);
//            datos[3] = rs.getString(4);
//            datos[4] = rs.getString(5);
//            datos[5] = rs.getString(6);
//            modelo.addRow(datos);
//          }
//            mostrar_busqueda.tbpedidos.setModel(modelo);
//        }
//        catch(Exception ex)
//        {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }
//    public void MostrarDatosCliente(String valor)
//  {
//      
//      CadSql="SELECT * FROM clientes where rut="+valor+";";
//      try{
//        Statement st = this.cn.createStatement();
//        ResultSet rs = st.executeQuery(CadSql);
//         while (rs.next())
//          {
//              muestra.txtCli1.setText(rs.getString(1));
//              muestra.txtCli2.setText(rs.getString(2));
//              muestra.txtCli3.setText(rs.getString(3));
//          }
//      }catch(Exception ex){}
//  }
//    public void MostrarDatosFactura(String valor, int numero)
//  {
//      switch(numero)
//      {
//          case 1:CadSql="SELECT * FROM factura where rut="+valor+";";
//          break;
//          case 2:CadSql="SELECT * FROM factura where codigo="+valor+";";
//          break;
//      }
//            try{
//        Statement st = this.cn.createStatement();
//        ResultSet rs = st.executeQuery(CadSql);
//        if(numero==1){
//         while (rs.next())
//          {
//              muestra.txtFact1.setText(rs.getString(1));
//              muestra.txtFact2.setText(rs.getString(2));
//              muestra.txtFact3.setText(rs.getString(3));
//              muestra.txtFact4.setText(rs.getString(4));
//              muestra.txtFact5.setText(rs.getString(5));
//              muestra.txtFact6.setText(rs.getString(6));
//              muestra.txtFact7.setText(rs.getString(7));
//              muestra.txtFact8.setText(rs.getString(8));
//          }
//        }else if(numero==2)
//        {
//            //rut,nombre,telefono,ciudad,region,direccion
//            while (rs.next())
//          {
//              interfaz_principal.txtRutFactura.setText(rs.getString(2));
//              interfaz_principal.txtNombre_Factura.setText(rs.getString(3));
//              interfaz_principal.txtTelefonoFactura.setText(rs.getString(4));
//              interfaz_principal.txtGiroFactura.setText(rs.getString(5));
//              //interfaz_principal.cboCiudadFactura.setText(rs.getString(6));
//              //interfaz_principal.cboRegionFactura.setText(rs.getString(7));
//              interfaz_principal.txtDireccion.setText(rs.getString(8));
//          }
//        }
//      }catch(Exception ex){}
//  }
//    public void MostrarDatosPedido(String valor,int numero)
//  {
//       CadSql="SELECT * FROM pedidos where codigo="+Integer.parseInt(valor)+";";
//            try{
//        Statement st = this.cn.createStatement();
//        ResultSet rs = st.executeQuery(CadSql);
//        if(numero==1){
//         while (rs.next())
//          {
//              muestra.txtPed1.setText(rs.getString(1));
//              muestra.txtPed2.setText(rs.getString(2));
//              muestra.txtPed3.setText(rs.getString(3));
//              muestra.txtPed4.setText(rs.getString(4));
//              muestra.txtPed5.setText(rs.getString(5));
//              muestra.txtPed6.setText(rs.getString(6));
//          }
//        }else if(numero==2)
//        {
//           while (rs.next())
//          {
//              //codigo,rut,estado,progreso,fecha,descripcion
//              interfaz_principal.txtRutCliente.setText(rs.getString(2));
//              ConsultarRut(rs.getString(2),1);
//              interfaz_principal.txtEstadoCliente.setText(rs.getString(3));
//              interfaz_principal.txtProgresoCliente.setText(rs.getString(4));
//              interfaz_principal.txtFechaTerminoCliente.setText(rs.getString(5));
//              interfaz_principal.txtDescripcionCliente.setText(rs.getString(6));
//          }
//        }
//      }catch(Exception ex){}
//  }
//    public void filtrar(int numero)
//    {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("Codigo");
//        modelo.addColumn("Rut");
//        modelo.addColumn("Estado");
//        modelo.addColumn("Progreso");
//        modelo.addColumn("Fecha de Termino");
//        modelo.addColumn("Descripcion");
//        switch(numero)
//        {
//            case 1:CadSql="SELECT * FROM `pedidos` WHERE `progreso` = 'TRABAJANDO';";
//                break;
//            case 2:CadSql="SELECT * FROM pedidos where 'progreso' = 'TERMINADO';";
//                break;
//            case 3:CadSql="SELECT * FROM `pedidos` WHERE `estado` = 'PAGADO'";
//                break;
//            case 4:CadSql="SELECT * FROM `pedidos` WHERE `estado` = 'NO PAGADO'";
//                break;
//        }
//        try{
//            String[] datos = new String[6];
//            Statement st = this.cn.createStatement();
//            ResultSet rs = st.executeQuery(CadSql);
//             while (rs.next())
//          {
//            datos[0] = rs.getString(1);
//            datos[1] = rs.getString(2);
//            datos[2] = rs.getString(3);
//            datos[3] = rs.getString(4);
//            datos[4] = rs.getString(5);
//            datos[5] = rs.getString(6);
//            modelo.addRow(datos);
//          }
//            mostrar_busqueda.tbpedidos.setModel(modelo);
//        }
//      catch(Exception ex){}
//    }
//    public void EliminarCliente(String valor)
//    {
//        try{
//            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM Clientes WHERE  rut='" + valor + "'");
//            pst.executeUpdate();
//            CargarTablaClientes(1, "");
//        }catch(Exception ex){}
//    }
//    public void CancelarFactura(String valor)
//    {
//            try{
//            PreparedStatement pst = this.cn.prepareStatement("UPDATE `pedidos` SET `estado` = 'CANCELADO' WHERE `pedidos`` = 4;");
//            pst.executeUpdate();
//            CargarTablaFactura(1, "");
//        }catch(Exception ex){}
//    }
//    public void CancelarPedido(String valor)
//    {
//            try{
//            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM Clientes WHERE  rut='" + valor + "'");
//            pst.executeUpdate();
//            CargarTablaDePedidos(1, "");
//        }catch(Exception ex){}
//    }
    conectar cc = new conectar();
  Connection cn = this.cc.conexion();
}