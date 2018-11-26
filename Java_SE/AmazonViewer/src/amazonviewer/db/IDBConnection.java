package amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static amazonviewer.db.DataBase.*;

public interface IDBConnection {
	
	default Connection connectToDB() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
			if (connection != null) {
				System.out.println("Connection established :)");
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}finally {
			return connection;
		}
		
	}

}
