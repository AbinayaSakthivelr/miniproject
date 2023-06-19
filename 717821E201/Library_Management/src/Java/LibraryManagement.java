package Java;
import java.sql.*;
public class LibraryManagement {
	private static Connection con;
	private static Statement st;
	private static ResultSet rs;
	public static void create()throws SQLException,ClassNotFoundException
	{
		con=DB_Util.getConnection();
	    st=con.createStatement();
		st.execute("ceate table Library_(libraryid int(15),libraryName varchar2(20),address varchar2(50)");
	}
	public static void insert() throws SQLException,ClassNotFoundException
	{
		 con=DB_Util.getConnection();
		 st=con.createStatement();	
		 st.executeUpdate("insert into Library_ values(1,'BRITISH COUNCIL LIBRARY','SECRETARIAT ROAD.HYDERABAD-500063')");
		 st.executeUpdate("insert into Library_ values(2,'CENTRAL LIBRARY TEZPUR UNIVERSITY','YOUSUFGUDA,HYDERABAD-784028')");
		 st.executeUpdate("insert into Library_ values(3,'CENTRAL LIBRARY','I.I.T.GUWATI.GUWAHATI-781039')");
		 st.executeUpdate("insert into Library_ values(4,'KHUDA BAKSH ORIENTAL LIBRARY','ASHIK RAJPATH,PATNA-800004')");
	}
	public static void show()throws SQLException,ClassNotFoundException
	{
		con=DB_Util.getConnection();
	    st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from library");
	    while(rs.next())
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	public static void update()throws SQLException,ClassNotFoundException
	{
		con=DB_Util.getConnection();
		st=con.createStatement();
		st.executeUpdate("update Library_set libraryName='ELECTION COMMISSION OF INDIA LIBRARY' where libraryid=4");
	}
	public static void delete()throws SQLException,ClassNotFoundException
	{
		con=DB_Util.getConnection();
		st=con.createStatement();
		st.executeUpdate("delete from Library_where libraryName='KHUDA BAKSH ORIENTAL LIBRARY'");
	}
	
	public static void createBook()throws SQLException,ClassNotFoundException
	{
		con=DB_Util.getConnection();
	    st=con.createStatement();
		st.execute("ceate table Book(Title Varchar2(20),Author varchar2(20),Year int(30)");
	    
	}
	public static void insertBook() throws SQLException,ClassNotFoundException
	{
		 con=DB_Util.getConnection();
		 st=con.createStatement();	
		 st.executeUpdate("insert into Book values('BRAVE NEW WORLS','ALDOUS HUXLEY',2012)");
		 st.executeUpdate("insert into Book values('EMMA','JANE AUSTEN',2014)");
		 st.executeUpdate("insert into Book values('OF MICE AND MEN','JOHN STEINBECH',1937)");
		 st.executeUpdate("insert into Book values('THE GRAPES OF','JOHN STEINBECH',1939)");
			
	}
	public static void show1()throws SQLException,ClassNotFoundException
	{
		con=DB_Util.getConnection();
	    st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from Book");
	    while(rs.next())
	    	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	}
	public static void updateBook()throws SQLException,ClassNotFoundException
	{
		con=DB_Util.getConnection();
		st=con.createStatement();
		st.executeUpdate("update Book set Author= 'JANE AUSTEN'where Title='OF MICE AND MEN'");
	}
	public static void deleteBook()throws SQLException,ClassNotFoundException
	{
		con=DB_Util.getConnection();
		st=con.createStatement();
		st.executeUpdate("delete from Book where Title='EMMA'");
	}
	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		displayLibraryDetails();
		displayBookDetails();
		create();
		insert();
		show();
		show1();
		update();
		delete();
		createBook();
		insertBook();
		updateBook();
		deleteBook();
		
	}
	private static void displayLibraryDetails() {
	}
	private static void displayBookDetails() {
	}
	
	}
	
	
