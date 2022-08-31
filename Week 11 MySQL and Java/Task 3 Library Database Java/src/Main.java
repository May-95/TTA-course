import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// creating a database object from database constructor. Parameters passed in to connect to database.
		Database db = new Database("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/library", "root", "password");
		// creating a scanner object so we can take in user's input.
		Scanner input = new Scanner(System.in);
		// String "again" is set to empty. Values will be set later when user decides whether
		// they want to run another query.
		String again = "";

		// do-while loop used because it runs at least once.
		do {
			// user presented with their options.
			System.out.println("----------------- Library Application -----------------");
			System.out.println("Select from the following options:");
			System.out.println("  1: Show all users.");
			System.out.println("  2: Show all books.");
			System.out.println("  3: Show all users that have books loaned.");
			System.out.println("  4: Show all books that are loaned by users.");
			System.out.println("  5: Show all loaned book and the users who loaned them.");
			System.out.println("  6: Show all overdue books.");
			System.out.println("  7: Custom query.");
			System.out.println("  8: Exit program.");
			System.out.print("  >> ");

			// string will store the user's option.
			String option = input.nextLine();

			// case switch used so different code is run for the different options depending
			// on the user's choice.
			switch (option) {
			case "1":
				// if user has chosen "1", query() method is run on database. This query will
				// show all the user's that the library has.
				db.query("SELECT * FROM users");
				// database's printResults() method is run. The results of the query is printed to the user.
				db.printResults();
				// user is asked if they want to continue and run another query on the library's 
				// database.
				System.out.println("\nDo you want to run another query? yes or no.");
				// user's answer is stored in "again" variable. toLowerCase() is used to make
				// comparisons easier and then we break out of the loop.
				again = input.nextLine().toLowerCase();
				break;
			case "2":
				db.query("SELECT * FROM books");
				db.printResults();
				System.out.println("\nDo you want to run another query? yes or no.");
				again = input.nextLine().toLowerCase();
				break;
			case "3":
				db.query("SELECT loaned.user_id, users.first_name, users.last_name\n" + "FROM loaned\n"
						+ "JOIN users ON loaned.user_id=users.user_id;");
				db.printResults();
				System.out.println("\nDo you want to run another query? yes or no.");
				again = input.nextLine().toLowerCase();
				break;
			case "4":
				db.query("SELECT books.title, books.author, loaned.ISBN\n" + "FROM loaned \n"
						+ "JOIN books ON loaned.ISBN=books.ISBN;");
				db.printResults();
				System.out.println("\nDo you want to run another query? yes or no.");
				again = input.nextLine().toLowerCase();
				break;
			case "5":
				db.query(
						"SELECT loaned.user_id, users.first_name, users.last_name, loaned.ISBN, books.author, books.title\n"
								+ "FROM loaned\n" + "JOIN books ON loaned.ISBN=books.ISBN\n"
								+ "JOIN users ON loaned.user_id=users.user_id;");
				db.printResults();
				System.out.println("\nDo you want to run another query? yes or no.");
				again = input.nextLine().toLowerCase();
				break;
			case "6":
				db.query("SELECT users.user_id, users.first_name, users.last_name, books.title, books.author, loaned.due_date\n"
						+ "FROM loaned\n" + "JOIN books ON loaned.ISBN=books.ISBN\n"
						+ "JOIN users ON loaned.user_id=users.user_id\n" + "WHERE due_date<CURDATE()");
				db.printResults();
				System.out.println("\nDo you want to run another query? yes or no.");
				again = input.nextLine().toLowerCase();
				break;
			case "7":
				// user asked to enter their custom query.
				System.out.println("Enter your custom query.");
				// answer stored in variable.
				String customQuery = input.nextLine();
				// query() method is run on the database with the custom query passed in as a parameter.
				db.query(customQuery);
				db.printResults();
				System.out.println("\nDo you want to run another query? yes or no.");
				again = input.nextLine().toLowerCase();
				break;
			case "8":
				// again variable is set to nothing so program can end.
				again = "";
				break;
			default:
				again = "";
				System.out.println("Error! Start again..");
			}
			// loop will run while user has chosen to run another query.
		} while (again.equals("yes"));
		input.close();
	}
}
