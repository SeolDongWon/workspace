package seoulApi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBcon {
	public static Connection getConnection() throws Exception {
		Connection connection = null;
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;

		fileInputStream = new FileInputStream("apiTest/seoulApi/seoulApiTest.properties");
		properties.load(fileInputStream);

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);

		System.out.println("연결성공");
		return connection;

	}

	public static void main(String[] args) throws Exception {
		getConnection();
	}
}
