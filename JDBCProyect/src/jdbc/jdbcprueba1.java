package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcprueba1 {

	public static void main(String[] args) {
        //aca voy a poner los pasos para conectarme a una base de datos
        //1- levantar el driver
        try {
            //2- Establezco una conexion
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini_arg", "root", "admin");
            //3- creamos la sentencia
            Statement sql = con.createStatement();
            //4- ejecuto la consulta
            ResultSet rs = sql.executeQuery("select employee_id,first_name, last_name, salary from employees ");
            //sql.execute(otroSql) -- insert update, delete,....

            //5- muestro los resultados

 

            while(rs.next()) {
                System.out.println("id="+ rs.getInt("employee_id"));
                System.out.println("first_name="+ rs.getString("first_name"));
                System.out.println("last_name="+ rs.getString("last_name"));
                System.out.println("salary="+ rs.getFloat("salary"));
                System.out.println("-------------------------------------");
            }
            sql.close();
            con.close();

 

        } catch (ClassNotFoundException | SQLException e) {            
            e.printStackTrace();
        }
    }
}
