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
		
		// String query="select sname from student where sid=1";
		// String query1="select * from student";
		
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
		
		// String query="insert into student values (5,'Risabh',100)";
		// boolean status=st.execute(query); // will return false but in the db data will be reflected
		// System.out.println("Data got inserted Successfully ? "+status);
		
		// --------------------------------------------------------------------------
		// UPDATE 
		// String query="update student set sname='Risav' where sid=5";
		// st.execute(query); // updated through this
		
		// ---------------------------------------------------------------------------
		// DELETE
		// String query="delete from student where sid=2";
		// st.execute(query); // deleted through this
		
		// PREDPARED STATEMENTS 
		int sid=101;
		String name="Max";
		int marks=40;
		// Using this statement we can insert the day but it looks tedious task and
		// it can lead to sql injection problem so prepared statements solve this problem
		// values are coming from input from users
		// String query="insert into student values("+sid+",'"+name+"',"+marks+")";
		String query= "insert into student values (?,?,?)";
		PreparedStatement st1=con.prepareStatement(query);
		int sid1=102;
		String name1="Raghanv";
		int marks1=90;
		st1.setInt(1, sid1);
		st1.setString(2, name1);
		st1.setInt(3, marks1);
		st1.execute(); 
		 
		// Step 6 : Close
		con.close();
		System.out.println("Connection Closed with Database!");
	}
}
