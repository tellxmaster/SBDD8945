package procesos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
	public static Connection getConexion() 
	{

		String conexionURL = "jdbc:sqlserver://127.0.0.1:1433;"
				+ "database=proto8945;"
				+ "user=sa;"
				+ "password=elitslot21;"
				+ "loginTimeout=30;";
		try {
			Connection con = DriverManager.getConnection(conexionURL);
			return con;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Error Conexion: "+e.toString());
			return null;
		}
	}
}
