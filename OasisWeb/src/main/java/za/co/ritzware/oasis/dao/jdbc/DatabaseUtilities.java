package za.co.ritzware.oasis.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtilities {
	
	private static String DRIVER="";
	private static String DB_URL="";
	private static String DB_USERNAME="";
	private static String DB_PASSWORD="";
	
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn= DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
			if(conn!=null) { 
				try {
					conn.close();
				} catch (SQLException e) {
			
					e.printStackTrace();
				}
				conn=null;
			}
	}
}
