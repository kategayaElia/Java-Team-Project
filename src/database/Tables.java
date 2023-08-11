package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tables {

	public void createTables(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();

		String sql;

		sql = "CREATE SCHEMA javaTeamProject129";
		statement.executeUpdate(sql);

		sql = "USE javaTeamProject129";
		statement.executeUpdate(sql);

		String createTableSQL1 = "CREATE TABLE IF NOT EXISTS Employee_details (" + "id INTEGER not NULL, "
				+ " name VARCHAR(255), " + " employeeTeam VARCHAR(255), " + " PRIMARY KEY ( id ))";
		statement.executeUpdate(createTableSQL1);

		String createTableSQL2 = "CREATE TABLE IF NOT EXISTS Task_details (" + "taskId INTEGER not NULL, "
				+ " taskName VARCHAR(255), " + " PRIMARY KEY ( taskId ))";
		statement.executeUpdate(createTableSQL2);

		String createTableSQL3 = "CREATE TABLE IF NOT EXISTS Team_details (" + "teamId INTEGER not NULL, "
				+ " teamName VARCHAR(255), " + " teamMembers VARCHAR(255), " + " PRIMARY KEY ( teamId ))";
		statement.executeUpdate(createTableSQL3);

		String createTableSQL4 = "CREATE TABLE IF NOT EXISTS TeamTask_details (" + "teamTaskId INTEGER not NULL, "
				+ " teamTaskName VARCHAR(255), " + " Team VARCHAR(255), " + " PRIMARY KEY ( teamTaskId ))";
		statement.executeUpdate(createTableSQL4);

		String createTableSQL0 = ("CREATE TABLE IF NOT EXISTS Contacts_details "
				+ " (name TEXT, phone INTEGER, email TEXT)");

		statement.executeUpdate(createTableSQL0);

		String createTableSQL5 = ("INSERT INTO Contacts_details (name, phone, email) "
				+ "VALUES('Joe', 45632, 'joe@anywhere.com')");

		statement.executeUpdate(createTableSQL5);

		String createTableSQL6 = ("INSERT INTO Contacts_details (name, phone, email) "
				+ "VALUES('Jane', 4829484, 'jane@somewhere.com')");

		statement.executeUpdate(createTableSQL6);

		statement.execute("SELECT * FROM Contacts_details");
		ResultSet results = statement.getResultSet();
		while (results.next()) {
			System.out.println(
					results.getString("name") + " " + results.getInt("phone") + " " + results.getString("email"));
			;
		}

		System.out.println(" ............... Connection to Database Successful .............. ");

	}

}
