package za.co.ritzware.oasis.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import za.co.ritzware.oasis.utils.SystemConstants;

public class DatabaseUtilities {

	private static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(SystemConstants.DB_DRIVER);
			conn = DriverManager.getConnection(SystemConstants.DB_URL, SystemConstants.DB_USERNAME,
					SystemConstants.DB_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return conn;
	}

	private static void closeConnection(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ResultSet executeQuery(String query) {
		Statement stmt;
		ResultSet rs;
		Connection conn = getConnection();
		try {
			if (conn != null && !conn.isClosed()) {
				stmt = getConnection().createStatement();
				rs = stmt.executeQuery(query);
				return rs;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			closeConnection(conn);
		}

		return null;
	}
}
