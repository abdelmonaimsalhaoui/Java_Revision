package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

	public static Connection connectToDb() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String database = "addressBook";
		String userName = "root";
		String password = "";
		return DriverManager.getConnection(url + database, userName, password);
	}
}
