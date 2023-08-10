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
//	
//	private static String url = "jdbc:mysql://localhost/";
//    private static String dbName = "javaTeamProject";
//   // private static String driver = "com.mysql.cj.jdbc.Driver";
//    private static String userName = "root";
//    private static String password = "Kiutech2018@";
//    
//    public static Connection mydbconnectmtd()throws SQLException {
//            
//     return DriverManager.getConnection(url + dbName, userName, password); 
//
////            Statement stmt = connection.createStatement();
////
////            String sql;
////
////            sql = "CREATE SCHEMA javaTeamProject33";
////            stmt.executeUpdate(sql);
////
////            sql = "USE javaTeamProject33";
////            stmt.executeUpdate(sql);
//
////            sql = "CREATE TABLE employee_details" +
////                    "(id INTEGER not NULL, " +
////                    " name VARCHAR(255), " +
////                    " task VARCHAR(255), " +
////                    " PRIMARY KEY ( id ))";
////            stmt.executeUpdate(sql);
////            
////            sql = "CREATE TABLE task" +
////                    "(id INTEGER not NULL, " +
////                    " name VARCHAR(255), " +
////                    " PRIMARY KEY ( id ))";
////            stmt.executeUpdate(sql);
////            
////            sql = "CREATE TABLE team" +
////                    "(id INTEGER not NULL, " +
////                    " name VARCHAR(255), " +
////                    " team_members VARCHAR(255), " +
////                    " PRIMARY KEY ( id ))";
////            stmt.executeUpdate(sql);
////            
////            sql = "CREATE TABLE team_task" +
////                    "(id INTEGER not NULL, " +
////                    " name VARCHAR(255), " +
////                    " team_members VARCHAR(255), " +
////                    " PRIMARY KEY ( id ))";
////            stmt.executeUpdate(sql);
//
////            stmt.close();
////            conn.close();
//
////            System.out.println("Database created successfully");
//
//    }
}
