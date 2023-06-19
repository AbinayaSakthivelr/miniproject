package Java;
import java.sql.*;
public class DB_Util {
	static Connection con;
	public static Connection createConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:Mysql@127.0.0.1:3306/library_db","root","Cat@1001");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}
