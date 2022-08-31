import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	ResultSetMetaData rsmd;

	// database constructor that takes in driver, database, username and password as parameters. 
	public Database(String driver, String database, String username, String password)
			throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		this.conn = DriverManager.getConnection(database, username, password);
	}

	// method for running queries on the database. 
	public void query(String query) throws SQLException {
		this.stmt = this.conn.createStatement();
		this.rs = stmt.executeQuery(query);
		this.rsmd = rs.getMetaData();
	}

	// method for printing the results of the query. 
	public void printResults() throws SQLException {
		// variable stores the number of columns that the results from the query has.  
		int totalFields = this.rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= totalFields; i++) {
				// if current field is bigger than 1, a comma is added before adding the value of that field. 
				if (i > 1) {
					System.out.print(", ");
				}
				// value of the field is stored in variable and printed to the console. 
				String fieldValue = rs.getString(i);
				System.out.print(fieldValue);
			}
			// line break so the next record is on a new line. 
			System.out.println();
		}
	}
}
