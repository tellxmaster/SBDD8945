
package procesos;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import procesos.Conexion;
import procesos.Usuario;

public class GestionUsuario {
    
    
    private String generarCodigo( String tipoUsr){
       int numero = (int) (Math.random() * 100000 + 1);
       return tipoUsr+"00"+numero;
    }
    
    public boolean registrarUsuario( Usuario usr )
    {   
        String codigo     = generarCodigo((usr.getId_tipo() == 1) ? "L" : "D"),
               username   = usr.getUsuario(),
               password   = usr.getPassword(),
               nombre     = usr.getNombre(),
               fecha_nac  = usr.getFecha_nac(),
               telefono   = usr.getTelefono(),
               email      = usr.getCorreo(),
               ultima_con = "";
        int    tipo_usr   = usr.getId_tipo(),
               estado     = usr.getEstado();
        try {
            Statement sql = Conexion.getConexion().createStatement();
            String consulta = "insert into usuario values ('"+codigo+"','"+username+"','"+password+"','"+nombre+"','"+fecha_nac+"','"+telefono+"','"+email+"','"+tipo_usr+"','"+ultima_con+"','"+estado+"');";
            sql.execute(consulta);  
            return true;
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error Conexion: "+e.toString());
            return false;
	}
    }
    
    public int comprobarUsuario(String usuario) {
        int base = 0;
        try {
            Statement sql = Conexion.getConexion().createStatement();
            String consulta = "SELECT dbo.comprobarUsuario('" + usuario + "')";
            ResultSet resultado = sql.executeQuery(consulta);

            while (resultado.next()) {
                base = resultado.getByte(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Conexion: " + ex.toString());
        }
        return base;
    }
    
    public int comprobarContra(String usuario, String passwd){
        int res=0;
        try {
            Statement sql = Conexion.getConexion().createStatement();
            String consulta = "SELECT dbo.f_comprobarPassword('"+usuario+"','"+passwd+"')";
            ResultSet resultado = sql.executeQuery(consulta);
            while (resultado.next()) {
                res = resultado.getByte(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        return res;    
    }
    
  
   public int comprobarTipoUsr( String usr){
   int base = 0;
        try {
            Statement sql = Conexion.getConexion().createStatement();
            String consulta = "SELECT dbo.f_comprobarTipoUsr('" + usr +"')";
            ResultSet resultado = sql.executeQuery(consulta);

            while (resultado.next()) {
                base = resultado.getInt(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        return base;    
    }
   


    public boolean comprobarEmail(String correo)
    {
        //Patron  para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();
    } 
}
