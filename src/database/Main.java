package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import taskmanagement.MyDbconnect;

public class Main {

	public static void main(String[] args) {
		try {
			Connection connection = MyDbconnect.getConnection();
			createTables(connection);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createTables(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();

		String sql;

		sql = "CREATE SCHEMA javaTeamProject112";
		statement.executeUpdate(sql);

		sql = "USE javaTeamProject112";
		statement.executeUpdate(sql);

		String createTableSQL = "CREATE TABLE IF NOT EXISTS Users (" + "id INT PRIMARY KEY," + "username VARCHAR(50),"
				+ "email VARCHAR(50)" + ")";

		statement.executeUpdate(createTableSQL);	

		String createTableSQL1 = "CREATE TABLE IF NOT EXISTS Employee_details (" + "id INTEGER not NULL, "
				+ " name VARCHAR(255), " + " employeeTeam VARCHAR(255), " + " PRIMARY KEY ( id ))";
		statement.executeUpdate(createTableSQL1);

		
		String createTableSQL2 = "CREATE TABLE IF NOT EXISTS Task_details (" + "taskId INTEGER not NULL, "
				+ " taskName VARCHAR(255), " + " PRIMARY KEY ( taskId ))";
		statement.executeUpdate(createTableSQL2);
		
		
		String createTableSQL3 = "CREATE TABLE IF NOT EXISTS Team_details (" + "teamId INTEGER not NULL, "
				+ " teamName VARCHAR(255), " + " teamMembers VARCHAR(255), " +  " PRIMARY KEY ( teamId ))";
		statement.executeUpdate(createTableSQL3);
		
		
		String createTableSQL4 = "CREATE TABLE IF NOT EXISTS TeamTask_details (" + "teamTaskId INTEGER not NULL, "
				+ " teamTaskName VARCHAR(255), " + " Team VARCHAR(255), " + " PRIMARY KEY ( teamTaskId ))";
		statement.executeUpdate(createTableSQL4);
		
		
		System.out.println("Database created successfully");

		statement.close();
	}
		
		
//		MyDbconnect my = new MyDbconnect();
//		my.mydbconnectmtd();
//		
//		System.out.println("............................");
		
//		EmployeeService myemp = new EmployeeService();
//		myemp.createEmp();
//		
//		System.out.println("............................");
//		
//		TaskService myTask = new TaskService();
//		myTask.createTask();
//		
//		System.out.println("............................");
//		
//		TeamService myTeam = new TeamService();
//		myTeam.createTeam();
//		
//        System.out.println("............................");
//		
//        TeamTaskService myTeamTask = new TeamTaskService();
//		myTeamTask.createTeamTask();

	}



