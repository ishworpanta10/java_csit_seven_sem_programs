import java.sql.*;

public class StudentFetchDemo {

//	function to connect db
	public static Connection setConnection() {
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/student_db";
		String username = "root";
		String password = "";

//		need to load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		connect to db

		try {
			conn = DriverManager.getConnection(databaseURL, username, password);
			System.out.println("Database Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

//	fetching data from db
	public void fetchData() throws SQLException {
		Connection conn = setConnection();
		Statement statement = conn.createStatement();
		String sql = "SELECT * FROM student WHERE district='kathmandu'";
		ResultSet result = statement.executeQuery(sql);
		System.out.println("Student from Kathmandu District are :");
		
//		ResultSetMetaData metadata = result.getMetaData();
//		int col = metadata.getColumnCount();
//		
//		for(int i =1 ; i <= col ; i++)
//			System.out.printf("%-8s\t", metadata.getColumnName(i));
//				System.out.println();

				
		while (result.next()) {
//			for(int  i  = 1; i<= col ; i++) 
//				System.out.printf("%-8s\t", result.getObject(i));
//				System.out.println();
			
			
//			String data = result.getString(1);
			String data = result.getString("name");
			System.out.println(data);

		}
	}

	public static void main(String[] args) throws SQLException {
//		StudentFetchDemo.setConnection();
		StudentFetchDemo demo = new StudentFetchDemo();
		demo.fetchData();
	}

}
