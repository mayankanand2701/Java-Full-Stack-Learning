// Step 1 : Importing
import java.sql.*;

public class DemoJDBC
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		/*
		 * Import Package
		 * Load and Register
		 * Create Connection
		 * Create Statement
		 * Execute Statement
		 * Process and Results
		 * Close
		 */
		
		String url="jdbc:postgresql://localhost:5432/demo";
		String userName="postgres";
		String password="root";
		String query="select sname from student where sid=1";
		String query1="select * from student";
		
		// Step 2 : Load and Register (Optional Step)
		Class.forName("org.postgresql.Driver");
		
		// Step 3: Create Connection
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("Connection Stablished with Databse!");
		
		// Step 4 : Execute Statement
		Statement st=con.createStatement();
		
		// CRUD Operations
		
		// -------------------------------------------------------------------------
		// READ
		
		// ResultSet rs=st.executeQuery(query1);
		
		// Query 1
        // System.out.println("Do the table has data for relevant query  "+rs.next());
        // String name=rs.getString("sname");
        // System.out.println("Name of the Student is "+name);
		
		// Query 2
		// To print the entire table
		// while(rs.next())
		// {
		// 	System.out.println(rs.getInt("sid")+"  "+rs.getString("sname")+"  "+rs.getInt("marks"));
		// }
		
		
		// --------------------------------------------------------------------------
		// CREATE (Insert)
		
		
		
		
		
		
		// Step 6 : Close
		con.close();
		System.out.println("Connection Closed with Database!");
	}
}
