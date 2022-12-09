package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcContactos {

	public static void main(String[] args) throws  ClassNotFoundException, SQLException{
		//aca voy a poner los pasoso para conectarme a la base de datos, nose para que es eso throws
		// 1- levantar el driveName
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2 - Establezco una conexion
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini_arg","root","admin");
		//3-creamo9s la sentebncia
	 // "select employees_id, first_name, last_name, salary from employees"
		Statement sql= con.createStatement();
		// ejecuta la consulta
		ResultSet rs = sql.executeQuery("select * from contacto");
		// sql.execute(null)
		// 5- muestra los resultados
		// System.out.println("cantidad");
		while(rs.next()) {
			System.out.println("nombre=" + rs.getString("nombre"));
			System.out.println("email=" + rs.getString("email"));

		}
		//cerrar
		sql.close();
		con.close();

	}


}
