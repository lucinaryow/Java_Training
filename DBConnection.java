package M5_Activity2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String URL = "jdbc:postgresql://localhost:5432/m5_activity2";
	private static final String USER = "mjqlucinario";
	private static final String PASS = "";

	public static Connection getConnetion() throws Exception {
		return DriverManager.getConnection(URL, USER, PASS);
	}
}
