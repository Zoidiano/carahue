package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/*
 * @author Lucas Jara Espinoza
 * Estudiante Ingenieria en Informatica
 */
public class conectar
{
Connection conectar = null; 
  public Connection conexion()
  {
      
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      this.conectar = DriverManager.getConnection("jdbc:mysql://localhost/carahue", "root", "");
    }
    catch (Exception e)
    {
    System.out.print(e.getMessage());
    }
    return this.conectar;
  }
}
