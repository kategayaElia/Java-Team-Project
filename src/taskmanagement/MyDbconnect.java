package taskmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbconnect {

	private static final String URL = "jdbc:mysql://localhost:3306/javaTeamProject";
	private static final String USER = "root";
	private static final String PASSWORD = "Kiutech2018@";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

}
