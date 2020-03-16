package utility;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.omg.CORBA.portable.InputStream;

public class ConnectionManager
{
	
	public  static Connection getConnection() throws SQLException, ClassNotFoundException 
	 {
		 Class.forName("oracle.jdbc.OracleDriver");
		 Connection con;
		 con=DriverManager.getConnection("jdbc:oracle:thin:SYSTEM/root@localhost:1521:xe","system","apparao@E9");
		 
		 return con;
	 }
	 public   Properties  loadPropertiesFile() throws IOException 
	 {
		 Properties prop = new Properties();
		 InputStream in = (InputStream) ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		 prop.load(in);
		 in.close();
		 return prop;
		 
	 }
	
}
