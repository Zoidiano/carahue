package metodos;

import conexion.conectar;
import interfaces.Main;
import interfaces.interfaz_administracion;
import interfaces.interfaz_inventario1;
import interfaces.interfaz_inventario_administracion;
import interfaces.interfaz_reportes;
import interfaces.interfaz_usuarios2;
import interfaces.interfaz_ventab;
//import interfaces.mostrar_busqueda;
//import interfaces.muestra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import paneles.JPanelBusquedaCliente;
import paneles.JPanelIngresoAbonos;
import paneles.JPanelListadoClienteCredito;
import paneles.JPanelModAbonos;
import paneles.JPanelModClienteCredito;
import paneles.reportes.JPanelDiax;
import paneles.reportes.JPanelVentasHoy;
import paneles.reportes.JPanelVentasMensual;
import paneles.reportes.JPanelVentasSemanal;

/*
 * @author Lucas Jara Espinoza
 * Estudiante Ingenieria en Informatica
 */
public class ConsultasSQL {

    private String CadSql = "";
    private int verificador = 0;
    Calendar cal = Calendar.getInstance();
    String fechas = cal.get(cal.DATE) + "/" + (cal.get(cal.MONTH) + 1) + "/" + cal.get(cal.YEAR);

    public boolean ConsultaUsuario(String usuario, String contraseña) { //revisado
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

    public boolean ConsultarRutCliente(String rut) {    //revisado
        {
            boolean Consulta = false;
            try {
                CadSql = "select rut from clientes where rut='" + rut + "';";
                
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
    public boolean ConsultarNombreCliente(String rut) {    //revisado
        {
            boolean Consulta = false;
            try {
                CadSql = "select nombre from clientes where rut='" + rut + "';";
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);
                while (rs.next()) {
                    JPanelModAbonos.txtNombreCliente.setText(rs.getString(1));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            return Consulta;
        }
    }
    public boolean ConsultarFechaEntrega(String num_venta) {    //revisado
        {
            boolean Consulta = false;
            try {
                CadSql = "select fecha_entrega from credito where cod_venta='" + num_venta + "';";
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);
                while (rs.next()) {
                    
                   String fecha=(rs.getString(1));
                   java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
                   java.util.Date fechaDate = formato.parse(fecha); 
                   JPanelModAbonos.txtFechaEntrega.setDate(fechaDate);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            return Consulta;
        }
    }
    static public boolean validarRut(String rut) {  //revisado
        int suma = 0;
        String dvR, dvT;
        int[] serie = {2, 3, 4, 5, 6, 7};
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        dvR = rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            suma += Integer.valueOf(rut.substring(i, i + 1))
                    * serie[(rut.length() - 2 - i) % 6];
        }
        dvT = String.valueOf(11 - suma % 11);
        if (dvT.compareToIgnoreCase("10") == 0) {
            dvT = "K";
        }

        if (dvT.compareToIgnoreCase(dvR) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String ConsultarNombre(String usuario) { //revisado
        {
            String Consulta = "";

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

    public String Consultaultimo() {    //revisado
        {
            String Consulta = "";

            try {
                CadSql = "SELECT cod_producto FROM `productos` order by cod_producto desc limit 1;";
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

    public String ConsultarNombreConUser(String usuario) { //revisado
        {
            String Consulta = "";
            try {
                CadSql = "select nombre from usuarios where user='" + usuario + "';";
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

    public String Consultatipo(String usuario) {    //revisado
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

    public void CargarRegiones() {  //revisado
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

    public void CargarCiudad(int campo) {   //revisado
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

    public void GuardarUsuario(String tipo, String nombre, String usuario, String contraseña) { //revisado
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

    public void GuardarCredito(String rut, int num_venta, int abonado, int total, String fecha) { //revisado
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO credito(rut_cliente,cod_venta,abonado,total,fecha_entrega) VALUES(?,?,?,?,?)");
            pst.setString(1, rut);
            pst.setInt(2, num_venta);
            pst.setInt(3, abonado);
            pst.setInt(4, total);
            pst.setString(5, fecha);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void GuardarCliente(String nombre, String rut, String telefono, String fecha_ingreso, int cantidad_credito) {    //revisado
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO clientes(nombre,rut,telefono,fecha_ingreso,abono,cantidad_credito) VALUES(?,?,?,?,?,?)");
            pst.setString(1, nombre);
            pst.setString(2, rut);
            pst.setString(3, telefono);
            pst.setString(4, fecha_ingreso);
            pst.setInt(5, 0);//El abono incia en 0
            pst.setInt(6, cantidad_credito);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void EliminarUsuario(String valor) { //revisado
        try {
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM usuarios WHERE  cod_user='" + valor + "'");
            pst.executeUpdate();
            CargarTablausuarios(1, valor);
        } catch (Exception ex) {
        }
    }

    public void Eliminarventas(String valor) {  //revisado
        try {
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM ordenes_pedido WHERE  cod_venta='" + valor + "'");
            pst.executeUpdate();
            pst = this.cn.prepareStatement("DELETE FROM ventas WHERE  cod_venta='" + valor + "'");
            pst.executeUpdate();
        } catch (Exception ex) {
        }
    }

    public void SetearCampos(String rut) {  //revisado
        CadSql = "SELECT nombre, rut, telefono, cantidad_credito, fecha_ingreso, abono FROM clientes where rut like'%" + rut + "%';";
        try {
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                JPanelBusquedaCliente.txtNombreCliente.setText(rs.getString(1));
                JPanelBusquedaCliente.txtRutCliente.setText(rs.getString(2));
                JPanelBusquedaCliente.txtTelefonoCliente.setText(rs.getString(3));
                JPanelBusquedaCliente.txtCreditoCliente.setText(rs.getString(4));
                JPanelBusquedaCliente.txtFechaIngresoCliente.setText(rs.getString(5));
                JPanelBusquedaCliente.txtAbonadoCliente.setText(rs.getString(6));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void SetearCamposModCliente(String rut) {    //revisado
        CadSql = "SELECT nombre, rut, telefono, cantidad_credito, fecha_ingreso, abono FROM clientes where rut like'%" + rut + "%';";
        try {
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                JPanelModClienteCredito.txtNombreMod.setText(rs.getString(1));
                JPanelModClienteCredito.txtRutMod.setText(rs.getString(2));
                JPanelModClienteCredito.txtTelefonoMod.setText(rs.getString(3));
                JPanelModClienteCredito.txtCantidadMod.setText(rs.getString(4));
                JPanelModClienteCredito.txtFechaMod.setText(rs.getString(5));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void CargarTablaClientes(int numero, String dato) {  //revisado
        int interno = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        switch (numero) {
            case 1:
                CadSql = "SELECT nombre, rut, abono, cantidad_credito FROM clientes;";
                break;
            case 2:
                CadSql = "SELECT nombre, rut, abono, cantidad_credito FROM clientes where rut like'%" + dato + "%';";
                break;
            case 3:
                CadSql = "SELECT nombre, rut, abono, cantidad_credito FROM clientes where nombre like'%" + dato + "%';";
                break;
            case 4:
                CadSql = "SELECT * FROM clientes;";
                interno = 1;
                break;
        }
        try {

            if (interno == 1) {
                modelo.addColumn("Codigo");
                modelo.addColumn("Nombre");
                modelo.addColumn("Rut");
                modelo.addColumn("Telefono");
                modelo.addColumn("Fecha Ingreso");
                modelo.addColumn("Abono");
                modelo.addColumn("Credito");
                String[] datos = new String[7];
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
                    modelo.addRow(datos);
                }
                JPanelListadoClienteCredito.tblistadoclientescredito.setModel(modelo);
            } else {

                modelo.addColumn("Nombre");
                modelo.addColumn("Rut");
                modelo.addColumn("Abono");
                modelo.addColumn("Credito");
                String[] datos = new String[4];
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    modelo.addRow(datos);
                }
                JPanelBusquedaCliente.tbClientes.setModel(modelo);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void CargarTablausuarios(int numero, String campo) { //revisado
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

    public void ModClientes(String nombre, String telefono, String cantidad, String rut) {  //revisado
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE clientes SET nombre=?, telefono=?, cantidad_credito=? WHERE rut=?;");
            pst.setString(1, nombre);
            pst.setString(2, telefono);
            pst.setString(3, cantidad);
            pst.setString(4, rut);
            pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void ModInventario(String nombre, String cantidad, String costo_individual, String precio_individual, String descripcion, String proveedor, String num_factura, String categoria) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE productos SET nom_producto=?, cantidad=?, valor_individual_producto=?, valor_individual_venta=?, descripcion=?, nom_proveedor=?, num_factura=? WHERE nom_producto=? AND categoria=?;");
            pst.setString(1, nombre);
            pst.setString(2, cantidad);
            pst.setString(3, costo_individual);
            pst.setString(4, precio_individual);
            pst.setString(5, descripcion);
            pst.setString(6, proveedor);
            pst.setString(7, num_factura);
            pst.setString(8, nombre);
            pst.setString(9, categoria);
            pst.executeUpdate();

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

    public void NuevaVenta(int cod_venta, String cod_producto, int cantidad, int valor, int precio, String nom_producto, String categoria, int cantidad2) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO ventas(cod_venta,cod_producto,cantidad,valor,precio,fecha) VALUES (?,?,?,?,?,?)");
            pst.setInt(1, cod_venta);
            pst.setString(2, cod_producto);
            pst.setInt(3, cantidad);
            pst.setInt(4, valor);
            pst.setInt(5, precio);
            pst.setString(6, fechas);
            pst.executeUpdate();
            GuardarOrdenVenta(cod_venta, cod_producto, precio);
            StockProductos(cod_producto, cantidad2, categoria);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void GuardarOrdenVenta(int codigoventa, String cod_producto, int precio) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO ordenes_pedido(cod_venta,cod_producto,precio,ganancia,fecha) VALUES (?,?,?,?)");
            pst.setInt(1, codigoventa);
            pst.setString(2, cod_producto);
            pst.setInt(3, precio);
            pst.setInt(4, precio);
            pst.setString(5, fechas);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void IngresarProductos(String cod_producto, String nombre, String descripcion, String categoria, int cantidad, int costo_individual, int venta_individual, String fecha, String nom_proveedor, String num_factura) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO productos(cod_producto,nom_producto,descripcion,categoria,cantidad,valor_individual_producto,fecha_ingreso,valor_individual_venta,nom_proveedor,num_factura) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, cod_producto);
            pst.setString(2, nombre);
            pst.setString(3, descripcion);
            pst.setString(4, categoria);
            pst.setInt(5, cantidad);
            pst.setInt(6, costo_individual);
            pst.setString(7, fecha);
            pst.setInt(8, venta_individual);
            pst.setString(9, nom_proveedor);
            pst.setString(10, num_factura);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void GuardarGanancia(int codigoventa, double monto_neto, double iva, double impuesto_adicional, double total) {
        try {

            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO ganancias(cod_venta,monto_neto,iva,impuesto_adicional,total,fecha) VALUES (?,?,?,?,?,?)");
            pst.setInt(1, codigoventa);
            pst.setDouble(2, monto_neto);
            pst.setDouble(3, iva);
            pst.setDouble(4, impuesto_adicional);
            pst.setDouble(5, total);
            pst.setString(6, fechas);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void StockProductos(String cod_producto, int cantidad, String categoria) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE productos SET cantidad=? WHERE cod_producto=?;");
            pst.setInt(1, cantidad);
            pst.setString(2, cod_producto);
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
            CargarTablaproductos(1, "", "", 0);
        } catch (Exception ex) {
        }
    }

    public boolean validarproducto(String producto, String categoria) {
        boolean validar = false;
        try {
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT cod_producto from productos where cod_producto='" + producto + "' AND categoria='" + categoria + "';");
            while (rs.next()) {
                validar = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return validar;
    }

    public void CargarTablaproductos(int numero, String campo, String categoria, int num_interno) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Valor Adquisicion");
        modelo.addColumn("Fecha LLegada");
        modelo.addColumn("Valor Venta");
        modelo.addColumn("Nombre Proveedor");
        modelo.addColumn("Num Factura");
        //Recordar cambiar tamaños
        switch (numero) {
            case 1:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta, nom_proveedor, num_factura FROM productos;";
                break;
            case 2:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta, nom_proveedor, num_factura FROM productos where categoria='" + campo + "';";
                break;
            case 3:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta, nom_proveedor, num_factura FROM productos where nom_producto like'%" + campo + "%' AND categoria='" + categoria + "';";
                break;
            case 4:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta, nom_proveedor, num_factura FROM productos where cod_producto like'%" + campo + "%' AND categoria='" + categoria + "';";
                break;
        }
        try {
            String[] datos = new String[10];
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
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                modelo.addRow(datos);
            }
            if (num_interno == 1) {
                interfaz_inventario_administracion.tbproductos1.setModel(modelo);
            } else {
                interfaz_inventario1.tbproductos.setModel(modelo);
            }
        } catch (Exception ex) {

        }
    }

    public void Consultatotalconnum_venta(int num_venta) {
        try {
            CadSql = "SELECT total from ganancias where cod_venta='" + num_venta + "';";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                JPanelIngresoAbonos.txtMontoVenta.setText(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }

    public void ConsultarCreditoDisponible(String rut, int codigo) {
        try {
            CadSql = "SELECT cantidad_credito from clientes where rut='" + rut + "';";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                if (codigo == 1) {
                    JPanelIngresoAbonos.txtCreditoDisponible.setText(rs.getString(1));
                } else {
                    JPanelModAbonos.txtCreditoDisponible.setText(rs.getString(1));
                }

            }
        } catch (Exception e) {

        }
    }

    public void CargarTablaCreditoCliente(String rut, int codigo) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NumeroVenta");
        modelo.addColumn("Abonado");
        modelo.addColumn("Total");
        CadSql = "SELECT cod_venta, abonado, total FROM credito WHERE rut_cliente='" + rut + "';";
        try {
            
            String[] datos = new String[3];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            if (codigo == 1) {
                JPanelIngresoAbonos.tblistadoclientescredito.setModel(modelo);
            } else {
                JPanelModAbonos.tblistadoclientescredito.setModel(modelo);
            }

        } catch (Exception ex) {

        }

    }

    public void CargarTabalasVentasMensuales(int mes, int anio) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CodigoVenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");
        CadSql = "SELECT cod_venta, fecha, total FROM ganancias WHERE fecha like'%" + mes + "/" + anio + "%';";
        try {
            String[] datos = new String[3];

            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            JPanelVentasMensual.tbVentasHoy.setModel(modelo);
        } catch (Exception ex) {
        }

    }

    public void CargarTablaVentasSemana(int dia1, int dia2, int dia3, int dia4, int dia5) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CodigoVenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");

        if (dia1 >= 28) {

            switch (dia1) {
                case 28:
                    CadSql = "SELECT cod_venta, fecha, total FROM ganancias WHERE fecha='" + dia1 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia2 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia3 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia4 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia5 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "';";
                    break;
                case 29:
                    CadSql = "SELECT cod_venta, fecha, total FROM ganancias WHERE fecha='" + dia1 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia2 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia3 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia4 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia5 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "';";
                    break;
                case 30:
                    CadSql = "SELECT cod_venta, fecha, total FROM ganancias WHERE fecha='" + dia1 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia2 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia3 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia4 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia5 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "';";
                    break;
                case 31:
                    CadSql = "SELECT cod_venta, fecha, total FROM ganancias WHERE fecha='" + dia1 + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia2 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia3 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia4 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia5 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "';";
                    break;

            }
        } else {
            CadSql = "SELECT cod_venta, fecha, total FROM ganancias WHERE fecha='" + dia1 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia2 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia3 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia4 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "' OR fecha='" + dia5 + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(cal.YEAR) + "';";
        }

        try {
            String[] datos = new String[3];

            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            JPanelVentasSemanal.tbVentasHoy.setModel(modelo);
        } catch (Exception ex) {

        }
    }
public void CargarTablaVentasDiax(String fecha) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CodigoVenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");
        //Recordar cambiar tamaños
        CadSql = "SELECT cod_venta, fecha, total FROM ganancias where fecha='" + fecha + "';";
        try {
            String[] datos = new String[3];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            JOptionPane.showMessageDialog(null, CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            
            JPanelDiax.tbVentasHoy.setModel(modelo);
        } catch (Exception ex) {
        
    
        }
    }
    public void CargarTablaVentas(String fecha) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CodigoVenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");
        //Recordar cambiar tamaños
        CadSql = "SELECT cod_venta, fecha, total FROM ganancias where fecha='" + fecha + "';";
        try {
            String[] datos = new String[3];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            JOptionPane.showMessageDialog(null, CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            JPanelVentasHoy.tbVentasHoy.setModel(modelo);
            
        } catch (Exception ex) {
        
    
        }
    }

    public void CargarTablaVentasDetalle(String codigo, int numero) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CodigoProducto");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");
        //Recordar cambiar tamaños
        CadSql = "SELECT p.cod_producto, p.nom_producto, v.cantidad, v.precio from productos p, ventas v where v.cod_producto=p.cod_producto and v.cod_venta='" + codigo + "';";
        try {
            String[] datos = new String[4];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            switch (numero) {
                case 1:
                    JPanelVentasHoy.tbVentasHoyDetalles.setModel(modelo);
                    break;
                case 2:
                    JPanelVentasSemanal.tbVentasHoyDetalles.setModel(modelo);
                    break;
                case 3:
                    JPanelVentasMensual.tbVentasHoyDetalles.setModel(modelo);
                    break;
                case 4:
                    JPanelDiax.tbVentasHoyDetalles.setModel(modelo);
                    break;
            }

        } catch (Exception ex) {

        }
    }

    public boolean ComprobarProductos() {
        boolean validar = false;
        CadSql = "SELECT cantidad from productos where cantidad='" + 0 + "';";
        try {
            String[] datos = new String[1];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                validar = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return validar;
    }

    public void Stockcero() {
        CadSql = "SELECT nom_producto from productos where cantidad='" + 0 + "';";
        try {
            String[] datos = new String[1];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                Main.dato = rs.getString(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void ModDato(String dato) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE `productos` SET `cantidad` = '999999' WHERE `nom_producto` =?;");
            pst.setString(1, dato);
            pst.executeUpdate();
        } catch (Exception ex) {
        }
    }
    public void ModCredito(int dato1, int dato2, String dato3, int dato4)
    {
    try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE `credito` SET abonado=?,total=?,fecha_entrega=? WHERE `cod_venta` =?;");
            pst.setInt(1, dato1);
            pst.setInt(2, dato2);
            pst.setString(3, dato3);
            pst.setInt(4, dato4);
            pst.executeUpdate();
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
                CadSql = "select p.nom_producto, p.descripcion, v.cantidad, p.valor_individual_venta, v.precio from productos p, ventas v where p.cod_producto=v.cod_producto AND v.cod_venta='" + campo + "';";
                break;
            case 2:
                CadSql = "select p.nom_producto, p.descripcion, v.cantidad, p.valor_individual_venta, v.precio from productos p, ventas v where p.cod_producto=v.cod_producto AND v.cod_venta='" + campo + "';";
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
            if(numero==1){interfaz_ventab.tbventa.setModel(modelo);}else{interfaz_administracion.tblistado.setModel(modelo);}
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void filtrar(int numero, String categoria) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Valor Adquisicion");
        modelo.addColumn("Fecha LLegada");
        modelo.addColumn("Valor Venta");
        modelo.addColumn("Nombre Proveedor");
        modelo.addColumn("Num Factura");
        switch (numero) {
            case 1:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta, nom_proveedor, num_factura FROM `productos` WHERE `categoria` = '" + categoria + "' AND `cantidad` < 10;";
                break;
            case 2:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, categoria, cantidad, valor_individual_producto, fecha_ingreso, valor_individual_venta, nom_proveedor, num_factura FROM `productos` WHERE `categoria` = '" + categoria + "' AND `cantidad` = 0;";
                break;
        }
        try {
            String[] datos = new String[10];
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
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                modelo.addRow(datos);
            }
            interfaz_inventario1.tbproductos.setModel(modelo);
        } catch (Exception ex) {
        }
    }

    public String formatear(String rut) {
        int cont = 0;
        String format;
        if (rut.length() == 0) {
            return "";
        } else {
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            format = "-" + rut.substring(rut.length() - 1);
            for (int i = rut.length() - 2; i >= 0; i--) {
                format = rut.substring(i, i + 1) + format;
                cont++;
                if (cont == 3 && i != 0) {
                    format = "." + format;
                    cont = 0;
                }
            }
            return format;
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
            case 4:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, cantidad, valor_individual_venta FROM productos where cod_producto like'%" + campo + "%' AND categoria='" + campo2 + "';";
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

    public void eliminarcredito(int numero)
    {
        try{
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM credito WHERE  cod_venta='" + numero + "'");
            pst.executeUpdate();
        }catch(Exception ex){}
    }
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
