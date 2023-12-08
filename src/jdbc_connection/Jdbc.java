package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class Jdbc {
	public static void main(String[] args) throws Exception {
//		1. Link jar file with your project.
		
//		2. Load Driver.class into memory with "Fully qualified name(class name with package name)"
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		3. Establish the connection with "Database Engine"
		String path = "jdbc:mysql://localhost:3306/yashdb";
		String username = "yash";
		String password = "root";
		Connection c = DriverManager.getConnection(path, username, password);
		
//		Checking if connection is successful or not
		if(c!=null) {
			System.out.println("Connection Successful");
		}
		else {
			System.out.println("Not Connected");
		}
	}
}
