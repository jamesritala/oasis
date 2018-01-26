package za.co.ritzware.oasis.utils;

import java.util.ResourceBundle;

public class SystemConstants {
	public static String DB_DRIVER;
	public static String DB_URL;
	public static String DB_USERNAME;
	public static String DB_PASSWORD;
	
	static {
		ResourceBundle resources= ResourceBundle.getBundle("Database");
		DB_DRIVER= resources.getString("db_driver");
		DB_URL= resources.getString("db_url");
		DB_USERNAME= resources.getString("db_user");
		DB_PASSWORD= resources.getString("db_password");
	}
	
}
