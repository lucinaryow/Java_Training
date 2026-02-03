package M5_Activity3;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String URL = "jdbc:postgresql://localhost:5432/m5_activity3";
	private static final String USER = "mjqlucinario";
	private static final String PASS = "";

	public static Connection getConnetion() throws Exception {
		return DriverManager.getConnection(URL, USER, PASS);
	}
}
