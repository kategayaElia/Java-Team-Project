package database;

import java.sql.Connection;

import java.sql.SQLException;


import taskmanagement.MyDbconnect;

public class Main {

	public static void main(String[] args) {
		
		Tables tabs = new Tables();
		
		try {
			Connection connection = MyDbconnect.getConnection();
			
			tabs.createTables(connection);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
