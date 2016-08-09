package metodos;

import conexion.conectar;
import interfaces.interfaz_inventario1;
import interfaces.interfaz_inventario_administracion;
import interfaces.interfaz_usuarios2;
import interfaces.interfaz_ventab;
//import interfaces.mostrar_busqueda;
//import interfaces.muestra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * @author Lucas Jara Espinoza
 * Estudiante Ingenieria en Informatica
 */
public class ConsultasSQL {

    private String CadSql = "";
    private int verificador = 0;

    public boolean ConsultaUsuario(String usuario, String contraseña) {
        {
            boolean Consulta = false;
            try {
                CadSql = "select user, password from usuarios where user='" + usuario + "' && password='" + contraseña + "';";
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);

                while (rs.next()) {
                    Consulta = true;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            return Consulta;
        }
    }

    public String ConsultarNombre(String usuario) {
        {
            String Consulta = "vacio";
            try {
                CadSql = "select user from usuarios where user='" + usuario + "';";
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);

                while (rs.next()) {
                    Consulta = rs.getString(1);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            return Consulta;
        }
    }

    public String Consultatipo(String usuario) {
        {
            String Consulta = "";
            try {
                CadSql = "select tipo from usuarios where user='" + usuario + "';";
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);

                while (rs.next()) {
                    Consulta = rs.getString(1);

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            return Consulta;
        }
    }

    public void CargarRegiones() {
        try {
            CadSql = "Select des_region from regiones;";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                //    interfaz_principal.cboRegionFactura.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void CargarCiudad(int campo) {
        try {
            CadSql = "SELECT des_ciudad FROM ciudad WHERE cod_provincia =" + campo + ";";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                //       interfaz_principal.cboCiudadFactura.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void GuardarUsuario(String tipo, String nombre, String usuario, String contraseña) {
        try {

            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO usuarios(cod_user,user,password,nombre,tipo) VALUES (?,?,?,?,?)");
            pst.setString(1, null);
            pst.setString(2, usuario);
            pst.setString(3, contraseña);
            pst.setString(4, nombre);
            pst.setString(5, tipo);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Creado Correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void EliminarUsuario(String valor) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM usuarios WHERE  cod_user='" + valor + "'");
            pst.executeUpdate();
            CargarTablausuarios(1, valor);
        } catch (Exception ex) {
        }
    }

    public void Eliminarventas(String valor) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM ordenes_pedido WHERE  cod_venta='" + valor + "'");
            pst.executeUpdate();
            pst = this.cn.prepareStatement("DELETE FROM ventas WHERE  cod_venta='" + valor + "'");
            pst.executeUpdate();
        } catch (Exception ex) {
        }
    }

    public void CargarTablausuarios(int numero, String campo) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        switch (numero) {
            case 1:
                CadSql = "SELECT * FROM usuarios;";
                break;
            case 2:
                CadSql = "SELECT * FROM usuarios where categoria=" + campo + ";";
                break;
            case 3:
                CadSql = "SELECT * FROM usuarios where nombre like'%" + campo + "%';";
                break;
        }
        try {
            String[] datos = new String[5];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            interfaz_usuarios2.tbUsuarios.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void ModProducto(String valor, String usuario, String contrasena, String nombre, String tipo) {

        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE usuarios SET cod_user=?, user=?, password=?, nombre=?, tipo=? WHERE cod_user=?;");
            pst.setString(1, valor);
            pst.setString(2, usuario);
            pst.setString(3, contrasena);
            pst.setString(4, nombre);
            pst.setString(5, tipo);
            pst.setString(6, valor);
            pst.executeUpdate();
            CargarTablausuarios(1, "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void ModUsuarios(String valor, String usuario, String contrasena, String nombre, String tipo) {

        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE usuarios SET cod_user=?, user=?, password=?, nombre=?, tipo=? WHERE cod_user=?;");
            pst.setString(1, valor);
            pst.setString(2, usuario);
            pst.setString(3, contrasena);
            pst.setString(4, nombre);
            pst.setString(5, tipo);
            pst.setString(6, valor);
            pst.executeUpdate();
            CargarTablausuarios(1, "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
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

    public void NuevaVenta(int cod_venta, int cantidad, int valor, int precio, int cod_producto, String categoria, int cantidad2) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO ventas(cod_venta,cod_producto,cantidad,valor,precio) VALUES (?,?,?,?,?)");
            pst.setInt(1, cod_venta);
            pst.setInt(2, cod_producto);
            pst.setInt(3, cantidad);
            pst.setInt(4, valor);
            pst.setInt(5, precio);
            pst.executeUpdate();
            GuardarOrdenVenta(cod_venta, cod_producto, precio);
            StockProductos(cod_producto, cantidad2, categoria);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void GuardarOrdenVenta(int codigoventa, int cod_producto, int precio) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO ordenes_pedido(cod_venta,cod_producto,precio,ganancia) VALUES (?,?,?,?)");
            pst.setInt(1, codigoventa);
            pst.setInt(2, cod_producto);
            pst.setInt(3, precio);
            pst.setInt(4, precio);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void IngresarProductos(int cod_producto, String nombre, String descripcion, String categoria, int cantidad, int costo_individual, int venta_individual, String fecha) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO productos(cod_producto,nom_producto,descripcion,categoria,cantidad,valor_individual_producto,fecha_ingreso,valor_individual_venta) VALUES (?,?,?,?,?,?,?,?)");
            pst.setInt(1, cod_producto);
            pst.setString(2, nombre);
            pst.setString(3, descripcion);
            pst.setString(4, categoria);
            pst.setInt(5, cantidad);
            pst.setInt(6, costo_individual);
            pst.setString(7, fecha);
            pst.setInt(8, venta_individual);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void GuardarGanancia(int codigoventa, double monto_neto, double iva, double impuesto_adicional, double total) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO ganancias(cod_venta,monto_neto,iva,impuesto_adicional,total) VALUES (?,?,?,?,?)");
            pst.setInt(1, codigoventa);
            pst.setDouble(2, monto_neto);
            pst.setDouble(3, iva);
            pst.setDouble(4, impuesto_adicional);
            pst.setDouble(5, total);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void StockProductos(int cod_producto, int cantidad, String categoria) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE productos SET cantidad=? WHERE cod_producto=?;");
            pst.setInt(1, cantidad);
            pst.setString(2, String.valueOf(cod_producto));
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void guardarRecuperacion(String id, String cantidad) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO recuperacion(id_recuperacion,cantidad) VALUES (?,?)");
            pst.setString(0, id);
            pst.setString(1, cantidad);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void DevolverStock(int cantidad, String nombre) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE productos SET cantidad=cantidad+? WHERE NOM_producto=?;");
            pst.setInt(1, cantidad);
            pst.setString(2, nombre);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void EliminarProducto(String nombre, String categoria) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM productos where nom_producto='" + nombre + "' AND categoria='" + categoria + "';");
            pst.executeUpdate();
            CargarTablaproductos(1, "", 0);
        } catch (Exception ex) {
        }
    }

    public boolean validarNombre(String nombre, String categoria) {
        boolean validar = false;
        try {
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nom_producto from productos where nom_producto='" + nombre + "' AND categoria='" + categoria + "';");
            while (rs.next()) {
                validar = true;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return validar;
    }

    public void CargarTablaproductos(int numero, String campo, int num_interno) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Valor Adquisicion");
        modelo.addColumn("Fecha LLegada");
        modelo.addColumn("Valor Venta");
        //Recordar cambiar tamaños
        switch (numero) {
            case 1:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta FROM productos;";
                break;
            case 2:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta FROM productos where categoria='" + campo + "';";
                break;
            case 3:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta FROM productos where nom_producto like'%" + campo + "%';";
                break;
        }
        try {
            String[] datos = new String[8];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                modelo.addRow(datos);
            }
            if (num_interno == 1) {
                interfaz_inventario_administracion.tbproductos.setModel(modelo);
            } else {
                interfaz_inventario1.tbproductos.setModel(modelo);
            }
        } catch (Exception ex) {

        }
    }

    public void CargarTablaCompra(int numero, String campo) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Valor");
        switch (numero) {
            case 1:
                CadSql = "select p.nom_producto, p.descripcion, v.cantidad, p.valor_individual_venta, v.precio from productos p, ventas v where p.id_producto=v.cod_producto AND v.cod_venta='" + campo + "';";
                break;
            case 2:
                CadSql = "";
                break;
        }
        try {
            String[] datos = new String[5];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            interfaz_ventab.tbventa.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void CargarTablaListadoProductos(int numero, String campo, String campo2) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Valor Producto");
        //Recordar cambiar tamaños
        switch (numero) {
            case 1:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, cantidad, valor_individual_venta FROM productos where categoria='" + campo + "';";
                break;
            case 2:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, cantidad, valor_individual_venta FROM productos where nom_producto like'%" + campo + "%' AND categoria='" + campo2 + "';";
                break;
            case 3:
                CadSql = "select id_producto, cantidad from productos where categoria='" + campo + "';";
                break;
        }
        try {
            if (numero == 3) {
                String[] datos = new String[2];
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);
                while (rs.next()) {
                    guardarRecuperacion(rs.getString(1), rs.getString(2));
                }

            } else {
                String[] datos = new String[5];
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    modelo.addRow(datos);
                }
            }
            interfaz_ventab.tbproductosListado.setModel(modelo);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

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
